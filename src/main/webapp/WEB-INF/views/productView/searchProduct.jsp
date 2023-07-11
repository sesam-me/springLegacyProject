<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-10
  Time: 오후 7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>searchProduct</title>
</head>
<body>
    <table>
        <tr>
            <td>상품No</td>
            <td>상품명</td>
            <td>가격</td>
            <td>재고</td>
        </tr>

        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.product_seq}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.count}</td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>
