<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hai Iam Process.jsp</h1>
<%! int div(int a, int b)
{
	return a/b;
}%>
<h1><%= div(10,0) %></h1>
</body>
</html>