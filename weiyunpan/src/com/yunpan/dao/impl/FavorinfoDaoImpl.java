package com.yunpan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yunpan.dao.IFavorinfoDao;
import com.yunpan.db.DBUtil;
import com.yunpan.db.IResultSetUtil;
import com.yunpan.entity.Favorinfo;
import com.yunpan.entity.FileInfo;

/**
 * 收藏文件操作接口类
 * @author pamgo
 *
 */
public class FavorinfoDaoImpl implements IFavorinfoDao {

	/**
	 * 收藏文件
	 */
	@Override
	public boolean addFavor(int userid,FileInfo fileInfo) {
		String sql = "insert into favorinfo(favor_userid,file_id) values(?,?)";
		return DBUtil.executeUpdate(sql,userid,fileInfo.getId()) > 0;
	}

	/**
	 * 根据用户id查询所有收藏
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Favorinfo> findByuserid(int userid) {
		String sql = "select id ,favor_userid,file_id from favorinfo where favor_userid = ?";
		return (List<Favorinfo>) DBUtil.executeQuery(sql, new IResultSetUtil() {
			List<Favorinfo> favorinfos = new ArrayList<Favorinfo>();
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				while(rs.next()){
					Favorinfo favorinfo = new Favorinfo();
					favorinfo.setId(rs.getInt(1));
					favorinfo.setFavor_id(rs.getInt(2));
					favorinfo.setFile_id(rs.getInt(3));
					favorinfos.add(favorinfo);
				}
				return favorinfos;
			}
		}, userid);
	}

	/**
	 * 根据用户id联合查询
	 * @param fileid
	 * @param userid
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FileInfo> findByFileidAndUserid(int userid) {
		String sql = "SELECT f.id,f.filename,f.size,f.path,f.change_time,f.show_pic,f.fileuser FROM yp_fileinfo f INNER JOIN favorinfo fa WHERE f.id = fa.file_id AND fa.favor_userid = ?";
		return (List<FileInfo>) DBUtil.executeQuery(sql, new IResultSetUtil() {
			List<FileInfo> fileInfos = new ArrayList<FileInfo>();
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				while(rs.next()){
					FileInfo fileInfo = new FileInfo();
					fileInfo.setId(rs.getInt(1));
					fileInfo.setFilename(rs.getString(2));
					fileInfo.setSize(rs.getLong(3));
					fileInfo.setPath(rs.getString(4));
					fileInfo.setChange_time(rs.getString(5));
					fileInfo.setShow_pic(rs.getString(6));
					fileInfo.setFileuser(rs.getString(7));
					fileInfos.add(fileInfo);
				}
				return fileInfos;
			}
		}, userid);
	}

	/**
	 * 根据文件id取消相应文件的收藏
	 */
	@Override
	public boolean cancelFileFavor(int userid,int fileid) {
		String sql = "delete from favorinfo where favor_userid = ? and file_id = ?";
		return DBUtil.executeUpdate(sql,userid, fileid) > 0;
	}

}
