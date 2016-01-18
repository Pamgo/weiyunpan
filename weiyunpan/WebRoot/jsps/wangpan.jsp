<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

	<head>
		<title></title>
		<link rel="stylesheet" type="text/css" href="../css/index.css" />
		<link rel="stylesheet" type="text/css" href="../css/top.css" />
		<!--<link rel="stylesheet" type="text/css" href="css/left.css" />
		<link rel="stylesheet" type="text/css" href="css/main_top.css" />
		<link rel="stylesheet" type="text/css" href="css/list_container.css" />
		<link rel="stylesheet" type="text/css" href="css/newfolder.css" />-->
			<style type="text/css">
			.navs .mod-head span{
				top: 0;
				color: white;
				line-height: 50px;
			}
			.navs .mod-head{width: 260px; height: 50px;float: left; margin-left: 340px;}
			.navs .mod-head a{float: left;}
			.navs .mod-head .hyn{padding-left: 22px;line-height: 50px;font-size: 14px;}
			.navs .mod-head .sui{padding-left: 22px;font-size: 16px;font-family: arial;}
			.navs .mod-head span:hover{color: #0067FF}
		</style>
	</head>

	<body>
		<div class="content">

			<!--top start-->
			<div class="top">
				<!--logo start-->
				<div class="t_logo logo">
					<a href="#" class="logo">
						<img src="../imgs/login.png" alt="微云" width="50" height="50" />
						<span class="t_logo_font logo">微云盘</span>
					</a>
				</div>
				<!--logo end -->
				<!--
                	作者：pamgogdpyc@163.com
                	时间：2016-01-05
                	描述：nav 
                -->
				<div class="navs">
					<a href="http://127.0.0.1:8020/yunpan/index.html" class="navs_logo">
						<span class="separate">主页</span></a>

					<a href="http://127.0.0.1:8020/yunpan/index.html" target="_self" class="navs_logo">
						<span class="separate">网盘</span>
					</a>

					<a href="#" class="navs_logo">
						<span class="separate">分享</span></a>

					<a href="#" class="navs_logo">
						<span class="separate">空间</span></a>
					<div class="mod-head">
						<a href=""><img src="img/zly.jpg" alt="导航开始" width="40px" height="40px" style="padding-top: 6px;" /></a>
						<a href="#" class="hyn"><span class="span_wy">欢迎您：alison</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="#" class="sui"><span class="span_update_Info">修改资料</span></a>
					</div>
				</div>
				<!--navs end -->
		</div>

	</body>

</html>