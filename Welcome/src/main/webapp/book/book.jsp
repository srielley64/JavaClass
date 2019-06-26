<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.rielley.welcome.model.Book" %>
<html>
<head>
    <title>Student Record</title>
</head>
<body>
<%
    if (request.getAttribute("studentRecord") != null) {
        Book book = (Book) request.getAttribute("bookRecord");
%>

<h1>Book Record</h1>
<div>ID: <%= book.getId()%></div>
<div>Title: <%= book.getTitle() %></div>
<div>Author: <%= book.getAuthor()%></div>
<div>Copyright: <%= book.getCopyright() %></div>
<div>Number of Pages: <%= book.getNumberOfPages() %></div>

<%
} else {
%>

<h1>No student record found.</h1>

<% } %>
</body>
</html>