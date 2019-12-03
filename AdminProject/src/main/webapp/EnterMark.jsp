<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Mark</title>
</head>
<body>
<form action="Validation/saveMarks.ds">
<input type="hidden" name="name" value=<%=request.getParameter("StudentName")%> >
Mathematics        : <input type="text" name="maths" required>
OperatingSystem    : <input type="text" name="os" required>
DesignAndAlgorithm : <input type="text" name="da" required>
WebTechnology      : <input type="text" name="web" required>
DataStructure      : <input type="text" name="ds" required>
<input type="submit">
</form>
</body>
</html>