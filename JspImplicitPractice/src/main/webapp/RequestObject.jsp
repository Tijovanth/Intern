<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Object</title>
</head>
<body>
<%
response.setContentType("text/html");
Enumeration e = request.getParameterNames();
while(e.hasMoreElements())
{
	out.println(e.nextElement());
}
String username = request.getParameter("user");
out.println(username);
%>
</body>
</html>