<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p id="demo"></p>
<form action="Another.jsp">
Username<input type = "text" id="username" onchange="myFunc(this.id)" name = "uname"><br>
<small id="uname"></small>
Password<input type = "text" id="password" onchange="myFunc(this.id)" name = "pwd"><br>
<small id="pwd"></small>
<input type ="submit" >
</form>
<script>
var request
function myFunc(id)
{   
	if(id == "username")
	{
		var num = 1
	}else
	{
		var num = 2	
	}
	request = new XMLHttpRequest();
	var enteredValue = document.getElementById(id).value
	var url = "/Registration2?value="+enteredValue+"&num="+num
	try{
		request.onreadystatechange = function()
		{
			if(request.readyState == 4)
				{
				 var current = document.getElementById("demo").innerHTML = request.responseText;
				 document.getElementById(id).focus();
				}
		}
		request.open("GET",url,true);
		request.send()
	}catch(e)
	{
		alert("Unabe to Reach Server");
	}
}
</script>
</body>
</html>