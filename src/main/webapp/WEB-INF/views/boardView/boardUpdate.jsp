<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-13
  Time: 오후 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boardUpdate</title>
</head>
<body>
  <form method="post" action="/boardupdate">
    <input name="user_seq" type="hidden" value="${user_seq}">
    <input name="board_seq" type="hidden" value="${board.board_seq}">
    <input name="title" value="${board.title}">
    <input name="content" value="${board.content}">
    <input type="submit">
  </form>
</body>
</html>
