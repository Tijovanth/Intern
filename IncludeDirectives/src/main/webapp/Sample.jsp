<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    <%@ page contentType="text/html; charset=ISO-8859-1" %>
    <%@ page info = "This page by tijo" %>
    <%@ page buffer = "1000kb" %>
    <%@ page isThreadSafe="true" %>
    <%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList arr = new ArrayList();
out.println("Hai Iam Tijo");
out.println(getServletInfo());
int res = 100/0;
%>
</body>
</html>