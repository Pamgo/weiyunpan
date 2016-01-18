package com.yunpan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.yunpan.entity.DiskInfo;
import com.yunpan.service.IDiskInfoService;
import com.yunpan.service.IUserService;
import com.yunpan.service.impl.DiskInfoServiceImpl;
import com.yunpan.service.impl.UserServiceImpl;
import com.yunpan.util.BaseServlet;
import com.yunpan.util.StringHelper;

/**
 * 用户操作控制类
 * 
 * @author pamgo
 * 
 */
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	Logger logging = Logger.getLogger(UserServlet.class);

	/**
	 * 用户登录
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		IUserService userService = new UserServiceImpl();
		// 判断用户是否为管理员
		String role = userService.findRoleByUsername(username);
		// 根据用户名查询用户角色
		if (role.equals("2")) {
			logging.warn("--------------->管理员登录<------------------------");
			// 管理员
			session.setAttribute("root", username);
			request.getRequestDispatcher("/jsps/admin/adminIndex.jsp").forward(
					request, response);
		} else {
			// 普通用户
			logging.warn("--------------->用户登录<------------------------");
			String result = userService.login(username, StringHelper.MD5(pwd));
			if (result == "3") {
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(3600);
				logging.warn("--------------->获取网盘信息<------------------------");
				Integer userid = userService.getUserIdByUsername(username);
				if (userid != null) {
					IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
					DiskInfo diskInfo = diskInfoService.load(userid.intValue());

					request.setAttribute("diskInfo", diskInfo);
				}
				request.getRequestDispatcher("jsps/main.jsp").forward(request,
						response);
				logging.warn("--------------->用户" + username
						+ "登录成功<------------------------");
			} else {
				response.sendRedirect("login.jsp");
				logging.warn("--------------->用户登录失败<------------------------");
			}
		}
	}

	/**
	 * 用户退出
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logging.warn("--------------->用户退出<------------------------");
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		response.sendRedirect("login.jsp");
	}
	
	/**
	 * 管理员退出
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void rootLogout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logging.warn("--------------->管理员退出<------------------------");
		HttpSession session = request.getSession();
		session.removeAttribute("root");
		response.sendRedirect("login.jsp");
	}

}
