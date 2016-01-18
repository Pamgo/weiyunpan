<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>登录云盘</title>
<!-- basic styles -->

<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="css/login.css" />
</head>

<body class="login-layout">
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">

						<div class="position-relative">
							<div id="login-box"
								class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger">
											<i class="icon-coffee green"></i> 登陆微云盘
										</h4>

										<div class="space-6"></div>

										<form action="<%=path%>/UserServlet.do" method="post">
											<input type="hidden" name="method" value="login" />
											<fieldset>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="text" name="userName" class="form-control"
														placeholder="用户名" value="" /> <i class="icon-user"></i> </span>
													<span class="error_username" style="color:red;"></span> </label> <label
													class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="password" name="pwd" class="form-control"
														placeholder="密码" value="" /> <i class="icon-lock"></i> </span> <span
													class="error_password" style="color:red;"></span> </label>

												<div class="space"></div>

												<div class="clearfix">
													<label class="inline"> <input type="checkbox"
														class="ace" name="autologin" value="" /> <span
														class="lbl"> 记住我</span> </label>

													<button type="submit" name="btn_dl"
														class="width-35 pull-right btn btn-sm btn-primary">
														<i class="icon-key"></i> 登陆
													</button>
												</div>

												<div class="space-4"></div>
											</fieldset>
										</form>

									</div>
									<!-- /widget-main -->

									<div class="toolbar clearfix">
										<div>
											<a href="#" onclick="show_box('forgot-box'); return false;"
												class="forgot-password-link"> <i class="icon-arrow-left"></i>
												忘记密码 </a>
										</div>

										<div>
											<a href="#" onclick="show_box('signup-box'); return false;"
												class="user-signup-link"> 注册 <i class="icon-arrow-right"></i>
											</a>
										</div>
									</div>
								</div>
								<!-- /widget-body -->
							</div>
							<!-- /login-box -->

							<div id="forgot-box" class="forgot-box widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header red lighter bigger">
											<i class="icon-key"></i> 找回密码
										</h4>

										<div class="space-6"></div>
										<p>输入你的注册邮箱</p>

										<form>
											<fieldset>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="email" class="form-control" placeholder="邮箱" /> <i
														class="icon-envelope"></i> </span> </label>

												<div class="clearfix">
													<button type="button"
														class="width-35 pull-right btn btn-sm btn-danger">
														<i class="icon-lightbulb"></i> 发送
													</button>
												</div>
											</fieldset>
										</form>
									</div>
									<!-- /widget-main -->

									<div class="toolbar center">
										<a href="#" onclick="show_box('login-box');return false;"
											class="back-to-login-link"> 回到登陆 <i
											class="icon-arrow-right"></i> </a>
									</div>
								</div>
								<!-- /widget-body -->
							</div>
							<!-- /forgot-box -->

							<div id="signup-box" class="signup-box widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header green lighter bigger">
											<i class="icon-group blue"></i> 注册用户
										</h4>

										<form action="<%=path%>/RegisterServlet.do" method="post">
											<input type="hidden" name="method" value="regist" />
											<fieldset>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="email" name="email" class="form-control"
														placeholder="邮箱" /> <i class="icon-envelope"></i> </span> </label> <label
													class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="text" name="username" id="input_username"
														class="form-control" placeholder="用户名" />
														<i class="icon-user"></i> </span> </label> <span class="error_username"
													style="color:red;"></span> <span class="cannot_username"></span>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="password" name="password" class="form-control"
														placeholder="密码" /> <i class="icon-lock"></i> </span> </label> <span
													class="error_password" style="color:red;"></span>

												<div class="space-24"></div>

												<div class="clearfix">
													<button type="reset" class="width-30 pull-left btn btn-sm">
														<i class="icon-refresh"></i> 重置
													</button>

													<button type="submit" name="btn_zc"
														class="width-65 pull-right btn btn-sm btn-success">
														注册 <i class="icon-arrow-right icon-on-right"></i>
													</button>
												</div>
											</fieldset>
										</form>
									</div>

									<div class="toolbar center">
										<a href="#" onclick="show_box('login-box'); return false;"
											class="back-to-login-link"> <i class="icon-arrow-left"></i>
											回到登陆 </a>
									</div>
								</div>
								<!-- /widget-body -->
							</div>
							<!-- /signup-box -->
						</div>
						<!-- /position-relative -->
					</div>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
	</div>
	<script src="assets/js/jquery-2.0.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var userName = $("input[name='userName']");
			var pwd = $("input[name='pwd']");
			$("button[name='btn_dl']").click(function(){
				if(userName.val() == ""){
					userName.focus();
					$(".error_username").html("用户名不能为空!");
					return false;
				}else{
					$(".error_username").html("");
				}
				if(pwd.val() == ""){
					pwd.focus();
					$(".error_password").html("密码不能为空!");
					return false;
				}else{
					$(".error_password").html("");
				}
			});
			
			$("button[name='btn_zc']").click(function(){
				//检查用户名: 长度为6到12位, 只能输入数字和英文和下划线
				//alert("--");
				var nameEle = $("input[name='username']");
				var reg = /^\w{2,12}$/;
				if(!reg.test(nameEle.val())) {
					alert("用户名长度为2到12位, 只能输入数字和英文和下划线");
					nameEle.focus();
					return false;
				}
				//检查密码: 长度为6位, 只能输入数字和英文
				var passwordEle = $("input[name='password']");
				reg = /^[a-zA-Z0-9]{6,8}$/;
				if(!reg.test(passwordEle.val())) {
					alert("密码的长度为6位, 只能输入数字和英文");
					passwordEle.focus();
					return false;
				}
				return true;
		});
		$("#input_username").blur(function(){
			var reg = /^\w{2,12}$/;
			if(!reg.test(this.value)) {
				this.focus();
				return false;
			} else {
				var url = "<%=path%>/RegisterServlet.do";
				$.ajax({
					url : url,
					type : "POST",
					data : {
						"method":"checkNameExist",
						"username":this.value
					},
					success : function(data) {
						$(".cannot_username").html(data);
					},
					error : function(er) {
						console.log(er);
					}
				});
			}
		});
	})
	</script>
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"/script>");
	</script>
	<script type="text/javascript">
		if ("ontouchend" in document)
			document
					.write("<script src='assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script type="text/javascript">
		function show_box(id) {
			jQuery('.widget-box.visible').removeClass('visible');
			jQuery('#' + id).addClass('visible');
		}
	</script>
</body>
</html>
