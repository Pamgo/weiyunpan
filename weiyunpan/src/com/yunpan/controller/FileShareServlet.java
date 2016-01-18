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

import com.yunpan.entity.FileInfo;
import com.yunpan.service.IFileInfoService;
import com.yunpan.service.IFileShareService;
import com.yunpan.service.IUserService;
import com.yunpan.service.impl.FileInfoServiceImpl;
import com.yunpan.service.impl.FileShareServiceImpl;
import com.yunpan.service.impl.UserServiceImpl;
import com.yunpan.util.BaseServlet;

/**
 * 文件分享相关操作类
 * 
 * @author pamgo
 * 
 */
public class FileShareServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 分享文件操作
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void shareFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		// 获取用户id以及文件id
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		IUserService userService = new UserServiceImpl();
		Integer userid = userService.getUserIdByUsername(username);
		int fileid = Integer.parseInt(request.getParameter("fileid"));
		// 根据文件id查出文件信息
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		FileInfo fileInfo = fileInfoService.findSimpleFileByid(fileid);
		fileInfo.setIsshare(2); // 1代表未分享，2代表已分享
		// 更新分享文件信息
		IFileShareService fileShareService = new FileShareServiceImpl();
		boolean isShare = fileShareService.shareFile(fileInfo,
				userid.intValue(), fileid);
		// json解析
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		if (isShare) {
			// 分享成功
			System.out.println("分享成功");
			// 如果已经收藏，则不能再次收藏
			jsonObject.put("isshare", "分享成功！");
			jsonArray.add(jsonObject);
			System.out.println(jsonArray);
			out.write(jsonArray.toString());
			/*request.getRequestDispatcher("RedirectBase.do?method=panForward")
					.forward(request, response);*/
		}

	}

	/**
	 * 我的分享
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void myShareForward(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		IUserService userService = new UserServiceImpl();
		Integer userid = userService.getUserIdByUsername(username);
		// 获取所有已分享的文件
		IFileShareService fileShareService = new FileShareServiceImpl();
		List<FileInfo> myshareLists = fileShareService
				.findAllFileIsShareByuserid(userid.intValue(), 2);
		request.setAttribute("myshareLists", myshareLists);
		request.getRequestDispatcher("/jsps/myshare.jsp").forward(request,
				response);
	}

}
