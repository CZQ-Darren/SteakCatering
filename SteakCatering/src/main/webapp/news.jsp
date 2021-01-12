<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--如果newsList没有数据，跳转到newsPageQuery.sn--%>
<c:if test="${empty newsList}">
	<%
		request.getRequestDispatcher("/newsPageQuery.sn").forward(request, response);
	%>
</c:if>

<html>
	<head>
		<meta charset="UTF-8">
		<title>新闻资讯</title>
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
				<li><a class="nav-item nav-active" href="news.jsp">新闻资讯</a></li>
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
			<li class="bnav-item"><a href="news.jsp">新闻资讯</a></li>
		</ul>
		<div class="newslist-wrap">
			<p class="newslist-tit">新闻资讯</p>

			<%--分页--%>
			<c:forEach var="news" items="${newsList}">
				<dl class="newslist-box clearfix">
					<dt class="newslist-pic">
						<img src="${pageContext.request.contextPath}/upload/${news.snImg}"/>
					</dt>
					<dd class="newslist-txt">
						<a href="${pageContext.request.contextPath}/newsConQuery.sn?snId=${news.snId}&curPageNo=${pageInfo.curPageNo}" class="newslist-font24">${news.snTitle}</a>
						<ul class="newslist-ul">
							<li class="newslist-li">
								<p class="newslist-time">${news.snCreateTime}</p>
							</li>
							<li class="newslist-li">
								<a href="${pageContext.request.contextPath}/newsConQuery.sn?snId=${news.snId}&curPageNo=${pageInfo.curPageNo}" class="newslist-con">${news.snContent}...</a>
							</li>
							<li class="newslist-li"><a class="newslist-link" href="${pageContext.request.contextPath}/newsConQuery.sn?snId=${news.snId}&curPageNo=${pageInfo.curPageNo}">&lt;阅读全文&gt;</a></li>
						</ul>
					</dd>
				</dl>
				<span class="news-line">
					<img src="${pageContext.request.contextPath}/img/news-line.png"/>
				</span>
			</c:forEach>

			<ul class="pag clearfix">
				<li class="pag-content">当前第&nbsp;${pageInfo.curPageNo}&nbsp;页</li>
				<li class="pag-content">总共&nbsp;${pageInfo.totalPageCount}&nbsp;数</li>
				<li class="pag-content">总共&nbsp;${pageInfo.totalCount}&nbsp;条数据</li>
			</ul>

			<%--分页按钮--%>
			<ul class="shop-paging clearfix">
				<%--当前页大于一才能点--%>
				<c:if test="${pageInfo.curPageNo>1}" var="flag">
					<li><a href="${pageContext.request.contextPath}/newsPageQuery.sn?curPageNo=1" class="pag-item">首</a></li>
                    <li><a href="${pageContext.request.contextPath}/newsPageQuery.sn?curPageNo=${pageInfo.curPageNo-1}" class="pag-item">&lt;</a></li>
                </c:if>
                <c:if test="${!flag}">
                    <li><span class="pag-item">首</span></li>
                    <li><span class="pag-item">&lt;</span></li>
                </c:if>

                <%--当前页小于总页数才能点--%>
                <c:if test="${pageInfo.curPageNo<pageInfo.totalPageCount}" var="flag2">
                    <li><a href="${pageContext.request.contextPath}/newsPageQuery.sn?curPageNo=${pageInfo.curPageNo+1}" class="pag-item">&gt;</a></li>
					<li><a href="${pageContext.request.contextPath}/newsPageQuery.sn?curPageNo=${pageInfo.totalPageCount}" class="pag-item">末</a></li>
                </c:if>
				<c:if test="${!flag2}">
                    <li><span class="pag-item">&gt;</span></li>
                    <li><span class="pag-item">末</span></li>
                </c:if>
			</ul>
		</div>

		<%--调用封装的foot页面--%>
		<jsp:include page="base/footBase.jsp"></jsp:include>
		
	</body>
	<!--jq调用-->
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.js" type="text/javascript"></script>
	<script type="text/javascript">
		//导航当前项切换	
		$(".nav-item").click(function(){
			//点击对象的父级（li）的兄弟级（li）的子集（a）移除类
			$(this).parent("li").siblings().children().removeClass("nav-active");
			//给点击对象添加类
			$(this).addClass("nav-active");
		});
	</script>
</html>
