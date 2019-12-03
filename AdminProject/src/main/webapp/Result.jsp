<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<% String maths = request.getParameter("Mathematics");
String os = request.getParameter("OperatingSystem");
String web = request.getParameter("WebTechnology");
String ds = request.getParameter("DataStructure");
String da = request.getParameter("DesignAndAlgorithm");
String message = request.getParameter("marks");
if(message == null){
   %>
<h3>Mathematics        : <%=maths %></h3>
<h3>OperatingSystem    :  <%=os %></h3>
<h3>WebTechnology      :  <%=web %></h3>
<h3>DataStructure      :  <%=ds %></h3>
<h3>DesignAndAlgorithm :  <%=da %> </h3>
<%}else{ %>
<h3>No information to Display Ask Admin!!</h3>
<%} %>
</body>
</html>