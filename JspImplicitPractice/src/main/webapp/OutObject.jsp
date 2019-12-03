<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Out Implicit Object Example</title>
</head>
<body>
<% 
out.print( "print statement " );
out.println( "println" );
out.print("Another print statement");
out.println(out.getBufferSize());
out.println(out.getRemaining());
out.println(out.isAutoFlush());
out.flush();
out.println("Hai Iam Tijo");
%>
<form action="RequestObject.jsp">
Username:<input type="text" name="user">
Pasword:<input type="password" name="pwd">
<input type="submit" value="Request"><br>
</form>
<form action="ConfigObject">
<input type="submit" value="Config"><br>
</form>
</body>
</html>