<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="utf-8" />
<title>协同办公平台</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="assets/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="assets/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css">
<link href="assets/css/templatemo_style.css" rel="stylesheet"
	type="text/css">
<link href="assets/js/jquery-1.8.1.min.js">
<script type="text/javascript">
	function beforeSubmit(form) {
		if (form.username.value == '') {
			alert('用户名不能为空');
			form.username.focus();
			return false;
		}
		;
		if (form.password.value == '') {
			alert('密码不能为空');
			form.password.focus();
			return false;
		}
		;
		return true;
	}
</script>

</head>
<body class="templatemo-bg-gray">
	<div class="container">
		<div class="col-md-12">
			<h1 class="margin-bottom-15">登录</h1>
			<form name="login_from"
				class="form-horizontal templatemo-container templatemo-login-form-1 margin-bottom-30"
				role="form" action="employee/login.html" method="post"
				onsubmit="return beforeSubmit(this)">
				<div class="form-group">
					<div class="col-xs-12">
						<div class="control-wrapper">
							<label for="username" class="control-label fa-label"><i
								class="fa fa-user fa-medium"></i></label> <input type="text"
								class="form-control" id="username" name="ename"
								placeholder="用户名">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-12">
						<div class="control-wrapper">
							<label for="password" class="control-label fa-label"><i
								class="fa fa-lock fa-medium"></i></label> <input type="password"
								class="form-control" id="password" name="epwd" placeholder="密码">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-12">
						<div class="control-wrapper">
							<input type="submit" value="登录" class="btn btn-info"> <a
								href="#" class="text-right pull-right">忘记密码</a>
						</div>
					</div>
				</div>
				<hr>
			</form>
			<div class="text-center">
				<a href="#" class="templatemo-create-new">创建账号</i></a>
			</div>
		</div>
	</div>
</body>
</html>
