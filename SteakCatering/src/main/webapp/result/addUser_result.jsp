<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>

    <div>
        <%--判断是否有成功条数--%>
        <c:if test="${addUser>0}" var="flag">
            <p>恭喜：操作成功！</p>
            <p>正在进入登录页面...</p>
            <script type="text/javascript">
                setTimeout("location.href='${pageContext.request.contextPath}/login.jsp'", 2000);
            </script>
        </c:if>

        <c:if test="${!flag}">
            <p>呜呜呜：操作失败了，请等修复后再行添加</p>
            <p>正在进入首页...</p>
            <script type="text/javascript">
                setTimeout("location.href='${pageContext.request.contextPath}/index.jsp'", 2000);
            </script>
        </c:if>
    </div>

</body>
</html>
