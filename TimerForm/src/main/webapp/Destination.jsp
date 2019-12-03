<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Destination Page</h1>
<%
String email = request.getParameter("email");
String name = request.getParameter("name");
if(!email.isEmpty()  && !name.isEmpty())
{
	response.getWriter().println("Status SuccessFull<br>"+email.isEmpty()+"<br>"+name.isEmpty());
}else if(email.isEmpty() || name.isEmpty())
{
	if(email.isEmpty())
	{
		email = "You Sholud Provide Email";
	}
	if(name.isEmpty())
	{
		name = "You Should Provide Name";
	}
	response.getWriter().println("Status UnSuccessFull<br>"+email+"<br>"+name);
}
%>
</body>
</html>