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
    <title>updateProduct</title>
</head>
<body>
    <form method="post" action="/updateproduct">
<%--     sql에서 가져오는 product값 모두(product_seq, name, price, count) 가져와야 함. 아니면 오류 뜸.   --%>
        <input name="product_seq" type="hidden" value="${product.product_seq}">
        <input name="name" value="${product.name}">
        <input name="price" value="${product.price}">
        <input name="count" value="${product.count}">
        <input type="submit">
    </form>
</body>
</html>
