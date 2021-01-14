<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--如果aboutList为空，则跳转到aboutQuery.sa--%>
<c:if test="${empty aboutList}">
	<%
		request.getRequestDispatcher("aboutQuery.sa").forward(request, response);
	%>
</c:if>

<html>
	<head>
		<meta charset="UTF-8">
		<title>关于我们</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
	</head>
	<body>
		<div class="clearfix nav">
			<a class="logo" href="javascript:;"></a>
			<ul class="clearfix nav-wrap">
				<li><a class="nav-item" href="index.jsp">首页</a></li>
				<li><a class="nav-item" href="pinpai.jsp">品牌故事</a></li>
				<li><a class="nav-item" href="meishi.jsp">美食系列</a></li>
				<li><a class="nav-item" href="shop.jsp">店面展示</a></li>
				<li><a class="nav-item" href="news.jsp">新闻资讯</a></li>
				<li><a class="nav-item nav-active" href="about-us.jsp">关于我们</a></li>
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
		
		<ul class="breadnav clearfix">
			<li class="bnav-item"><a href="index.jsp">首页</a></li>
			<li class="bnav-item">&lt;</li>
			<li class="bnav-item"><a href="about-us.jsp">关于我们</a></li>
		</ul>

		<div class="about-wrap">
			<c:forEach var="about" items="${aboutList}">
				<dl class="about-dl clearfix">
					<dt class="about-pic">
						<img src="${pageContext.request.contextPath}/upload/${about.saImg}"/>
					</dt>
					<dd class="about-txt">
						<h3 class="about-h">${about.saName}</h3>
						<p class="about-p">电话：${about.saPhone}</p>
						<p class="about-p">传真：${about.saFax}</p>
						<p class="about-p">邮编：${about.saZipCode}</p>
						<p class="about-p">地址：${about.saAddress}</p>
					</dd>
				</dl>
			</c:forEach>

			<p class="about-p2">全国加盟热线及邮箱</p>
            <p class="about-p2">9510 5396</p>
			<p class="about-p2">E-mail:jiameng@diocoffee.com</p>
		</div>

		<%--调用封装的foot页面--%>
		<jsp:include page="base/footBase.jsp"></jsp:include>
		
	</body>
	<!--jq调用-->
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.js" type="text/javascript"></script>

	<script type="text/javascript">
		//导航当前项切换	
		$(".nav-item").click(function(){
			$(this).parent("li").siblings().children().removeClass("nav-active");		
			//点击对象的父级（li）的兄弟级（li）的子集（a）移除类
			$(this).addClass("nav-active");												
			//给点击对象添加类
		});
	</script>
</html>
