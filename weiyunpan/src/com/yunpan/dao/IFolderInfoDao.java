package com.yunpan.dao;

import com.yunpan.entity.FoldlerInfo;
import com.yunpan.entity.User;

/**
 * 文件夹操作接口
 * @author pamgo
 * @version v1.0
 */
public interface IFolderInfoDao {
	
	/**
	 * 用户注册，为用户创建一个文件夹
	 * @param folder
	 */
	public boolean createFolderByUser(FoldlerInfo folder,User user);
	
	/**
	 * 根据用户id查询文件夹信息
	 * @param userid
	 * @return
	 */
	public FoldlerInfo findByUserName(int userid);
}
