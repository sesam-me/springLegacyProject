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
        .hoverClass:hover {
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
      <td></td>
      <td></td>
<%--      <td>좋아요</td>--%>
<%--      <td>조회수</td>--%>
    </tr>

      <c:forEach items="${myBoardList}" var="board">
          <tr class="hoverClass">
              <td>${board.board_seq}</td>
              <td><a href="/boarddetail/${board.board_seq}">${board.title}</a></td>

              <c:if test="${user_seq eq board.user_seq}">
                  <td><a href="/boardupdate/${board.board_seq}">수정</a></td>
                  <td><a href="/boarddelete/${board.board_seq}">삭제</a></td>
              </c:if>
          </tr>
      </c:forEach>

  </table>
</body>
</html>
