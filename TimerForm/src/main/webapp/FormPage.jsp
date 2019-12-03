<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload ="start()">
<p  id="time">0</p><br><br>
<form action="Destination.jsp" method="get">
Email Id:<input id="em" onblur="storingEmail()"  type="email" name="email"> <br><br>
Name :<input id="nm" onblur="storingName()"  type="text" name="name"><br><br>
<input type="submit">
</form>
<script>
var email = "",name = "",MyInterval;
 function start()
 {
	 MyInterval = setInterval(Timer,1000);
 }
  function Timer()
  {
	 var n =  document.getElementById("time").innerHTML;
	 var a = parseInt(n);
	 if(a == 10)
	 {
	     clearInterval(MyInterval);
	     location.replace("Destination.jsp?email="+window.email+"&name="+window.name)
	 }else
	 {
		 document.getElementById("time").innerHTML="";
		 a = a + 1;
		 document.getElementById("time").innerHTML=a;
	 }
  }
  function storingEmail()
  {
	 window.email =  document.getElementById("em").value; 
  }
  function storingName()
  {
	  window.name = document.getElementById("nm").value;
  }
</script>
</body>
</html>