<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--isELIgnored="false" 必需加这个，支持EL表达式，后面讲--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <title>菜品表</title>
</head>
<body>



<form action="${pageContext.request.contextPath}/">
    <table width="80%" border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td>菜品ID</td>
            <td>菜品名称</td>
            <td>菜品价格</td>
            <td>菜品简介</td>
            <td>分类ID</td>
            <td>图片</td>
            <td>创建时间</td>
            <td>创建人</td>
            <td>修改时间</td>
            <td>修改人</td>
            <td>备用1</td>
            <td>备用2</td>
            <td>备用3</td>

        </tr>

        <%--begin="2"  下标从0开始 --%>
        <c:forEach var="li" items="${list}">
            <tr>
                <td>${li.sdDishId}</td>
                <td>${li.sdDishName}</td>
                <td>${li.sdDishPrice}</td>
                <td>${li.sdDishContent}</td>
                <td>${li.sdcId}</td>
                <td>${li.sdImg}</td>
                <td>${li.sdCreateTime}</td>
                <td>${li.sdCreateUser}</td>
                <td>${li.sdUpdateTime}</td>
                <td>${li.sdUpdateUser}</td>
                <td>${li.reserve1}</td>
                <td>${li.reserve2}</td>
                <td>${li.reserve3}</td>

            </tr>
        </c:forEach>
    </table>

    <table>
        <%-- <tr>
             <td>
                 <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=1">首页</a>
                 <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo-1}">上一页</a>
                 <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo+1}">下一页</a>
                 <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.totalPageCount}">末页totalPageCount</a>
             </td>
         </tr>--%>

        总共&nbsp;${sbqPage.totalPageCount}&nbsp; 页  当前第&nbsp;${sbqPage.curPageNo}&nbsp;页  总共&nbsp;${sbqPage.totalCount}&nbsp;条数据

        <tr>
            <td>
                <c:if test="${sbqPage.curPageNo>1}" var="flag">
                <a href="${pageContext.request.contextPath}/action.do?curPageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/action.do?curPageNo=${sbqPage.curPageNo-1}">上一页</a>
                </c:if>

                <c:if test="${!flag}">
                <a href="#">首页</a>
                <a href="#">上一页</a>
                </c:if>

                <%--只有当前页小于 总页数--%>
                <c:if test="${sbqPage.curPageNo<sbqPage.totalPageCount}" var="ccccc">
                <a href="${pageContext.request.contextPath}/action.do?curPageNo=${sbqPage.curPageNo+1}">下一页</a>
                <a href="${pageContext.request.contextPath}/action.do?curPageNo=${sbqPage.totalPageCount}">末页</a>

                </c:if>

                <c:if test="${!ccccc}">
                <a href="#">下一页</a>
                <a href="#">末页</a>
                </c:if>

                <input type="number"  value="${sbqPage.curPageNo}" onclick="cccc(this.value);" size="5px">
                <script>

                    function  cccc(sbq) {
                        alert(sbq)
                        window.location.href="${pageContext.request.contextPath}/action.do?curPageNo="+sbq;
                    }
                </script>
        </tr>
    </table>
</form>

</body>
</html>
