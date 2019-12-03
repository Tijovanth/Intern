<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hai This is index page.jsp</h1>
<jsp:include page="sample.jsp">
<jsp:param value="Tijovanth" name="name"/>
</jsp:include>
</body>
</html>