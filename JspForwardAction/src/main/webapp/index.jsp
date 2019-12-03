<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hai Iam index.jsp</h1>
<jsp:forward page="sample.jsp">
<jsp:param value="Tijo" name="name"/>
</jsp:forward>
</body>
</html>