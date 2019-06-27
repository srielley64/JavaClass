<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Widgets</title>
</head>
<body>
  <table>
      <thead>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Price</td>
            <td>Description</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${widgets}" var="widget">
            <tr>
                <td>${widget.id}</td>
                <td>${widget.name}</td>
                <td>${widget.price}.00</td>
                <td>${widget.description}</td>
            </tr>
        </c:forEach>
      </tbody>
  </table>
  <p><a href="/widgets/new">Add more widgets</a></p>
</body>
</html>
