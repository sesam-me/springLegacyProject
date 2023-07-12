<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-12
  Time: 오후 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boardWrite</title>
</head>
<body>
  <form method="post" action="/boardwrite">
    <input name="user_seq" type="hidden" value="${user_seq}">
    <input name="title" placeholder="제목">
    <input name="content" placeholder="내용">
    <input type="submit">
  </form>
</body>
</html>
