package com.yunpan.test;

import java.util.List;

import org.junit.Test;

import com.yunpan.entity.FileLimit;
import com.yunpan.service.IHandleXMLFileService;
import com.yunpan.service.impl.HandleXMLFileServiceImpl;


public class HandleXMLFileTest {

	@Test
	public void testupdate() throws Exception{
		IHandleXMLFileService fileService = new HandleXMLFileServiceImpl();
		fileService.updateFileLimit(1, 2, "jpg", "jsp","");
	}
	
	@Test
	public void testList() throws Exception{
		IHandleXMLFileService fileService = new HandleXMLFileServiceImpl();
		List<FileLimit> fileLimits = fileService.parseXMLtoLimit("");
		for(FileLimit fileLimit: fileLimits){
			System.out.println("id:"+fileLimit.getId());
			System.out.println("所有文件大小："+fileLimit.getAllfileSize());
			System.out.println("限制文件类型："+fileLimit.getDeniedType());
			System.out.println("允许上传文件大小:"+fileLimit.getFileType());
		}
	}
}
