package com.yunpan.service.impl;

import java.util.List;

import com.yunpan.dao.IHandleXMLFileDao;
import com.yunpan.dao.impl.HandleXMLFileDaoImpl;
import com.yunpan.entity.FileLimit;
import com.yunpan.service.IHandleXMLFileService;

/**
 * 操作xml业务实现类
 * @author pamgo
 *
 */
public class HandleXMLFileServiceImpl implements IHandleXMLFileService {

	/**
	 * 解析xml文件内容到实体类中
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<FileLimit> parseXMLtoLimit(String path) throws Exception {
		IHandleXMLFileDao handleXMLFileDao = new HandleXMLFileDaoImpl();
		return handleXMLFileDao.parseXMLtoLimit(path);
	}

	/**
	 * 更新xml文件内容
	 * @param fileSize
	 * @param allfileSize
	 * @param allowType
	 * @param bannedType
	 * @throws Exception 
	 */
	@Override
	public void updateFileLimit(long fileSize, long allfileSize,
			String allowType, String bannedType,String path) throws Exception {
		IHandleXMLFileDao handleXMLFileDao = new HandleXMLFileDaoImpl();
		handleXMLFileDao.updateFileLimit(fileSize, allfileSize, allowType, bannedType,path);
	}

}
