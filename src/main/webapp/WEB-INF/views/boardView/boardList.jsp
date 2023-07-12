<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-12
  Time: 오후 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>boardList</title>

    <style>
        tr:hover {
            font-weight: bold;
            cursor: pointer;
        }
    </style>
</head>
<body>
  <table>
    <tr>
      <td>게시글 번호</td>
      <td>제목</td>
<%--      <td>좋아요</td>--%>
<%--      <td>조회수</td>--%>
    </tr>


      <c:forEach items="${myBoardList}" var="board">
          <tr>
              <td>${board.board_seq}</td>
              <td>${board.title}</td>
          </tr>
      </c:forEach>

  </table>
</body>
</html>
