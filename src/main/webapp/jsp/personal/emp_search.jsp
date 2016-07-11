<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NewOrin Zhang
  Date: 2016/7/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看他人信息</title>
    <link href="../../../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <h3>输入搜索条件</h3><br>
    <form class="form-inline">
        <div class="form-group">
            <label>所属部门</label>
            <select class="form-control">
                <c:forEach items="${departList}" var="d">
                    <option>${d.dname}</option>
                </c:forEach>
            </select>
        </div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="form-group">
            <label>姓名</label>
            <input type="text" class="form-control" placeholder="请输入姓名">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
    </form>
</div>
<script type="text/javascript" src="../../../assets/js/jquery-1.8.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
