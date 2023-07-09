<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-09
  Time: 오후 5:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- taglib~~ : foreacn 가능하게 해줌!--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>User</title>
</head>
<body>
    <table>
        <tr>
            <td>No</td>
            <td>id</td>
            <td>password</td>
            <td>name</td>
            <td>address</td>
            <td>phone</td>
        </tr>

        <c:forEach items="${userlist}" var="user">
            <tr>
                <td>${user.user_seq}</td>
                <td>${user.id}</td>
                <td>${user.password}</td>
                <td>${user.name}</td>
                <td>${user.address}</td>
                <td>${user.phone}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
