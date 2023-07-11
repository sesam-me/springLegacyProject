<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-09
  Time: 오후 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INSERT</title>
</head>
<body>
  <form method="post" action="/insert">
    <input name="id" placeholder="id">
    <input name="password" type="password" placeholder="password">
    <input name="name" placeholder="name">
    <input name="address" placeholder="address">
    <input name="phone" placeholder="phone">
    <input type="submit">
  </form>
</body>
</html>
