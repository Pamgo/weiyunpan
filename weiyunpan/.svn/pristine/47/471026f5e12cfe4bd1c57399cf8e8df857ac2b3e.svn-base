package com.yunpan.service;

import java.util.List;

import com.yunpan.entity.FileInfo;

/**
 * 文件分享业务操作接口
 * @author pamgo
 *
 */
public interface IFileShareService {

	/**
	 * 根据用户id以及文件id分享对应的文件
	 * @param userid
	 * @param fileid
	 * @return
	 */
	public boolean shareFile(FileInfo fileInfo,int userid,int fileid);
	
	/**
	 * 查询所有已分享的文件
	 * @param isShare
	 * @return
	 */
	public List<FileInfo> findAllFileIsShare(int isShare);
	
	/**
	 * 查询当前用户所有已分享的文件
	 * @param isShare
	 * @return
	 */
	public List<FileInfo> findAllFileIsShareByuserid(int userid,int isShare);
}
