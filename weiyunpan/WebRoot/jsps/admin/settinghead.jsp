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

<title>头部信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div class="head">
		<div class="mod-head">
			<a href="<%=path%>/login.jsp"><img src="<%=path%>/imgs/zly.jpg"
				alt="导航开始" width="35px" height="35px" /> <span class="span_wy">微云</span>
			</a>
		</div>
		<div class="mod-userbar">
			管理员：<span>${sessionScope.root }</span>
			<a href="<%=path%>/UserServlet.do?method=rootLogout"><span>退出登录</span></a>
		</div>
	</div>
</body>
</html>
