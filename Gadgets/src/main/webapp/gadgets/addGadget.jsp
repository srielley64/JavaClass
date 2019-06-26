<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding Gadget</title>
</head>
<body>
<h1>Adding Gadget</h1>
<div>
    <form action="/gadgets/new" method="post">
        ID: <input type="number" name="id"/><br/>
        Name: <input type="text" name="name"/><br/>
        Description: <input type="text" name="description"/><br/>
        <input type="submit" value="Add"/>
    </form>
</div>
</body>
</html>
