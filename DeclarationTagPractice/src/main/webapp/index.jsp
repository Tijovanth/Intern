<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a;%>
<%! public int  sum(int a, int b){
	return a + b;
}
%>
<h1><%= sum(12,15) %></h1>
<h2><%= a = 12 %></h2>
</body>
</html>