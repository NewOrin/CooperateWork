<%--
  Created by IntelliJ IDEA.
  User: NewOrin Zhang
  Date: 2016/7/10
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>个人详情信息</title>
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <h2>个人信息</h2>
    <table class="table table-hover table-bordered">
        <tr>
            <td>员工编号:&nbsp;&nbsp;&nbsp;${employee.eid}</td>
            <td>员工姓名:&nbsp;&nbsp;&nbsp;${employee.ename}</td>
            <td>员工密码:&nbsp;&nbsp;&nbsp;${employee.epwd}</td>
        </tr>
        <tr>
            <td>个人介绍:&nbsp;&nbsp;&nbsp;${employee.introduction}</td>
            <td>兴趣爱好:&nbsp;&nbsp;&nbsp;${employee.hobby}</td>
            <td>联系电话:&nbsp;&nbsp;&nbsp;${employee.phone}</td>
        </tr>
        <tr>
            <td>信息是否可见:&nbsp;&nbsp;&nbsp;${employee.share}</td>
            <td>所属部门:&nbsp;&nbsp;&nbsp;${employee.depart}</td>
            <td>所属角色:&nbsp;&nbsp;&nbsp;${employee.role}</td>
        </tr>
    </table>
</div>
<script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
