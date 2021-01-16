<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--如果store没有数据，跳转到findStoreById.ss--%>
<c:if test="${empty store}">
	<%
		request.getRequestDispatcher("/findStoreById.ss").forward(request, response);
	%>
</c:if>

<html>
	<head>
		<meta charset="UTF-8">
		<title>店面展示 - 详情</title>
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
				<li><a class="nav-item nav-active" href="shop.jsp">店面展示</a></li>
				<li><a class="nav-item" href="news.jsp">新闻资讯</a></li>
				<li><a class="nav-item" href="about-us.jsp">关于我们</a></li>
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
			<li class="bnav-item"><a href="shop.jsp">店面详情</a></li>
			<li class="bnav-item">&lt;</li>
			<li class="bnav-item"><a href="javascript:;">${store.ssStoreName}</a></li>
		</ul>
		
		<div class="shop-conwrap">
			<h1 class="shop-contit">${store.ssStoreName}</h1>
			<span class="shop-conpic">
				<img src="${pageContext.request.contextPath}/upload/${store.ssImg}"/>
			</span>
			<p class="shop-font14"><span class="shop-font18">特色菜品：</span>${storeContent[0]}</p>
			<p class="shop-font14"><span class="shop-font18">营业时间：</span>${storeContent[1]}</p>
			<p class="shop-font14"><span class="shop-font18">停车泊位：</span>${storeContent[2]}</p>
			<p class="shop-font14"><span class="shop-font18">餐厅地址：</span>${storeContent[3]}</p>
			<p class="shop-font14"><span class="shop-font18">餐厅标签：</span>${storeContent[4]}</p>
			<a href="${pageContext.request.contextPath}/storePageQuery.ss?curPageNo=${curPageNo}" class="shop-icon">返回列表页</a>
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
