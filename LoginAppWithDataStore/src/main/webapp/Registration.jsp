<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h3>${message}</h3>
<form action="/Registration">
    UserName:<input type="text" name="uname"><br>
    Password:<input type="text" name="pwd"><br>
    <input type="submit">
    </form>
</body>
</html>