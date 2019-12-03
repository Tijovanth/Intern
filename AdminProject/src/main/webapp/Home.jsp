<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.tijo.Students" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome <%= session.getAttribute("username") %></h1>ijont
<br>
<form action="Validation/Results.ds">
<input type="submit" value="view Results">
</form>
<br>
<form action="Validation/Logout.ds">
<input type="submit" value="Logout">
</form>
</body>
</html>