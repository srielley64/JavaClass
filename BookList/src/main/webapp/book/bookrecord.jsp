<%@ page import="com.launchacademy.booklist.model.Book" %>
<html>
<head>
    <title>Book Record</title>
</head>
<body>
<%
    if (request.getAttribute("bookRecord") != null) {
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
<h1>No Book record found.</h1>
<% } %>
</body>
</html>
