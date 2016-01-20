package com.yunpan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.yunpan.entity.FileLimit;
import com.yunpan.service.IHandleXMLFileService;
import com.yunpan.service.impl.HandleXMLFileServiceImpl;
import com.yunpan.util.BaseServlet;

/**
 * 上传下载限制操作类
 * 
 * @author pamgo
 * 
 */
public class UploadAndDownLimit extends BaseServlet {
	private Logger logging = Logger.getLogger(UploadAndDownLimit.class);
	private static final long serialVersionUID = 1L;

	/**
	 * 更新限制
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void limitUpdate(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fileSize = request.getParameter("fileSize").trim();
		String simpleSize=null;
		if(fileSize.contains(".")){
			int end = fileSize.indexOf(".");
			simpleSize = fileSize.substring(0, end);
		}else if("".equals(fileSize)||fileSize==null){
			simpleSize = "500"; //默认500KB
		}else{
			simpleSize = fileSize;
		}
		String allfileSize = request.getParameter("allfileSize").trim();
		String allSize = null;
		if(allfileSize.contains(".")){
			int end = allfileSize.indexOf(".");
			allSize = allfileSize.substring(0,end);
		}else if("".equals(allfileSize)||allfileSize==null){
			allSize = "1"; //默认为1M
		}else{
			allSize = allfileSize;
		}
		String fileType = request.getParameter("fileType").trim();
		String deniedType = request.getParameter("deniedType").trim();
		IHandleXMLFileService fileService = new HandleXMLFileServiceImpl();
		String path = request.getSession().getServletContext().getRealPath("WEB-INF/classes/filelimit.xml");
		try {
			fileService.updateFileLimit(Long.parseLong(simpleSize)*1024*1024, Long.parseLong(allSize)*1024*1024*1024, fileType, deniedType,path);
		} catch (Exception e) {
			logging.error(e.getMessage());
		}
		request.getRequestDispatcher("/UploadAndDownLimit.do?method=limitFind").forward(request, response);
	}

	/**
	 * 查看限制
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 * @throws Exception
	 */
	public void limitFind(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取xml文件信息
		IHandleXMLFileService fileService = new HandleXMLFileServiceImpl();
		String path = request.getSession().getServletContext().getRealPath("WEB-INF/classes/filelimit.xml");
		List<FileLimit> fileLimits = null;
		try {
			fileLimits = fileService.parseXMLtoLimit(path);
		} catch (Exception e) {
			logging.error(e.getMessage());
		}
		FileLimit fileLimit = fileLimits.get(0);
		// 存储信息发送给显示页面
		request.setAttribute("fileLimit", fileLimit);
		request.getRequestDispatcher("/jsps/admin/limit.jsp").forward(request,
				response);
	}
}
