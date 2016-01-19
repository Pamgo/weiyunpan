package com.yunpan.dao;

import java.util.List;

import com.yunpan.entity.FileLimit;

/**
 * 处理xml文件的dao接口
 * @author pamgo
 *
 */
public interface IHandleXMLFileDao {
	
	/**
	 * 解析xml文件内容到实体类中
	 * @return
	 */
	public List<FileLimit> parseXMLtoLimit() throws Exception;
	
	/**
	 * 更新xml文件内容
	 * @param fileSize
	 * @param allfileSize
	 * @param allowType
	 * @param bannedType
	 */
	public void updateFileLimit(String fileSize,String allfileSize,String allowType,String bannedType) throws Exception;
}
