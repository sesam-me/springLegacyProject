<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-09
  Time: 오후 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UPDATE</title>
</head>
<body>
    <form method="post" action="/update">
        <input name="user_seq" value="${user.user_seq}">
        <input name="password" type="password" value="${user.password}">
        <input name="name" value="${user.name}">
        <input name="address" value="${user.address}">
        <input name="phone" value="${user.phone}">
        <input type="submit">
    </form>
</body>
</html>
