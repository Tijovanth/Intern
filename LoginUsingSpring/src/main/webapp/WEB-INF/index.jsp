<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Here!!</h1>

<h3> ${Message} </h3>

<form action="login">
Username:<input type="text" name="uname"><br>
Password:<input type="text" name="pwd"><br><br>
<input type="submit">
</form>
<br>
<form action="Register">
<input type="submit" value="Register">
</form>
</body>
</html>