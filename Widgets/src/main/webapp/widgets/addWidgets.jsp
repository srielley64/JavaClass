<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Widget</title>
</head>
<body>
  <h1>Add Widget</h1>
  <form action="/widgets" method="post">
      Name <input type="text" name="name" value="" required="required"/>
      <br/>
      Price <input type="number" name="price" value="0" required="required"/>
      <br/>
      Description <input type="text" name="description" value="" required="required"/>
      <br/>
      <input type="submit" value="ADD THIS WIDGET!!!!!"/>
  </form>
</body>
</html>
