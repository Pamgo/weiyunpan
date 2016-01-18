<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<title>微云</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page" />
		<style type="text/css">
			.br {border-bottom: 1px solid #333333;}
			/*head start*/
			.head{height: 40px;}
			.head .mod-head {top: 0;width: 40px;margin-left: 20px;margin-bottom: 1px;}
			.head .mod-head .span_wy{color:#008000; font-family:"bookman old style"; font-size: 32px;margin-left: 50px;position: absolute;top: 6px;}
			.head .mod-userbar {
				position: absolute;
				right: 35px;
				top: 15px;
			}
			/*end head*/
			#content{height:100%;width: 980px; border: 1px solid red;margin: 0 auto;-webkit-box-shadow:0 1px 3px 2px rgba(0,0,0,.2);}
			/*setting start*/
			.mod-setting{border: 1px solid #ededed;margin-top: 21px;color: #666;}
			.setting-title{font-size: 22px;height: 46px; line-height: 46px;padding-left: 20px;background:-webkit-linear-gradient(#fff,#f7f7f7) ;}
			.setting-content{border:1px solid darkgreen; background: #F7F7F7;min-height: 640px;}
			.setting-menu{border: 1px solid blue; float: left;width: 199px;height: 640px;}
			.setting-menu .memu-title{height: 53px;line-height: 35px;font-size: 14px;border-top: 1px solid #E5E5E5;border-bottom: 1px solid #E5E5E5; border-right: 1px solid #E5E5E5;position: relative;
			background:-webkit-linear-gradient(#fff,#f7f7f7) ;}
			.setting-menu .memu-title h3{background: url(../imgs/setting_sprites.png) 0 0 no-repeat;
										background-position: 0 -214px;padding-left: 41px; border-left: 4px soli: ;d #2e82ff;
										display: block;font-weight: bold;position: absolute;left: 0;top: -1px; height: 41px; width: 155px;}
			.setting-menu .menu-list .menu-item{line-height: 25px; height: 35px; font-size: 13px; width: 198px;border-right: 1px solid #E5E5E5;}
			.setting-menu .menu-list .menu-item .item-info{text-decoration: none;outline: none;-webkit-transition:color .2s;margin-left: 20px; display: block;
															color: #666;background: none;list-style: none;}
		
			.setting-menu .menu-list .menu-item .on{border-right: 1px solid #fff; background: #fff;}
			.setting-menu ul{list-style: none;}
			.settting-detail{display: block; float: left;width: 772px;border-top: solid 1px #E5E5E5; background-color: #fff;min-height: 640px;}
			/*end setting*/
			/*用户信息 start*/
			.mod-setting-jbxx{display: block;padding: 18px 20px;}
			.mod-setting-jbxx .mod-title{font-family: "微软雅黑"; font-size: 20px;color: #999;line-height: 14px; padding-bottom: 17px;border-bottom: 2px solid #f2f2f2;}
			.mod-setting-jbxx .setting-form{color: #666;font-size: 14px; margin-top: 15px; zoom: 1;}
			.mod-setting-jbxx .setting-form table{border-collapse: collapse;border-spacing: 0;}
			.mod-setting-jbxx .setting-form table tbody tr{border-color: inherit;}
			.mod-setting-jbxx .setting-form th{text-align: right;font-weight: normal;padding: 23px 16px 24px 0; width: 90px;color: #999; font-weight: bold;}
			.setting-name{padding: 7px 0 8px;float: left;}
			.user-input{float:left; width: 242px;border: 1px solid;border-color: #d8d8d8 #e5e5e5 #e5e5e5 #d8d8d8;
						-webkit-box-shadow:2px 3px 3px #f6f8f9 inset;height: 32px; font-size: 12px; padding: 1px 8px;
						transition-property:background-color,color,width,border-color;transition-duration:.5s;}
						
			/*end 用户信息*/
			.mod-input-focus:active{border: 1px solid #377bcb;border-right-color: #377bcb;border-bottom-color: #377bcb;}
			.mod-tip{font-size: 22px; padding-left: 20px;margin-top: 5px; line-height: 28px;margin-left: 12px; background: url(../imgs/input_error.png) 0 0 no-repeat;}
		
			.setting-submit-btn{background-clip: padding-box; border: 1px solid #5c8ebf;border-radius: 2px; margin:13px 0 0 100px ;float: left; background: -webkit-linear-gradient(#75abda,#6698c9);font-size: 14px; width: 68px;height: 34px; line-height: 30px; color: #fff; text-align: center;cursor: pointer;}
		</style>
	</head>

	<body>
		<div id="wrap">
			<div class="head">
				<div class="mod-head">
					<a href="pic.jsp"><img src="../imgs/zly.jpg" alt="导航开始" width="35px" height="35px" />
						<span class="span_wy">微云</span>
					</a>
				</div>
				<div class="mod-userbar">
					欢迎你：<span>pamgo</span>
				</div>
			</div>
			<div class="br"></div>
			<div id="content">
				<div class="mod-setting">
					<div class="setting-title">个人设置</div>
					<div class="setting-content">
						<div class="setting-menu">
							<div class="memu-title">
								<h3>个人资料</h3>
							</div>
							<ul class="menu-list">
								<li class="menu-item basic-link on"><a href="#" class="item-info">基本信息</a></li>
							</ul>
						</div>
						<div class="settting-detail">
							<div class="mod-setting-jbxx">
									<div class="mod-title">基本资料</div>
									<form id="form1" class="setting-form" method="post">
										<table class="setting-table">
											<tbody>
												<tr>
													<th>姓名:</th>
													<td class="setting-name">
														<input type="text" readonly="true" name="username" value="alison" class="user-input mod-input-focus" style="color: rgb(204, 204, 204);"/>
														<!--<span class="mod-tip"></span>-->
													</td>
												</tr>
												<tr>
													<th>昵称:</th>
													<td class="setting-name">
														<input type="text" name="ename" value="" class="user-input mod-input-focus" style="color: rgb(204, 204, 204);"/>
														<span class="mod-tip"></span>
													</td>
												</tr>
												<tr>
													<th>原密码:</th>
													<td class="setting-name">
														<input type="password" name="pass" value="" class="user-input mod-input-focus" style="color: rgb(204, 204, 204);"/>
														<span class="mod-tip"></span>
													</td>
												</tr>
												<tr>
													<th>新密码:</th>
													<td class="setting-name">
														<input type="password" name="newpass" value="" class="user-input mod-input-focus" style="color: rgb(204, 204, 204);"/>
														<span class="mod-tip"></span>
													</td>
												</tr>
												<tr>
													<th>确认密码:</th>
													<td class="setting-name">
														<input type="password" name="repass" value="" class="user-input mod-input-focus" style="color: rgb(204, 204, 204);"/>
														<span class="mod-tip"></span>
													</td>
												</tr>
											</tbody>
											
										</table>
										<input type="submit" class="setting-submit-btn" value="保存">
									</form>
							</div>
							
						</div>
					</div>
				</div>
				
			</div>
				
		</div>		
	</body>

</html>