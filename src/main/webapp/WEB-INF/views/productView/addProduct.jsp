<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-10
  Time: 오후 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addProduct</title>
</head>
<body>
  <form method="post" action="/addproduct">
    <input name="name" placeholder="상품이름">
    <input name="price" placeholder="상품가격">
    <input name="count" placeholder="재고">
    <input type="submit">
  </form>
</body>
</html>
