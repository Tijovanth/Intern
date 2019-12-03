<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome <%= session.getAttribute("Username") %> </h1><br>

<form action="/Delete">
<input type="submit" value="Delete">
</form>
<a href="Update.jsp">Update</a>
</body>
</html>