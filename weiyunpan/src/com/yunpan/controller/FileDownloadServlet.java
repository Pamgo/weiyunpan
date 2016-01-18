package com.yunpan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.yunpan.entity.FoldlerInfo;
import com.yunpan.service.IFileInfoService;
import com.yunpan.service.IFoldlerInfoService;
import com.yunpan.service.impl.FileInfoServiceImpl;
import com.yunpan.service.impl.FoldlerInfoServiceImpl;
import com.yunpan.util.BaseServlet;

/**
 * 文件下载操作类
 * 
 * @author pamgo
 * 
 */
public class FileDownloadServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public void downloadFile(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("文件下载。。。");
		//HttpSession session = request.getSession();
		//String username = session.getAttribute("username").toString();
		//IUserService userService = new UserServiceImpl();
		//Integer ownid = userService.getUserIdByUsername(username);
		IFoldlerInfoService foldlerInfoService = new FoldlerInfoServiceImpl();
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		//这里就不能只根据当前用户来判断了
		
		//获取当前点击文件的用户id
		int fileid = Integer.parseInt(request.getParameter("fileid"));
		int userid = fileInfoService.findUseridByFileid(fileid);
		
		//根据当前点击文件的用户id查询文件信息
		
		FoldlerInfo foldlerInfo = foldlerInfoService.findByUserName(userid);
		
		String filename = request.getParameter("filename");
		// 根据文件名查询文件的路径
		
		String filepath = fileInfoService.findPathByFilename(filename);
		SmartUpload su = new SmartUpload();
		su.initialize(getServletConfig(), request, response);
		su.setContentDisposition(null); // 以组件的方式下载
		// 获取文件上传保存的路径,获取对应用户的文件夹信息,对于分享的文件来说，有不同用户不同的文件夹，所有故名思意
		
		//获取分享文件的用户的文件夹信息
		String foldername = foldlerInfo.getFoldername();
		String path = foldlerInfo.getParent_path();
		try {
			su.downloadFile(path + "/" + foldername + "/" + filepath);
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
	}
}
