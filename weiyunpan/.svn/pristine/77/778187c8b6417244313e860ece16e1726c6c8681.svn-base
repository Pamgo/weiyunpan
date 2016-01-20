package com.yunpan.service;

import java.util.List;

import com.yunpan.entity.FileLimit;

/**
 * 处理xml文件的业务接口
 * @author pamgo
 *
 */
public interface IHandleXMLFileService {
	
	/**
	 * 解析xml文件内容到实体类中
	 * @return
	 * @throws Exception 
	 */
	public List<FileLimit> parseXMLtoLimit(String path) throws Exception;
	
	/**
	 * 更新xml文件内容
	 * @param fileSize
	 * @param allfileSize
	 * @param allowType
	 * @param bannedType
	 * @throws Exception 
	 */
	public void updateFileLimit(long fileSize,long allfileSize,String allowType,String bannedType,String path) throws Exception;
}
