<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="UTF-8" />
<title>主页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="header">
		<div class="dl-title">
			<!-- 仅仅为了提供文档的快速入口，项目中请删除链接 -->
			<span class="dl-title">协同办公平台</span>
		</div>
		<div class="dl-log">
			欢迎您，<span class="dl-log-user">${ename}</span><a href="logout.html"
				title="退出登录" class="dl-log-quit">[退出]</a>
		</div>
	</div>
	<div class="content">
		<div class="dl-main-nav">

			<ul id="J_Nav" class="nav-list ks-clear">
				<li class="nav-item dl-selected">
					<div class="nav-item-inner nav-home">个人办公</div>
				</li>
				<li class="nav-item">
					<div class="nav-item-inner nav-order">会议管理</div>
				</li>
				<li class="nav-item">
					<div class="nav-item-inner nav-inventory">系统管理</div>
				</li>
			</ul>
		</div>
		<ul id="J_NavContent" class="dl-tab-conten">
		</ul>
	</div>
	<script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
	<script type="text/javascript" src="../assets/js/bui.js"></script>
	<script type="text/javascript" src="../assets/js/config.js"></script>
	<script>
		BUI.use('common/main', function() {
			var config = [ {
				id : 'menu',
				homePage : 'emp-info',
				menu : [ {
					text : '个人信息',
					items : [ {
						id : 'emp-info',
						text : '查看个人信息',
						href : 'show_info.html',
						closeable : false
					}, {
						id : 'emp-search',
						text : '查看他人信息',
						href : 'queryOther.html'
					}, {
						id : 'edit-info',
						text : '编辑个人信息',
						href : 'edit_info.html'
					} ]
				}, {
					text : '日程安排',
					items : [ {
						id : 'quick',
						text : '日程安排',
						href : 'main/quick.html'
					}, {
						id : 'operation',
						text : '读者设置',
						href : 'main/operation.html'
					}, {
						id : 'ddd',
						text : '代办设置',
						href : 'main/quick.html'
					}, {
						id : 'dd',
						text : '综合查询',
						href : 'main/quick.html'
					}, {
						id : 'dddd',
						text : '日历查看',
						href : 'main/quick.html'
					} ]
				}, {
					text : '名片夹',
					items : [ {
						id : 'resource',
						text : '个人名片夹',
						href : 'main/resource.html'
					}, {
						id : 'loader',
						text : '查看共享名片夹',
						href : 'main/loader.html'
					}, {
						id : 'loader',
						text : '名片夹分类',
						href : 'main/loader.html'
					} ]
				}, {
					text : '公司通讯录',
					items : [ {
						id : 'resource',
						text : '查询通讯录',
						href : 'main/resource.html'
					} ]
				}, {
					text : '待办事项',
					items : [ {
						id : 'resource',
						text : '待办工作清单',
						href : 'main/resource.html'
					}, {
						id : 'loader',
						text : '收到留言清单',
						href : 'main/loader.html'
					}, {
						id : 'loader',
						text : '到期日程安排',
						href : 'main/loader.html'
					} ]
				}, {
					text : '在线信息',
					items : [ {
						id : 'resource',
						text : '全部留言',
						href : 'main/resource.html'
					}, {
						id : 'loader',
						text : '未读留言',
						href : 'main/loader.html'
					}, {
						id : 'loader',
						text : '已发送',
						href : 'main/loader.html'
					}, {
						id : 'loader',
						text : '草稿箱',
						href : 'main/loader.html'
					} ]
				}, {
					text : '个人文件夹',
					items : [ {
						id : 'resource',
						text : '我的文件夹',
						href : 'main/resource.html'
					} ]
				} ]
			}, {
				id : 'form',
				menu : [ {
					text : '会议室管理',
					items : [ {
						id : 'code',
						text : '查看会议室',
						href : 'chart/code.html'
					} ]
				}, {
					text : '会议管理',
					items : [ {
						id : 'code',
						text : '查看会议',
						href : 'chart/code.html'
					}, {
						id : 'code',
						text : '会议记录',
						href : 'chart/code.html'
					} ]
				} ]
			}, {
				id : 'search',
				menu : [ {
					text : '组织管理',
					items : [ {
						id : 'code',
						text : '查看部门',
						href : 'chart/code.html'
					}, {
						id : 'code',
						text : '查看角色',
						href : 'chart/code.html'
					} ]
				} ]
			} ];
			new PageUtil.MainPage({
				modulesConfig : config
			});
		});
	</script>
</body>
</html>

