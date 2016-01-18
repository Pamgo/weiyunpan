package com.yunpan.service.impl;

import java.util.List;

import com.yunpan.dao.IFileInfoDao;
import com.yunpan.dao.impl.FileInfoDaoImpl;
import com.yunpan.entity.FileInfo;
import com.yunpan.service.IFileInfoService;

/**
 * 文件信息操作业务类
 * @author pamgo
 *
 */
public class FileInfoServiceImpl implements IFileInfoService {
	
	/**
	 * 保存用户上传文件的信息
	 */
	@Override
	public boolean saveFileInfo(FileInfo fileInfo) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.saveFileInfo(fileInfo);
	}

	/**
	 * 根据用户id查询用户所有文件信息
	 */
	@Override
	public List<FileInfo> findListByuserId(int userid) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findListByuserId(userid);
	}
	
	/**
	 * 根据文件id查询单个文件信息
	 */
	@Override
	public FileInfo findSimpleFileByid(int fileid) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findSimpleFileByid(fileid);
	}

	/**
	 * 根据文件id更新文件信息
	 */
	@Override
	public boolean updateFileInfo(FileInfo fileInfo, int fileid) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao .updateFileInfo(fileInfo, fileid);
	}

	/**
	 * 根据用户id以及用户名模糊查询文件信息
	 */
	@Override
	public List<FileInfo> findListByfilename(int userid, String filename) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findListByfilename(userid, filename);
	}

	/**
	 * 根据文件id删除文件信息
	 */
	@Override
	public boolean deleteFileByid(int fileid) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.deleteFileByid(fileid);
	}

	/**
	 * 根据文件名查询文件path
	 * @param filename
	 * @return
	 */
	@Override
	public String findPathByFilename(String filename) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findPathByFilename(filename);
	}

	/**
	 * 根据文件id查询用户id
	 */
	@Override
	public int findUseridByFileid(int fileid) {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findUseridByFileid(fileid);
	}

	/**
	 * 查询所有用户上传的文件
	 */
	@Override
	public List<FileInfo> findAllFileinfo() {
		IFileInfoDao fileInfoDao = new FileInfoDaoImpl();
		return fileInfoDao.findAllFileinfo();
	}

}
