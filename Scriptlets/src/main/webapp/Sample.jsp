<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String print()
{
	return "Something";
}
%>
<h1><%= print() %></h1>
<h1><% out.println("Hai"); %></h1>
</body>
</html>