<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  if(request.getSession().getAttribute("username") != null)
  {
	  response.sendRedirect("Home");
  }
%>
    <h1>Login Form</h1>
    <form action="Login">
    UserName : <input type="text" name="uname"><br><br>
    Password : <input type="password" name="pwd"><br><br>
    <input type ="submit"> <br><br>
    </form>
    <h3>If you are a new User Go to Registration</h3>
    <a href="Register.jsp"><button>Register</button></a>
</body>
</html>