package com.yunpan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yunpan.util.BaseServlet;

/**
 * 上传下载限制操作类
 * @author pamgo
 *
 */
public class UploadAndDownLimit extends BaseServlet{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 更新限制
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void limitUpdate(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	/**
	 * 查看限制
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void limitFind(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取xml文件信息
		
		//存储信息发送给显示页面
		
		request.getRequestDispatcher("/jsps/admin/limit.jsp").forward(request,response);
	}
}
