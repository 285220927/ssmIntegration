<%--
  Created by IntelliJ IDEA.
  User: python
  Date: 19-6-30
  Time: 上午2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 style="color: blue">
        <a href="/account/findall">点击查询所有账户信息</a>
    </h1>

    <hr>

    <form action="/account/saveaccount" method="post">
        <input type="text" name="money"><br>
        <input type="text" name="user_id"><br>
        <input type="submit" value="保存" style="background: aqua; border: red"><br>
    </form>

</body>
</html>
