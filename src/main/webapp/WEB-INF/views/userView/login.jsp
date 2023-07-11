<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-11
  Time: 오후 7:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

  <form method="post" action="/login">
    <div style="display:flex; align-items: center; gap: 20px;">
      <p style="width: 15%;">ID</p>
      <input style="height: 25px;" name="id">
    </div>
    <div style="display:flex; align-items: center; gap: 20px;">
      <p style="width: 15%;">password</p>
      <input style="height: 25px;" type="password" name="password" >
    </div>
    <input type="submit" value="로그인">
  </form>
</body>
</html>
