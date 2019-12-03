<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> The exception Occur:<%=exception.printStackTrace() %></h1>
<h1> The exception Occur:<%=exception.getCause() %></h1>
<h1> <% out.println("Tijo"); %></h1>
</body>
</html>