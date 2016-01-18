package com.yunpan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yunpan.entity.DiskInfo;
import com.yunpan.entity.FileInfo;
import com.yunpan.service.IDiskInfoService;
import com.yunpan.service.IFileInfoService;
import com.yunpan.service.IFileShareService;
import com.yunpan.service.IUserService;
import com.yunpan.service.impl.DiskInfoServiceImpl;
import com.yunpan.service.impl.FileInfoServiceImpl;
import com.yunpan.service.impl.FileShareServiceImpl;
import com.yunpan.service.impl.UserServiceImpl;
import com.yunpan.util.BaseServlet;
import com.yunpan.util.ConstantUtils;

/**
 * 负责另类请求操作 解决设计前期存在的逻辑上问题
 * 
 * @author pamgo
 * 
 */
public class RedirectBase extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 主页请求
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void mainForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		getDiskInfo(request);
		request.getRequestDispatcher("/jsps/main.jsp").forward(request,
				response);
	}

	/**
	 * 网盘请求
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void panForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 查询所有文件信息
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		IUserService userService = new UserServiceImpl();
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		Integer userid = userService.getUserIdByUsername(username);
		List<FileInfo> fileLists = fileInfoService.findListByuserId(userid
				.intValue());
		// 保存所有文件信息
		request.setAttribute("fileLists", fileLists);
		getDiskInfo(request);
		request.getRequestDispatcher("/jsps/pic.jsp")
				.forward(request, response);
	}

	private void getDiskInfo(HttpServletRequest request) {
		// 异步请求刷新记录
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		IUserService userService = new UserServiceImpl();
		int userid = userService.getUserIdByUsername(username);
		IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
		DiskInfo diskInfo = diskInfoService.load(userid);
		request.setAttribute("diskInfo", diskInfo);
	}
	
	/**
	 * 分享请求
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void isShareForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取所有已分享的文件
		IFileShareService fileShareService = new FileShareServiceImpl();
		List<FileInfo> shareLists = fileShareService.findAllFileIsShare(2);
		//获得上传用户名,分享的用户问题
		request.setAttribute("shareLists", shareLists);
		request.getRequestDispatcher("/jsps/shareForward.jsp").forward(request, response);
	}
}
