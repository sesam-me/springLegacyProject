<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-11
  Time: 오후 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CART</title>
</head>
<body>
  <table>
    <tr>
      <td>상품명</td>
      <td>가격</td>
      <td></td>
    </tr>

  <c:forEach items="${cartlist}" var="cart">
    <tr>
      <td>${cart.name}</td>
      <td>${cart.price}</td>
      <td><a href="/deletecart/${cart.cart_seq}">삭제</a></td>
    </tr>
  </c:forEach>

  </table>
</body>
</html>
