<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Login</title>
  </head>

 <body>
 <% String message = request.getParameter("message");
    if(message != null){
 %>
 <p id="demo"><%= message %></p>
 <%} %>
<form action="Validation/login.ds" method="post">
UserName:<input type="text" id="username"  name="uname" required><br>
Password:<input type="password" id="password" name="pwd" required><br>
<input type="submit">

<a href="Registration.jsp">Registration</a>
</form>
  </body>
</html>