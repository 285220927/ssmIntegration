<%--
  Created by IntelliJ IDEA.
  User: python
  Date: 19-7-1
  Time: 上午6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Account</title>
</head>
<body>

    <c:forEach items="${accounts}" var="account">
        <h2 style="color: red">
            ${account.money}, 用户id:${account.user_id}<br>
        </h2>
    </c:forEach>

</body>
</html>
