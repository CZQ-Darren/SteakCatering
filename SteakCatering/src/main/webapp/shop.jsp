<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--如果storeList没有数据，跳转到storePageQuery.ss--%>
<c:if test="${empty storeList}">
	<%
		request.getRequestDispatcher("/storePageQuery.ss").forward(request, response);
	%>
</c:if>
<%--如果storeCategoryList没有数据，跳转到storePageQuery.ss--%>
<c:if test="${empty storeCategoryList}">
	<%
		request.getRequestDispatcher("/storePageQuery.ss").forward(request, response);
	%>
</c:if>
<%--如果storePageQueryList没有数据，跳转到storePageQuery.ss--%>
<c:if test="${empty storePageQueryList}">
	<%
		request.getRequestDispatcher("/storePageQuery.ss").forward(request, response);
	%>
</c:if>

<html>
	<head>
		<meta charset="UTF-8">
		<title>店面展示</title>
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
			<li class="bnav-item"><a href="shop.jsp">店面展示</a></li>
		</ul>
		<div class="clearfix table-wrap" id="tab-span">
			<span class="table-item table-active">全部店面</span>
			<c:forEach var="storeCategory" items="${storeCategoryList}">
				<span class="table-item">${storeCategory.sscName}</span>
			</c:forEach>
			<div class="search clearfix">
				<form action="${pageContext.request.contextPath}/findStoreByName.ss" method="post" id="storeFind">
					<input class="inp-txt" id="storeName" type="text" name="storeName" value="输入关键字"
						   onfocus="if(this.value=='输入关键字'){this.value=''};this.style.color='black';"
						   onblur="if(this.value==''||this.value=='输入关键字'){this.value='输入关键字';this.style.color='gray';}" />
					<input class="inp-btn" type="submit" name="" value="搜索" />
				</form>
			</div>
		</div>
		<div id="table-div">
			<div class="table-pic table-show clearfix">
				<c:forEach var="storePage" items="${storePageQueryList}">
					<a href="${pageContext.request.contextPath}/findStoreById.ss?storeId=${storePage.ssStoreId}&curPageNo=${pageInfo.curPageNo}" class="shop-wrap shop-right">
					<span class="shop-pic">
						<img src="${pageContext.request.contextPath}/upload/${storePage.ssImg}" alt="" />
					</span>
						<p class="shop-tit">${storePage.ssStoreName}</p>
					</a>
				</c:forEach>

				<%--分页--%>
				<ul class="pag clearfix">
					<li class="pag-content">当前第&nbsp;${pageInfo.curPageNo}&nbsp;页</li>
					<li class="pag-content">总共&nbsp;${pageInfo.totalPageCount}&nbsp;页</li>
					<li class="pag-content">总共&nbsp;${pageInfo.totalCount}&nbsp;条数据</li>
				</ul>

				<%--分页按钮--%>
				<ul class="shop-paging clearfix">
					<%--当前页大于一才能点--%>
					<c:if test="${pageInfo.curPageNo>1}" var="flag">
						<li><a href="${pageContext.request.contextPath}/storePageQuery.ss?curPageNo=1" class="pag-item">首</a></li>
						<li><a href="${pageContext.request.contextPath}/storePageQuery.ss?curPageNo=${pageInfo.curPageNo-1}" class="pag-item">&lt;</a></li>
					</c:if>
					<c:if test="${!flag}">
						<li><span class="pag-item">首</span></li>
						<li><span class="pag-item">&lt;</span></li>
					</c:if>

					<%--当前页小于总页数才能点--%>
					<c:if test="${pageInfo.curPageNo<pageInfo.totalPageCount}" var="flag2">
						<li><a href="${pageContext.request.contextPath}/storePageQuery.ss?curPageNo=${pageInfo.curPageNo+1}" class="pag-item">&gt;</a></li>
						<li><a href="${pageContext.request.contextPath}/storePageQuery.ss?curPageNo=${pageInfo.totalPageCount}" class="pag-item">末</a></li>
					</c:if>
					<c:if test="${!flag2}">
						<li><span class="pag-item">&gt;</span></li>
						<li><span class="pag-item">末</span></li>
					</c:if>
				</ul>
			</div>

			<c:forEach var="storeCategory" items="${storeCategoryList}">
				<div class="table-pic clearfix">
					<c:forEach var="store" items="${storeList}">
						<c:if test="${store.sscId==storeCategory.sscId}">
							<a href="${pageContext.request.contextPath}/findStoreById.ss?storeId=${store.ssStoreId}&curPageNo=${pageInfo.curPageNo}" class="shop-wrap shop-right">
								<span class="shop-pic">
									<img src="${pageContext.request.contextPath}/upload/${store.ssImg}" alt="" />
								</span>
								<p class="shop-tit">${store.ssStoreName}</p>
							</a>
						</c:if>
					</c:forEach>
				</div>
			</c:forEach>
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
		//美食系列当前项切换
		$(".table-item").click(function(){
			$(this).siblings().removeClass("table-active");
			$(this).addClass("table-active");
		});
		//美食系列table切换
		var oSpan = document.getElementById("tab-span");
		var spans = oSpan.querySelectorAll("span");
		var oDiv  = document.getElementById("table-div");
		var divs = oDiv.querySelectorAll("div");
		var last=spans[0];
		for(var i=0;i<spans.length;i++){
			spans[i].index=i;  //给每一个按钮添加一个自定义属性，存储的是他们对应的索引值；
			spans[i].onclick=function(){
				divs[last.index].style.display="none"; //上一个对应的div，让他隐藏
				divs[this.index].style.display="block"; //当前点击按钮对应的div显示
				last=this; 	//把上一次点击的对象更新成当前点击的对象
			};
		};
		// 点击搜索验证
		$("#storeFind").submit(function () {
			// 用来检验不能为空
			var regNull = /\S/;

			// 获取name
			var storeName = $("#storeName").val();

			// 判断name是否有效
			if (!regNull.test(storeName) || storeName=="输入关键字"){
				alert("请正确输入！");
				return false;
			}

			return true;
		})
	</script>
</html>
