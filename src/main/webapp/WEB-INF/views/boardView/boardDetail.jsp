<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-13
  Time: 오후 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>boardDetail</title>
</head>
<body>
  <h2>${board.title}</h2>
  <p>${board.content}</p>
  <hr/>
  <div>
      <c:forEach items="${commentlist}" var="comment">
          <div style="display: flex; gap: 15px; margin-bottom: 7px;">
              <p style="width: 10%;">작성자  :  ${user_seq}</p>
              <p>${comment.content}</p>
          </div>
      </c:forEach>



  </div>
  <hr/>
  <form method="post" action="/insertcomment" style="display:flex; align-content: center; gap: 15px">
      <input type="hidden" name="board_seq" value="${board.board_seq}" />
<%--      <input type="hidden" name="comment_seq" value="${board.comment_seq}" />--%>
      <input type="hidden" name="user_seq" value="${user_seq}" />
      <input type="text" name="content" />


      <input type="submit" value="등록">
  </form>
</body>
</html>
