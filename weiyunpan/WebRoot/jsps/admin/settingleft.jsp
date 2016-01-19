<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <style type="text/css">
 .menu-list:hover{background-color:#FCAA00;border-right:none;color:#fff;border-bottom: solid 1px #000;}
 </style>
</head>

<body>
	<div class="setting-menu">
		<div class="memu-title">
			<h3>设置类型</h3>
		</div>
		<ul class="menu-list">
			<li class="menu-item basic-link on"><a href="<%=path %>/DiskHandleServlet.do?method=findDiskinfo"
				class="item-info">分配空间</a>
			</li>
		</ul>
		<ul class="menu-list">
			<li class="menu-item basic-link on">
			<a href="<%=path %>/FileHandleServlet.do?method=findAllFile"
				class="item-info">文件管理</a>
			</li>
		</ul>
		<ul class="menu-list">
			<li class="menu-item basic-link on">
			<a href="<%=path %>/UploadAndDownLimit.do?method=limitFind" class="item-info">上传下载限制</a>
			</li>
		</ul>
	</div>
</body>
</html>
