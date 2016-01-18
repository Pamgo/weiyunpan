package com.yunpan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.yunpan.entity.Favorinfo;
import com.yunpan.entity.FileInfo;
import com.yunpan.service.IFavorinfoService;
import com.yunpan.service.IFileInfoService;
import com.yunpan.service.IUserService;
import com.yunpan.service.impl.FavorinfoServiceImpl;
import com.yunpan.service.impl.FileInfoServiceImpl;
import com.yunpan.service.impl.UserServiceImpl;
import com.yunpan.util.BaseServlet;

/**
 * 收藏文件操作类
 * 
 * @author pamgo
 * 
 */
public class FileFavoriteServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 添加收藏
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void andfavorForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		IUserService userService = new UserServiceImpl();
		IFavorinfoService favorinfoService = new FavorinfoServiceImpl();
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		String username = session.getAttribute("username").toString();
		int fileid = Integer.parseInt(request.getParameter("fileid"));
		int userid = userService.getUserIdByUsername(username);
		// json解析
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		// 判断文件是否已收藏
		List<Favorinfo> favorinfos = favorinfoService.findByuserid(userid);
		if (favorinfos.size() != 0) { // 情况一：不为空的时候
			for (int i = 0; i < favorinfos.size(); i++) {
				Favorinfo favorinfo = favorinfos.get(i);
				if (fileid == favorinfo.getFile_id()) {
					// 如果已经收藏，则不能再次收藏
					jsonObject.put("favor", "已经收藏！");
					jsonArray.add(jsonObject);
					System.out.println(jsonArray);
					out.write(jsonArray.toString());
					return;
				}
			}
			// 情况一.1：不为空的时候
			FileInfo fileInfo = fileInfoService.findSimpleFileByid(fileid);
			boolean isFavor = favorinfoService.addFavor(userid, fileInfo);
			if (isFavor) {
				System.out.println("收藏成功。。。");
				// 更新文件收藏状态
				fileInfo.setIsfavorite(2);
				boolean isupdate = fileInfoService.updateFileInfo(fileInfo,
						fileid);
				if (isupdate) {
					System.out.println("更新成功。。。");
					jsonObject.put("favor", "收藏成功！");
					jsonArray.add(jsonObject);
					System.out.println(jsonArray);
					out.write(jsonArray.toString());
					return;
				}
			}
		} else {
			// 情况二：为空的时候
			FileInfo fileInfo = fileInfoService.findSimpleFileByid(fileid);
			boolean isFavor = favorinfoService.addFavor(userid, fileInfo);
			if (isFavor) {
				System.out.println("收藏成功。。。");
				// 更新文件收藏状态
				fileInfo.setIsfavorite(2);
				boolean isupdate = fileInfoService.updateFileInfo(fileInfo,
						fileid);
				if (isupdate) {
					System.out.println("更新成功。。。");
					jsonObject.put("favor", "收藏成功！");
					jsonArray.add(jsonObject);
					System.out.println(jsonArray);
					out.write(jsonArray.toString());
					return;
				}
			}
		}
	}

	/**
	 * 我的收藏
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void myfavorForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IUserService userService = new UserServiceImpl();
		IFavorinfoService favorinfoService = new FavorinfoServiceImpl();
		String username = session.getAttribute("username").toString();
		int userid = userService.getUserIdByUsername(username);
		List<FileInfo> fileInfos = favorinfoService
				.findByFileidAndUserid(userid);

		// 查询出所有收藏
		request.setAttribute("fileInfos", fileInfos);
		request.getRequestDispatcher("/jsps/favorite.jsp").forward(request,
				response);

	}

	/**
	 * 取消收藏
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void cancelfavorForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		IUserService userService = new UserServiceImpl();
		Integer userid = userService.getUserIdByUsername(username);
		// 根据文件id取消相应文件的收藏
		int fileid = Integer.parseInt(request.getParameter("fileid"));
		IFavorinfoService favorinfoService = new FavorinfoServiceImpl();
		boolean isCancel = favorinfoService.cancelFileFavor(userid.intValue(),fileid);
		if (isCancel) {
			// 取消收藏成功
			System.out.println("取消收藏成功!");
			request.getRequestDispatcher(
					"/FileFavoriteServlet.do?method=myfavorForward").forward(
					request, response);
		}
	}
}
