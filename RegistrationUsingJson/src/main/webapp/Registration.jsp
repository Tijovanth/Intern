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
<form action="Registration">
Username<input type = "text" id="username" onchange="myFunc(this.id)" name = "uname"><br>
Password<input type = "text" id="password" onchange="myFunc(this.id)" name = "pwd"><br>
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
	var obj = {val:enteredValue,num:num};
	value = JSON.stringify(obj);
	var url = "/Registration"
	try{
		request.onreadystatechange = function()
		{
			//console.log(request.getAllResponseHeaders())
			console.log(request.statusText)
			console.log(request.readyState)
			if(request.readyState == 4)
				{
				document.getElementById("demo").innerHTML = request.responseText;
				}
		}
		request.open("POST",url,true);
		request.setRequestHeader("Content-type", "application/json");
		request.send(value)
	}catch(e)
	{
		alert("Unabe to Reach Server");
	}
}
</script>
</body>
</html>