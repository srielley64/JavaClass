<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a Book</title>
</head>
<body>
  <div>
      <form action="/book/welcome" method="POST" >
          Title <input type="text" name="title" min="1" max="255"/><br/>
          Author <input type="text" name="author" min="1" max="255"/><br/>
          Copyright <input type="date" name="copyright"/><br/>
          Pages <input type="number" name="pages" min="1"/><br/>
          <input type="submit" value="Add"/>
      </form>
  </div>
</body>
</html>
