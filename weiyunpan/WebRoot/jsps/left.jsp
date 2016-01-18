<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
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
    		<div class="left" id="layoutAside">
			<div>
				<ul>
					<li class="li_con"><a href="#"
						class="left_con item_href all-f"> <span class="text"> <span
								class="img-icon "></span> <span class="item-title">全部文件</span> </span>
					</a></li>
					<li class="l_con li_con"><a href="<%=path %>/RedirectBase.do?method=panForward"
						class="left_con item_href"> <span class="text"> <span
								class="img-icon aside-doc"></span> <span class="item-title">文档文件</span>
						</span> </a></li>
					<li class="l_con li_con"><a href="#"
						class="left_con item_href"> <span class="text"> <span
								class="img-icon aside-pic"></span> <span class="item-title">图片</span>
						</span> </a></li>
				</ul>
			</div>
			<div class="slide_space"></div>
			<div class="space">
				<ul>
					<li><label>空间使用情况:</label>
					</li>
					<li>空间大小：<span class="count c_max">【<fmt:formatNumber type="number" value="${diskInfo.total_size/(1024*1024*1024)}	" pattern="0.00" maxFractionDigits="2"/>】&nbsp;&nbsp;M</span>
					</li>
					<li>剩余空间：<span class="count c_leave">【<fmt:formatNumber type="number" value="${(diskInfo.total_size/1024 - diskInfo.used_size)/1024}" pattern="0.00" maxFractionDigits="2"/>】&nbsp;&nbsp;KB</span>
					</li>
				</ul>
			</div>
		</div>
  </body>
</html>
