package com.yunpan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yunpan.entity.DiskInfo;
import com.yunpan.service.IDiskInfoService;
import com.yunpan.service.impl.DiskInfoServiceImpl;
import com.yunpan.util.BaseServlet;

/**
 * 网盘操作类
 * 
 * @author pamgo
 * 
 */
public class DiskHandleServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 查询网盘信息
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void findDiskinfo(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
		List<DiskInfo> diskInfos = diskInfoService.findDiskInfo();
		request.setAttribute("diskInfos", diskInfos);
		
		request.getRequestDispatcher("/jsps/admin/space.jsp").forward(request, response);
		
	}
	
	/**
	 * 根据网盘id更新网盘信息
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void updateDiskinfo(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		int userid = Integer.parseInt(request.getParameter("uid"));
		System.out.println(userid);
		long wpsize = Long.parseLong(request.getParameter("size"));
		String dw = request.getParameter("rid");
		if(dw.equals("1")){
			wpsize = wpsize*1024;
		}else{
			wpsize = wpsize*1024*1024*1024;
		}
		IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
		boolean updatedisk = diskInfoService.updateDisk(wpsize, userid);
		if(updatedisk){
			System.out.println("更新成功！");
			request.getRequestDispatcher("/DiskHandleServlet.do?method=findDiskinfo").forward(request, response);
		}
		
	}
}
