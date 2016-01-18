package com.yunpan.service.impl;

import java.util.List;

import com.yunpan.dao.IFileShareDao;
import com.yunpan.dao.impl.FileShareDaoImpl;
import com.yunpan.entity.FileInfo;
import com.yunpan.service.IFileShareService;

/**
 * 文件分享业务操作类
 * @author pamgo
 *
 */
public class FileShareServiceImpl implements IFileShareService {

	/**
	 * 根据用户id以及文件id更新文件信息
	 */
	@Override
	public boolean shareFile(FileInfo fileInfo, int userid, int fileid) {
		IFileShareDao fileShareDao = new FileShareDaoImpl();
		return fileShareDao.shareFile(fileInfo, userid, fileid);
	}

	/**
	 * 根据分享状态查询所有已分享文件
	 */
	@Override
	public List<FileInfo> findAllFileIsShare(int isShare) {
		IFileShareDao fileShareDao = new FileShareDaoImpl();
		return fileShareDao.findAllFileIsShare(isShare);
	}

	/**
	 * 根据当前用户查询已分享的文件
	 */
	@Override
	public List<FileInfo> findAllFileIsShareByuserid(int userid, int isShare) {
		IFileShareDao fileShareDao = new FileShareDaoImpl();
		return fileShareDao.findAllFileIsShareByuserid(userid, isShare);
	}

}
