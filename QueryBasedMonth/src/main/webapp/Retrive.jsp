<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrive</title>
</head>
<body>
<h3>Particular Student</h3>
<form action="/Retrive">
Enter Student Name:<input type="text" name="name"><br>
Select the Month:<select name="month">
<option value="December">December</option>
<option value="March">March</option>
<option value="January">January</option>
<option value="November">November</option>
</select><br>
<input type="submit">
</form>
<h3>All Students</h3>
<form action="/Retrive" method="post">
Select the Month:<select name="month">
<option value="December">December</option>
<option value="March">March</option>
<option value="January">January</option>
<option value="November">November</option>
<option value="August">August</option>
</select><br>
<input type="submit">
</form>
</body>
</html>