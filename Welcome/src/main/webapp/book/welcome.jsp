<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.rielley.welcome.model.*" %>

<html>
<head>
    <title>BookList</title>
</head>
<body>
    <h1>Welcome <%= request.getParameter("userName") %></h1>
    <%@ include file="list.jsp" %>

  <div>
      <a href="/book/add.jsp">Add a book</a>
  </div>
</body>
</html>
