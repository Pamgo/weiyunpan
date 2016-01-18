package com.yunpan.service.impl;

import com.yunpan.dao.IFolderInfoDao;
import com.yunpan.dao.impl.FolderInfoDaoImpl;
import com.yunpan.entity.FoldlerInfo;
import com.yunpan.service.IFoldlerInfoService;

/**
 * 文件夹业务操作类
 * @author pamgo
 *
 */
public class FoldlerInfoServiceImpl implements IFoldlerInfoService {

	/**
	 * 根据用户id查询文件夹信息
	 */
	@Override
	public FoldlerInfo findByUserName(int userid) {
		IFolderInfoDao folderInfoDao = new FolderInfoDaoImpl();
		return folderInfoDao.findByUserName(userid);
	}

}
