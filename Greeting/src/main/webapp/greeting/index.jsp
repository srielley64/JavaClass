<%@page import="com.rielley.greeting.Greeting" %>
<html>
<body>
<%@ include file="include/header.jsp" %>
<h2>Hello World!</h2>
<br/>
    <%! Greeting greeting = new Greeting("Steve Rielley"); %>

<p> <%= greeting.getMessage() %> </p>
</body>
</html>

