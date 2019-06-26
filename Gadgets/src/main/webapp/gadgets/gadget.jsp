<%@ page import="com.lauchacademy.gadgets.model.Gadget" %>
<%@ page import="com.lauchacademy.gadgets.GadgetsServer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Gadget Page</title>
</head>
  <body>
    <h1>Gadget</h1>
     <table>
        <thead>
          <tr>
              <td>ID</td>
              <td>Name</td>
              <td>Description</td>
          </tr>
        </thead>
        <c:set var="gadgetList" scope="page" value="${applicationScope.gadgetList}"/>
                <%
                    String sId = request.getParameter("id");
                    GadgetsServer gadgets = new GadgetsServer();
                    Gadget gadget;
                    if (sId == null) {
                        List<Gadget> gadgetList = gadgets.getGadgetList();
                %>
        <tbody>
        <c:forEach items="gadgetList" var="gadget">
            <tr>
                <td>${gadget.id}</td>
                <td>${gadget.name}</td>
                <td>${gadget.description}</td>
            </tr>
        </c:forEach>
        </tbody>
               <% } %>
    </table>
  <a href="/gadgets/new">Add Gadget</a>
</body>
</html>
