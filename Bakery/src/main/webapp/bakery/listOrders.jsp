<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order List</title>
</head>
<body>
  <table>
      <thead>
        <tr>
            <td>Orderer Name</td>
            <td>Order Number</td>
            <td>Item</td>
            <td>Gluten Free</td>
            <td>Vegan</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${orderServer}" var="order">
            <tr>
                <td>${order.userName}</td>
                <td>${order.orderId}</td>
                <td>${order.gluten?"x":""}</td>
                <td>${order.vegan?"x":""}</td>
            </tr>
        </c:forEach>
      </tbody>
  </table>
</body>
</html>
