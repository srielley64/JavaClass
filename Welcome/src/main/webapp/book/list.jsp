<%--
  Created by IntelliJ IDEA.
  User: steven
  Date: 2019-06-24
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Book List</h2>
<table>
    <thead>
    <tr>
        <td>Book Title</td>
        <td>Book Author</td>
        <td>Copyright</td>
        <td>Pages</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach item="${bookList}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author.middleName.isEmpty?
                    book.author.firstName + " " + book.author.lastName :
                    book.author.firstName + " " + book.author.middleName + " " + book.author.lastName}</td>
            <td>
                <fmt:parseDate value="book.copyright" var="parsedDate" pattern="yyyy-MM-dd" />
                <c:out value="${parsedDate}"/>
            </td>
            <td>${book.numberOfPages}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>