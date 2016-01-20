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
<title>微云文件限制</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page" />
<style type="text/css">
.br {
	border-bottom: 1px solid #333333;
}
/*head start*/
.head {
	height: 40px;
}

.head .mod-head {
	top: 0;
	width: 40px;
	margin-left: 20px;
	margin-bottom: 1px;
}

.head .mod-head .span_wy {
	color: #008000;
	font-family: "bookman old style";
	font-size: 32px;
	margin-left: 50px;
	position: absolute;
	top: 6px;
}

.head .mod-userbar {
	position: absolute;
	right: 35px;
	top: 15px;
}
/*end head*/
#content {
	height: 100%;
	width: 980px;
	border: 1px solid red;
	margin: 0 auto;
	-webkit-box-shadow: 0 1px 3px 2px rgba(0, 0, 0, .2);
}
/*setting start*/
.mod-setting {
	border: 1px solid #ededed;
	margin-top: 21px;
	color: #666;
}

.setting-title {
	font-size: 22px;
	height: 46px;
	line-height: 46px;
	padding-left: 20px;
	background: -webkit-linear-gradient(#fff, #f7f7f7);
}

.setting-content {
	border: 1px solid darkgreen;
	background: #F7F7F7;
	min-height: 640px;
}

.setting-menu {
	border: 1px solid blue;
	float: left;
	width: 199px;
	height: 640px;
}

.setting-menu .memu-title {
	height: 53px;
	line-height: 35px;
	font-size: 14px;
	border-top: 1px solid #E5E5E5;
	border-bottom: 1px solid #E5E5E5;
	border-right: 1px solid #E5E5E5;
	position: relative;
	background: -webkit-linear-gradient(#fff, #f7f7f7);
}

.setting-menu .memu-title h3 {
	background:
		url(http://pr.bdimg.com/static/princess/img/setting_sprites_0_ccb7c890.png)
		0 0 no-repeat;
	background-position: 0 -214px;
	padding-left: 41px;
	border-left: 4px soli:; d #2e82ff;
	display: block;
	font-weight: bold;
	position: absolute;
	left: 0;
	top: -1px;
	height: 41px;
	width: 155px;
}

.setting-menu .menu-list .menu-item {
	line-height: 35px;
	height: 35px;
	font-size: 13px;
	width: 198px;
	border-right: 1px solid #E5E5E5;
}

.setting-menu .menu-list .menu-item .item-info {
	text-decoration: none;
	outline: none;
	-webkit-transition: color .2s;
	margin-left: 20px;
	display: block;
	color: #666;
	background: none;
	list-style: none;
}

.setting-menu .menu-list .menu-item .on {
	border-right: 1px solid #fff;
	background: #fff;
}

.setting-menu ul {
	list-style: none;
}

.settting-detail {
	display: block;
	float: left;
	width: 772px;
	border-top: solid 1px #E5E5E5;
	background-color: #fff;
	min-height: 640px;
}
/*end setting*/
/*用户信息 start*/
.mod-setting-jbxx {
	display: block;
	padding: 18px 20px;
}

.mod-setting-jbxx .mod-title {
	font-family: "微软雅黑";
	font-size: 20px;
	color: #FCAA00;
	line-height: 14px;
	padding-bottom: 17px;
	border-bottom: 2px solid #f2f2f2;
}

.setting-submit-btn {
	background-clip: padding-box;
	border: 1px solid #5c8ebf;
	border-radius: 2px;
	margin: 13px 0 0 100px;
	float: left;
	background: -webkit-linear-gradient(#75abda, #6698c9);
	font-size: 14px;
	width: 68px;
	height: 34px;
	line-height: 30px;
	color: #fff;
	text-align: center;
	cursor: pointer;
}

/*table start*/
.main {
	height: auto;
	overflow: hidden;
	margin: 16px auto;
}

.main td {
	text-align: center;
	height: 28px;
	width: 100px;
	line-height: 28px;
	font-size: 14px;
	color: #555;
}

.main .title td {
	cursor: pointer;
	color: #333;
	font-family: arial;
	font-size: 14px;
	font-weight: bold;
}

.none {
	display: none
}

.c_delete {
	cursor: pointer;
	color: green;
}

.c_delete:hover {
	color: red;
}
/*table end*/
/*limit*/
.limit-main td {
	line-height: 40px;
}

.limit-main td span {
	color: red;
	font-family: "微软雅黑"
}

.limit-main td em {
	font-family: arial;
	padding-left: 4px;
}

.td-title {
	font-family: "微软雅黑";
	text-align: right;
}

.table-limit {
	margin-left: 77px;
	margin-top: 38px;
}

.limit-input {
	margin-left: 14px;
	width: 163px;
	border: 1px solid;
	border-color: #d8d8d8 #e5e5e5 #e5e5e5 #d8d8d8;
	height: 30px;
	font-size: 14px;
	padding: 1px 8px;
	transition-duration: .5s;
}

.input-submit {
	margin-left: 20px;
	width: 150px;
	height: 35px;
	margin-top: 44px;
	font-size: 14px;
	cursor: pointer;
}

.input-submit:hover {
	background-color: #FCAA00;
	border: none;
	color: #fff;
}
</style>
</head>

<body>
	<div id="wrap">
		<jsp:include page="settinghead.jsp"></jsp:include>
		<div class="br"></div>
		<div id="content">
			<div class="mod-setting">
				<div class="setting-title">云盘设置</div>
				<div class="setting-content">
					<jsp:include page="settingleft.jsp"></jsp:include>
					<div class="settting-detail">
						<div class="mod-setting-jbxx">
							<div class="mod-title">参数设置</div>
							<div class="table-limit">
								<form action="<%=path %>/UploadAndDownLimit.do" method="post">
								<input type="hidden" name="method" value="limitUpdate" />
									<table class="limit-main">
										<tbody>
											<tr>
												<td class="td-title">上传文件大小&nbsp;:</td>
												<td><input class="limit-input limitSize" type="text"
													name="fileSize" value="${fileLimit.fileSize/(1024*1024) }" />
												</td>
												<td><span>*</span><em>KB(单位[整型])</em>
												</td>
											</tr>
											<tr>
												<td class="td-title">所有文件大小&nbsp;:</td>
												<td><input class="limit-input allSize" type="text"
													name="allfileSize" value="${fileLimit.allfileSize/(1024*1024*1024) }" />
												</td>
												<td><span>*</span><em>M(单位[整型])</em>
												</td>
											</tr>
											<tr>
												<td class="td-title">允许上传文件类型&nbsp;:</td>
												<td><textarea name="fileType"
														style="max-height: 100px;margin-left: 14px;font-size: 14px;padding: 1px 8px;">${fileLimit.fileType }</textarea>
												</td>
												<td><span>*</span><em>以英文逗号隔开</em>
												</td>
											</tr>
											<tr>
												<td class="td-title">禁止上传文件类型&nbsp;:</td>
												<td><textarea name="deniedType"
														style="max-height: 100px;margin-left: 14px;font-size: 14px;padding: 1px 8px;">${fileLimit.deniedType}</textarea>
												</td>
												<td><span>*</span><em>以英文逗号隔开</em>
												</td>
											</tr>
											<tr>
												<td class="td-title"></td>
												<td><input class="input-submit" type="submit"
													value="修改" />
												</td>
												<td></td>
											</tr>
										</tbody>
									</table>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>
	<script src="<%=path%>/js/jquery-1.8.0.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function() {
			$("input[type='submit']").click(function(){
				var limitSize = $(".limitSize");
				var allSize = $(".allSize");
				if(limitSize.val() == ""){
					alert("上传文件大小不能为空！")
					limitSize.focus();
					return false;
				}
				if(allSize.val() == ""){
					alert("上传所有文件大小不能为空！");
					allSize.focus();
					return false;
				}
				return true;
			})
		})
	</script>
</body>

</html>