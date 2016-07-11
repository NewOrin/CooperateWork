<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>编辑个人信息</title>
<link href="../assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container">
		<h2>编辑个人信息</h2>
		<form action="update.html" method="post" id="edit_form">
			<div class="form-group">
				<label>员工编号</label> <input type="text" name="eid"
					class="form-control" value="${employee.eid}" readonly>
			</div>
			<div class="form-group">
				<label>员工姓名</label> <input type="text" name="ename"
					class="form-control" value="${employee.ename}" readonly>
			</div>
			<div class="form-group">
				<label>介绍</label> <input type="text" name="introduction"
					class="form-control" value="${employee.introduction}">
			</div>
			<div class="form-group">
				<label>兴趣爱好</label> <input type="text" name="hobby"
					class="form-control" value="${employee.hobby}">
			</div>
			<div class="form-group">
				<label>联系电话</label> <input type="text" name="phone"
					class="form-control" value="${employee.phone}">
			</div>
			<div class="form-group">
				<label>是否公开信息</label><br> <label class="radio-inline">
					<input type="radio" checked="checked" id="inlineRadio1">公开
				</label> <label class="radio-inline"> <input type="radio"
					name="inlineRadioOptions">保密
				</label>
			</div>

			<div class="form-group">
				<label>所属部门</label> <input type="text" name="depart"
					class="form-control" value="${employee.depart}" readonly>
			</div>

			<div class="form-group">
				<label>员工角色</label> <input type="text" name="role"
					class="form-control" value="${employee.role}" readonly>
			</div>

			<div class="form-group">
				<label>修改密码</label> <input type="password" name="epwd"
					value="${employee.epwd}" class="form-control">
			</div>
			<div class="form-group">
				<label>再次输入密码</label> <input type="password"
					value="${employee.epwd}" class="form-control">
			</div>
			<input type="submit" value="提交修改" class="btn btn-danger">
	</div>
	</form>
	<a class="page-action" data-type="close" href="#">关闭本页</a>
	</div>
	<script type="text/javascript"
		src="../assets/js/jquery-1.8.1.min.js"></script>
	<script type="text/javascript" src="../assets/js/bui-min.js"></script>
	<script type="text/javascript" src="../assets/js/config-min.js"></script>
	<script type="text/javascript">
		BUI.use('common/page');

		$.ajax({
			cache : true,
			type : POST,
			url : update.html,
			data : $('edit_form').serialize(),
			async : false,
			error : function(request) {
				alert("更新失败!");
			},
			success : function(data) {
				alert("成功!" + data);
			}
		});
	</script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
