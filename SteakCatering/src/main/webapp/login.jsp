<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- 优先使用 IE 最新版本和 Chrome -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
		
		<title>用户登录</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
	</head>
	<body>
	<div class="clearfix nav">
		<a class="logo" href="javascript:;"></a>
		<ul class="clearfix nav-wrap">
			<li><a class="nav-item" href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
			<li><a class="nav-item" href="${pageContext.request.contextPath}/pinpai.jsp">品牌故事</a></li>
			<li><a class="nav-item" href="${pageContext.request.contextPath}/meishi.jsp">美食系列</a></li>
			<li><a class="nav-item" href="${pageContext.request.contextPath}/shop.jsp">店面展示</a></li>
			<li><a class="nav-item" href="${pageContext.request.contextPath}/news.jsp">新闻资讯</a></li>
			<li><a class="nav-item" href="${pageContext.request.contextPath}/about-us.jsp">关于我们</a></li>
			<%--注册登录/用户信息--%>
			<jsp:include page="base/userBase.jsp"></jsp:include>
		</ul>
	</div>

	<div id="container">
		<div id="buttons">
			<span index="1" class="on"></span>
			<span index="2"></span>
			<span index="3"></span>
		</div>
		<a href="javascript:;" id="prev" class="arrow"><img src="${pageContext.request.contextPath}/img/l.png"/></a>
		<a href="javascript:;" id="next" class="arrow"><img src="${pageContext.request.contextPath}/img/r.png"/></a>
	</div>

	<div class="new-wrap">
		<p class="newfood-tit">用户登录</p>
		<div class="manage">
			<form action="${pageContext.request.contextPath}/login.su" method="post" onsubmit="return loginVerify()">
				<table class="form">
					<tr>
						<td class="field">用户名：</td>
						<td><input class="user_input" type="text" id="userName" name="userName" placeholder="请输入用户名" onchange="userNameVerify()"></td>
						<td><span id="userNameErr"></span></td>
					</tr>
					<tr>
						<td class="field">密码：</td>
						<td><input class="user_input" type="password" id="pwd" name="pwd" placeholder="请输入密码" onchange="pwdVerify()"></td>
						<td><span id="pwdErr"></span></td>
					</tr>
					<tr>
						<td class="field">验证码：</td>
						<td><input type="text" id="authCode" name="authCode" placeholder="请输入验证码" class="user_input" onchange="checkCode()" /></td>
						<td><span id="authCodeErr"></span></td>
					</tr>
					<tr>
						<td class="field"></td>
						<td><canvas id="canvas" width="100" height="50"></canvas></td>
					</tr>
					<tr>
						<td class="field"></td>
						<td><input type="submit" id="loginSubmit" class="user_submit" value="登录"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

	<%--调用封装的foot页面--%>
	<jsp:include page="base/footBase.jsp"></jsp:include>

	</body>

	<!--jq调用-->
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.js" type="text/javascript"></script>
	<%--验证码js文件--%>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/authCode.js"></script>
	<%--form表单验证js文件--%>
	<script src="${pageContext.request.contextPath}/js/login.js"></script>

</html>
