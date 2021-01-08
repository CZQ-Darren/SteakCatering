<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>user</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>

    <span id="user">
        <i class="user"></i>
        <a id="login" href="${pageContext.request.contextPath}/login.jsp">登录</a> |
        <a id="register" href="${pageContext.request.contextPath}/register.jsp">注册</a>
    </span>

</body>
</html>
