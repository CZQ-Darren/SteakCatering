<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>品牌故事</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
	</head>
	<body>
		<div class="clearfix nav">
			<a class="logo" href="javascript:;"></a>
			<ul class="clearfix nav-wrap">
				<li><a class="nav-item" href="index.jsp">首页</a></li>
				<li><a class="nav-item nav-active" href="pinpai.jsp">品牌故事</a></li>
				<li><a class="nav-item" href="meishi.jsp">美食系列</a></li>
				<li><a class="nav-item" href="shop.jsp">店面展示</a></li>
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
			<li class="bnav-item"><a href="pinpai.jsp">品牌故事</a></li>
			<li class="bnav-item">&lt;</li>
			<li class="bnav-item"><a href="javascript:;">公司简介</a></li>
		</ul>
		<div class="comp-wrap">
			<p class="comp-tit">公司简介</p>
			<div class="comp-txt">
				<p>贵族食代牛排是昔日的台湾首富、台湾知名企业贵族食代集团董事长王永庆先生招待贵宾的知名私房料理。严选一头牛的第六至第八对肋骨这六块牛排。是以“一头牛仅供6客”的贵族食代牛排为招牌菜的中高价位直营连锁西餐厅，独具中国口味，全熟牛排，鲜嫩多汁，适合中国人口味，以菜色精致、好吃、服务好、风格高雅、管理专业着称。</p>
				<p>何谓经典，可能就是在品鉴无数美食后，其绝妙的滋味仍旧不能被替代。再次品味时，仍能激起内心的波澜与感动。如此经典，我们将为您重新诠释。全新的摆盘，搭配特制爽口的配菜，全熟风味，您不可辜负的舌尖美味。</p>
				<p>2003年登陆大陆，截至目前，贵族食代牛排在上海、北京、深圳、广州、南京、武汉、成都、重庆等地已经有40余家直营店，成为高端连锁牛排的领导品牌。</p>
			</div>
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
