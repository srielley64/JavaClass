<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Bakery Order</title>
</head>
<body>
  <h1>Add a Bakery Order</h1>
  <form action="/bakery" method="post">
      Your name: <input type="text" name="userName" required="required"/><br/>
      Item Name: <input type="text" name="itemName" required="required"/><br/>
      Item Quantity: <input type="number" name="quantity" required="required" min="1" max="24"/><br/>
      Gluten Free?
        yes<input type="radio" name="gluten" value="yes"/>
        no<input type="radio" name="gluten" value="no"/><br/>
      Vegan?
        yes<input type="radio" name="vegan" value="yes"/>
        no<input type="radio" name="vegan" value-"no"/><br/>
      <input type="submit" value="Enter Order"/>
  </form>
</body>
</html>
