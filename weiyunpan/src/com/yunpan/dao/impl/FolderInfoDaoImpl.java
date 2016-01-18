package com.yunpan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yunpan.dao.IFolderInfoDao;
import com.yunpan.db.DBUtil;
import com.yunpan.db.IResultSetUtil;
import com.yunpan.entity.FileInfo;
import com.yunpan.entity.FoldlerInfo;
import com.yunpan.entity.User;

/**
 * 文件夹操作接口类
 * 
 * @author pamgo
 * 
 */
public class FolderInfoDaoImpl implements IFolderInfoDao {

	/**
	 * 为用户创建一个原始文件夹
	 * 
	 * @return
	 */
	@Override
	public boolean createFolderByUser(FoldlerInfo folder, User user) {
		String sql = "insert into yp_folderinfo(foldername,create_userid,path,parent_path,create_time) values(?,?,?,?,?)";
		return DBUtil.executeUpdate(sql, folder.getFoldername(), user.getId(),
				folder.getPath(), folder.getParent_path(),
				folder.getCreated_time()) > 0;
	}

	/**
	 * 根据用户名称获取文件夹信息
	 */
	@Override
	public FoldlerInfo findByUserName(int userid) {
		String sql = "select foldername,path,parent_path from yp_folderinfo where create_userid = ?";
		
		return (FoldlerInfo) DBUtil.executeQuery(sql, new IResultSetUtil() {
			
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				if(rs.next()){
					FoldlerInfo foldlerInfo = new FoldlerInfo();
					foldlerInfo.setFoldername(rs.getString(1));
					foldlerInfo.setPath(rs.getString(2));
					foldlerInfo.setParent_path(rs.getString(3));
					return foldlerInfo;
				}
				return null;
			}
		}, userid);
	}
	


}
