<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<h1>Admin</h1>

<% String message = request.getParameter("message");
    if(message != null){
 %>
 <p id="demo"><%= message %></p>
 <%} %>
 
<form action="Validation/marks.ds">
Enter the UserName of the Student:<input type="text" name="name" required><br>
<input type="submit">
</form>
</body>
</html>