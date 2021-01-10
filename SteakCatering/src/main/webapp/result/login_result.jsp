<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

    <div>
        <c:if test="${login}" var="flag">
            <p>恭喜：登录成功，可以开始美食之旅啦！</p>
            <p>正在进入首页...</p>
            <script type="text/javascript">
                setTimeout("location.href='${pageContext.request.contextPath}/index.jsp'", 2000);
            </script>
        </c:if>

        <c:if test="${!flag}">
            <p>呜呜呜：登录失败了</p>
            <p>请确认用户名或密码无误后，再行登录</p>
            <p>正在进入登录页面...</p>
            <script type="text/javascript">
                setTimeout("location.href='${pageContext.request.contextPath}/login.jsp'", 2000);
            </script>
        </c:if>
    </div>

</body>
</html>
