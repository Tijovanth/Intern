<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrive</title>
</head>
<body>
<h3>Please Enter the below details</h3>
<h3>Query by Month</h3><br>
<form action="/Retrive">
Enter the From: <select name="fromMonth">
<option value="0">Jan</option>
<option value="1">Feb</option>
<option value="2">Mar</option>
<option value="3">Apr</option>
<option value="4">May</option>
<option value="5">Jun</option>
<option value="6">Jul</option>
<option value="7">Aug</option>
<option value="8">Sep</option>
<option value="9">Oct</option>
<option value="10">Nov</option>
<option value="11">Dec</option>
</select><br>
Enter the To: <select name="toMonth">
<option value="0">Jan</option>
<option value="1">Feb</option>
<option value="2">Mar</option>
<option value="3">Apr</option>
<option value="4">May</option>
<option value="5">Jun</option>
<option value="6">Jul</option>
<option value="7">Aug</option>
<option value="8">Sep</option>
<option value="9">Oct</option>
<option value="10">Nov</option>
<option value="11">Dec</option>
</select><br>
<input type="submit">
</form>
<br>
<h3>Query by Date</h3>
<form action="/Retrive" method="post" >
From Date:<input type="date" name="fromdate"><br>
To Date:<input type="date" name="todate"><br>
<input type="submit">
</form>
</html>