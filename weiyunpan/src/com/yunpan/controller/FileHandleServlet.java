package com.yunpan.controller;

import java.io.File;
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
import com.yunpan.service.IUserService;
import com.yunpan.service.impl.DiskInfoServiceImpl;
import com.yunpan.service.impl.FileInfoServiceImpl;
import com.yunpan.service.impl.UserServiceImpl;
import com.yunpan.util.BaseServlet;
import com.yunpan.util.ConstantUtils;
import com.yunpan.util.FileStorage;

/**
 * 文件操作
 * 
 * @author pamgo
 * 
 */
public class FileHandleServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 操作单个文件信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void findSimpleFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("here....");
		request.getRequestDispatcher("/jsps/pic.jsp")
				.forward(request, response);
	}

	/**
	 * 修改单个文件信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void updateSimpleFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		int fileid = Integer.parseInt(request.getParameter("fileid").trim());
		String filename = request.getParameter("filename");
		String change_time = request.getParameter("time");
		FileInfo fileInfo = fileInfoService.findSimpleFileByid(fileid);
		// 更新文件信息
		fileInfo.setFilename(filename);
		fileInfo.setChange_time(change_time);
		boolean isupdate = fileInfoService.updateFileInfo(fileInfo, fileid);
		if (isupdate) {
			// 更新成功
			request.getRequestDispatcher("RedirectBase.do?method=panForward")
					.forward(request, response);
		} else {
			System.out.println("失败");
		}
	}

	/**
	 * 查询所有文件
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void findLikeFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		IUserService userService = new UserServiceImpl();
		Integer userid = userService.getUserIdByUsername(username);
		String filename = request.getParameter("filename");
		// 查询所有文件信息
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		List<FileInfo> fileLists = fileInfoService.findListByfilename(
				userid.intValue(), filename);
		request.setAttribute("fileLists", fileLists);
		// 显示网盘信息
		IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
		DiskInfo diskInfo = diskInfoService.load(userid.intValue());
		request.setAttribute("diskInfo", diskInfo);

		request.getRequestDispatcher("/jsps/pic.jsp")
				.forward(request, response);
	}

	/**
	 * 根据文件id删除文件信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void deleteFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		// 设置通用删除方法（管理员和普通用户共用方法）
		// String username = session.getAttribute("username").toString();
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		IUserService userService = new UserServiceImpl();
		String filename = request.getParameter("filename");
		int fileid = Integer.parseInt(request.getParameter("fileid"));
		FileInfo fileInfo = fileInfoService.findSimpleFileByid(fileid);
		// 拿到文件所属的用户id
		int userid = fileInfo.getCreate_user();
		// 根据用户id查询用户名
		String username = userService.getUserNameByUserid(userid);
		String filepath = fileInfoService.findPathByFilename(filename);

		// 拿到删除前该文件信息
		long fileSize = fileInfo.getSize();
		// 拿到删除前的网盘信息
		IDiskInfoService diskInfoService = new DiskInfoServiceImpl();
		DiskInfo diskInfo = diskInfoService.load(userid);
		long used_size = diskInfo.getUsed_size();
		int filenumber = diskInfo.getFilenumber();
		// 删除数据库的文件信息
		boolean isDelete = fileInfoService.deleteFileByid(fileid);
		if (isDelete) {
			// 更新容量以及文件数目
			boolean isupdatedisk = diskInfoService.updateDiskSize(used_size
					- fileSize, filenumber - 1, userid);
			if (isupdatedisk) {
				// 删除网盘上的文件
				String path = FileStorage.getFileRealPath() + "/" + username
						+ ConstantUtils.INITSIZE + "KB";
				File file = new File(path);
				File[] files = file.listFiles();
				for (File f : files) {
					// 根据文件名称删除文件
					if (f.isFile() && filepath.equals(f.getName())) {
						f.delete();
					}
				}
				if (isDelete) {
					System.out.println("删除成功!");

					if (session.getAttribute("username") != null) { //普通用户
						request.getRequestDispatcher(
								"RedirectBase.do?method=panForward").forward(
								request, response);
					} else { //管理员
						request.getRequestDispatcher(
								"FileHandleServlet.do?method=findAllFile")
								.forward(request, response);
					}
				}

			}
		}
	}

	/**
	 * 查询所有用户上传的文件
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void findAllFile(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		IFileInfoService fileInfoService = new FileInfoServiceImpl();
		List<FileInfo> listFileinfos = fileInfoService.findAllFileinfo();
		request.setAttribute("listFileinfos", listFileinfos);

		request.getRequestDispatcher("/jsps/admin/fileinfo.jsp").forward(
				request, response);
	}
}
