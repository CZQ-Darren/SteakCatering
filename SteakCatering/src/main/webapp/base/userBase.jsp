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

    <%--获取用户名，存入request对象中--%>
    <%
        Object userName = request.getSession().getAttribute("userName");
        request.setAttribute("userName", userName);
    %>

    <%--还没登陆--%>
    <c:if test="${userName==null}" var="flag">
        <span id="user">
            <i class="user"></i>
            <a id="login" href="${pageContext.request.contextPath}/login.jsp">登录</a> |
            <a id="register" href="${pageContext.request.contextPath}/register.jsp">注册</a>
        </span>
    </c:if>

    <%--已经登录了--%>
    <c:if test="${!flag}">
        <div id="user" class="dropdown">
            <span onclick="user()" class="dropbtn">
                <i class="user"></i>
                <span>${userName}</span> ∨
            </span>
            <span id="myDropdown" class="dropdown-content">
                <a href="#">修改资料</a>
                <a href="${pageContext.request.contextPath}/clearLogin.su">退出登录</a>
            </span>
        </div>
    </c:if>

</body>

    <%--jq--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
    <%--登录后下拉菜单--%>
    <script type="text/javascript">

        /* 点击按钮，下拉菜单在 显示/隐藏 之间切换 */
        function user() {
            document.getElementById("myDropdown").classList.toggle("show");
        }

        // 点击下拉菜单意外区域隐藏
        window.onclick = function(event) {
            if (!event.target.matches('.dropbtn')) {

                var dropdowns = document.getElementsByClassName("dropdown-content");
                var i;
                for (i = 0; i < dropdowns.length; i++) {
                    var openDropdown = dropdowns[i];
                    if (openDropdown.classList.contains('show')) {
                        openDropdown.classList.remove('show');
                    }
                }
            }
        }

    </script>

</html>
