package com.yunpan.service;

import java.util.List;

import com.yunpan.entity.FileInfo;

/**
 * 文件信息操作业务接口
 * @author pamgo
 *
 */
public interface IFileInfoService {
	
	/**
	 * 保存用户上传的文件
	 * @param userid
	 * @return
	 */
	public boolean saveFileInfo(FileInfo fileInfo);
	
	/**
	 * 根据用户id查询所有文件信息
	 */
	public List<FileInfo> findListByuserId(int userid);
	
	/**
	 * 根据文件id查询单个文件
	 * @param fileid
	 * @return
	 */
	public FileInfo findSimpleFileByid(int fileid);
	
	/**
	 * 根据文件id跟新文件信息
	 */
	public boolean updateFileInfo(FileInfo fileInfo,int fileid);
	
	/**
	 * 根据文件名和用户id模糊查询文件信息
	 */
	
	public List<FileInfo> findListByfilename(int userid,String filename);
	
	/**
	 * 根据文件id删除文件
	 * @param fileid
	 * @return
	 */
	public boolean deleteFileByid(int fileid);
	
	/**
	 * 根据文件名查询文件path
	 * @param filename
	 * @return
	 */
	public String findPathByFilename(String filename);
	
	/**
	 * 根据文件id查询用户id
	 * @param fileid
	 * @return
	 */
	public int findUseridByFileid(int fileid);
	
	/**
	 * 查询所有用户上的文件
	 * @return
	 */
	public List<FileInfo> findAllFileinfo();
}
