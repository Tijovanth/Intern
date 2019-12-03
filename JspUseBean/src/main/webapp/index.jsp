<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.tijo.Bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class="com.tijo.Bean" type ="com.tijo.Bean" scope="request">
<jsp:setProperty name="a" property="id" value="12"/>
<jsp:setProperty name="a" property="name" value="Tijo"/>
</jsp:useBean>
<jsp:forward page="sample.jsp"/>
</body>
</html>