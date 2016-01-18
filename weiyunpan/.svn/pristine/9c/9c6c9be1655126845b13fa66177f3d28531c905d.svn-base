package com.yunpan.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yunpan.exception.DBException;
/*
 * Servlet的基类
 * 1. 应用中的对Servlet的请求都要添加method=xxx的请求参数
 * 2. 在应用的Servlet类中, 只需要定义处理请求的方法:
 */
public abstract class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
			IOException {
		req.setCharacterEncoding("utf-8");
		String methodName = req.getParameter("method");
		try{
			Method method = this.getClass().getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//代理
			method.invoke(this,req,resp);
		}catch(Exception e){
			Throwable cause = e.getCause();
			if(cause instanceof DBException){
				throw new DBException(cause);
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
			IOException {
		doGet(req, resp);
	}
}
