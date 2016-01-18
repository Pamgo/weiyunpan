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
			.setting-menu .memu-title h3{background: url(http://pr.bdimg.com/static/princess/img/setting_sprites_0_ccb7c890.png) 0 0 no-repeat;
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
			
			.setting-submit-btn{background-clip: padding-box; border: 1px solid #5c8ebf;border-radius: 2px; margin:13px 0 0 100px ;float: left; background: -webkit-linear-gradient(#75abda,#6698c9);font-size: 14px; width: 68px;height: 34px; line-height: 30px; color: #fff; text-align: center;cursor: pointer;}
		
			/*table start*/
			.main {height: auto;overflow: hidden;margin: 16px auto;}	
			.main td {text-align: center;height: 28px;width: 100px;line-height: 28px;font-size: 14px;color: #555;}
			.main .title td {cursor: pointer;color: #333;font-family: arial; font-size: 14px; font-weight: bold;}
			.none {display: none}
			.c_delete{cursor: pointer;color: green;}
			.c_delete:hover{color: red;}
			/*table end*/
		</style>
	</head>

	<body>
		<div id="wrap">
			<div class="head">
				<div class="mod-head">
					<a href="../index.html"><img src="../img/zly.jpg" alt="导航开始" width="35px" height="35px" />
						<span class="span_wy">微云</span>
					</a>
				</div>
				<div class="mod-userbar">
					管理员：<span>pamgo</span>
				</div>
			</div>
			<div class="br"></div>
			<div id="content">
				<div class="mod-setting">
					<div class="setting-title">云盘设置</div>
					<div class="setting-content">
						<div class="setting-menu">
							<div class="memu-title">
								<h3>设置类型</h3>
							</div>
							<ul class="menu-list">
								<li class="menu-item basic-link on"><a href="#" class="item-info">分配空间</a></li>
							</ul>
							<ul class="menu-list">
								<li class="menu-item basic-link on"><a href="#" class="item-info">文件管理</a></li>
							</ul>
							<ul class="menu-list">
								<li class="menu-item basic-link on"><a href="#" class="item-info">上传下载限制</a></li>
							</ul>
						</div>
						<div class="settting-detail">
							<div class="mod-setting-jbxx">
								<div class="mod-title">文件信息</div>
									<table class="main setting-table" width="600" border="0" cellspacing="1" bgcolor="#666666">
										<tr class="title">
											<td bgcolor="#CCCCCC">上&nbsp;传&nbsp;者</td>
											<td bgcolor="#CCCCCC">文件大小</td>
											<td bgcolor="#CCCCCC">创建时间</td>
											<td bgcolor="#CCCCCC">文件名称</td>
											<td bgcolor="#CCCCCC">文件操作</td>
										</tr>
										<tr>
											<td bgcolor="#FFFFFF">李百（L）</td>
											<td bgcolor="#FFFFFF">15.2</td>
											<td bgcolor="#FFFFFF">1988</td>
											<td bgcolor="#FFFFFF">9aaa</td>
											<td bgcolor="#FFFFFF"><a id="f_delete" class="c_delete" title="删除">删除</a></td>
										</tr>
										<tr>
											<td bgcolor="#FFFFFF">王易(W)</td>
											<td bgcolor="#FFFFFF">25.55</td>
											<td bgcolor="#FFFFFF">2000</td>
											<td bgcolor="#FFFFFF">dd</td>
											<td bgcolor="#FFFFFF"><a id="f_delete" class="c_delete" title="删除">删除</a></td>
										</tr>
										<tr>
											<td bgcolor="#FFFFFF">林明(L)</td>
											<td bgcolor="#FFFFFF">18.66</td>
											<td bgcolor="#FFFFFF">1745</td>
											<td bgcolor="#FFFFFF">ee</td>
											<td bgcolor="#FFFFFF"><a id="f_delete" class="c_delete" title="删除">删除</a></td>
										</tr>
										<tr>
											<td bgcolor="#FFFFFF">李姐(L)</td>
											<td bgcolor="#FFFFFF">20</td>
											<td bgcolor="#FFFFFF">1996</td>
											<td bgcolor="#FFFFFF">1r</td>
											<td bgcolor="#FFFFFF"><a id="f_delete" class="c_delete" title="删除">删除</a></td>
										</tr>
									</table>
									<div class="none"></div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>
		<script src="../js/jquery-1.8.0.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function() {	
				var pk = 1;
				$("tr.title td").click(function() {
					//把要排序的内容添加到数组里
					var tIndex = parseInt($(this).index()); //获取td的位置值
					var valueArray = new Array();  //创建一个数组用于村粗内容
					var p = 0;
					for (var i = 1; i < $("table tr").length; i++) {
						if (tIndex != 0) {
							valueArray[p] = parseInt($("table tr:eq(" + i + ") td").eq(tIndex).html());
						} else {
							valueArray[p] = $("table tr:eq(" + i + ") td").eq(tIndex).html();
						}
						p++;
					}
					
					//数据排序
					if (pk == 1) {
						valueArray.sort(function(a, b) {
							return a < b ? -1 : 1
						})
						pk = 2
					} else {
						valueArray.sort(function(a, b) {
							return a > b ? -1 : 1
						})
						pk = 1
					}
					//匹配内容加入到一个隐藏的排序div里+-
					for (var i = 0; i < valueArray.length; i++) {
						for (var d = 1; d < $("table tr").length; d++) {
							var valueText = tIndex != 0 ? parseInt($("table tr:eq(" + d + ") td").eq(tIndex).html()) : $("table tr:eq(" + d + ") td").eq(tIndex).html();
							if (valueArray[i] == valueText) {
								$("table tr").eq(d).clone().appendTo(".none")
							}
						}
					}
					//重新整理html 排序，添加到视图里
					var titleClone = $("table tr").eq(0).clone(true);
					$("table").html("").append(titleClone);
					$("table").append($(".none").html())
					$(".none").html("");
				})
			})
		</script>
	</body>

</html>