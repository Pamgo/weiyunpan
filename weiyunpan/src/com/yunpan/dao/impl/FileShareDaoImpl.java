package com.yunpan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yunpan.dao.IFileShareDao;
import com.yunpan.db.DBUtil;
import com.yunpan.db.IResultSetUtil;
import com.yunpan.entity.FileInfo;

/**
 * 文件分享操作类
 * @author pamgo
 *
 */
public class FileShareDaoImpl implements IFileShareDao {

	/**
	 * 根据用户id以及文件id分享文件
	 */
	@Override
	public boolean shareFile(FileInfo fileInfo,int userid, int fileid) {
		String sql = "update yp_fileinfo set isshare = ? where create_user = ? and id = ?";
		return DBUtil.executeUpdate(sql, fileInfo.getIsshare(),userid,fileid) > 0;
	}

	/**
	 * 查询所有已分享的文件
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FileInfo> findAllFileIsShare(int isShare) {
		String sql = "select id,filename,size,path,isshare,isfavorite,create_user,change_time,show_pic,fileuser from yp_fileinfo where isshare = ? ";
		return (List<FileInfo>) DBUtil.executeQuery(sql, new IResultSetUtil() {
			List<FileInfo> shareLists = new ArrayList<FileInfo>();
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				while(rs.next()){
					FileInfo fileInfo = new FileInfo();
					fileInfo.setId(rs.getInt(1));
					fileInfo.setFilename(rs.getString(2));
					fileInfo.setSize(rs.getLong(3));
					fileInfo.setPath(rs.getString(4));
					fileInfo.setIsshare(rs.getInt(5));
					fileInfo.setIsfavorite(rs.getInt(6));
					fileInfo.setCreate_user(rs.getInt(7));
					fileInfo.setChange_time(rs.getString(8));
					fileInfo.setShow_pic(rs.getString(9));
					fileInfo.setFileuser(rs.getString(10));
					shareLists.add(fileInfo);
				}
				return shareLists;
			}
		}, isShare);
	}

	/**
	 * 查询当前用户所有一分享的文件
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FileInfo> findAllFileIsShareByuserid(int userid, int isShare) {
		String sql = "select id,filename,size,path,isshare,isfavorite,create_user,change_time,show_pic from yp_fileinfo where create_user = ? and isshare = ? ";
		return (List<FileInfo>) DBUtil.executeQuery(sql, new IResultSetUtil() {
			List<FileInfo> shareLists = new ArrayList<FileInfo>();
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				while(rs.next()){
					FileInfo fileInfo = new FileInfo();
					fileInfo.setId(rs.getInt(1));
					fileInfo.setFilename(rs.getString(2));
					fileInfo.setSize(rs.getLong(3));
					fileInfo.setPath(rs.getString(4));
					fileInfo.setIsshare(rs.getInt(5));
					fileInfo.setIsfavorite(rs.getInt(6));
					fileInfo.setCreate_user(rs.getInt(7));
					fileInfo.setChange_time(rs.getString(8));
					fileInfo.setShow_pic(rs.getString(9));
					shareLists.add(fileInfo);
				}
				return shareLists;
			}
		},userid, isShare);
	}

}
