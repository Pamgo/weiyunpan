<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    		<div class="top">
			<!--logo start-->
			<div class="t_logo logo">
				<a href="#" class="logo"> <img src="<%=path %>/imgs/login.png" alt="微云"
					width="50" height="50" /> <span class="t_logo_font logo">微云盘</span>
				</a>
			</div>
			<!--logo end -->
			<!--
                	作者：pamgogdpyc@163.com
                	时间：2016-01-05
                	描述：nav 
                -->
			<div class="navs">
				<a href="<%=path%>/RedirectBase.do?method=mainForward" class="navs_logo"> <span class="separate">主页</span>
				</a> <a href="<%=path%>/RedirectBase.do?method=panForward" class="navs_logo"> <span class="separate">网盘</span>
				</a> <a href="<%=path %>/RedirectBase.do?method=isShareForward" class="navs_logo"> <span
					class="separate">分享</span>
				</a> <a href="#" class="navs_logo"> <span class="separate">空间</span>
				</a>
				<div class="mod-head">
					<a href=""><img src="<%=path %>/imgs/zly.jpg" alt="导航开始" width="40px"
						height="40px" style="padding-top: 6px;" />
					</a> <a href="#" class="hyn"><span class="span_wy">欢迎您：${sessionScope.username}</span>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<c:if test="${sessionScope.username != null}">
						 <a href="<%=path %>/UserServlet.do?method=logout" class="sui"><span
							class="span_update_Info">退&nbsp;出</span>
						</a>
					</c:if>
					<c:if test="${sessionScope.username eq null}">
						 <a href="<%=path %>/login.jsp" class="sui"><span
							class="span_update_Info">请登录</span>
						</a>
					</c:if>
				</div>
			</div>
			<!--navs end -->
		</div>
  </body>
</html>
