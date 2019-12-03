<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<p id="demo"></p>
<form action="Validation/save.ds" method="post">
UserName:<input type="text" id="uname" onchange="Validation(this.id)" name="uname" required><br>
Email-ID:<input type="email" id="email"  name="email" required><br>
PhoneNumber:<input type="text" id="phone" onchange="phoneNumberValidation()" name="phone" required><br>
Address:<textarea rows="4" cols="30" name="address" required></textarea><br>
Password:<input type="password" id="pwd" name="pwd" required><br>
Confirm Password:<input type="password" id="cpwd" onchange="passwordValidation()" name="cpwd" required><br>
<input type="submit">
</form>
<script>
var request;
function Validation(id)
{
	request = new XMLHttpRequest();
	var enteredValue = document.getElementById(id).value
	console.log(enteredValue);
	var url = "Validation/UserName.ds?enteredValue="+enteredValue
		try{
			request.onreadystatechange = function()
			{
				if(request.readyState == 4)
					{
					 var current = document.getElementById("demo").innerHTML = request.responseText;
					 var val = document.getElementById(id).value
					 document.getElementById(id).focus();
					}
			}
			request.open("GET",url,true);
			request.send();
		}catch(e)
		{
			alert("Unabe to Reach Server");
		}
}
function phoneNumberValidation()
{
	var num = document.getElementById("phone").value
	if(num.length != 10)
		{
		document.getElementById("demo").innerHTML = "Invalid PhoneNumber"
		document.getElementById("phone").value = ""
		document.getElementById("phone").focus()
		}
	else
		{
		document.getElementById("demo").innerHTML = "";
		}
}
function passwordValidation()
{
	var pass = document.getElementById("pwd").value
	var cpass = document.getElementById("cpwd").value
	if(pass.isEmpty)
		{
		document.getElementById("demo").innerHTML = "Please Enter the Password";
		 document.getElementById("pwd").focus();
		}
	else
		{
		 if(pass != cpass)
			 {
			 document.getElementById("demo").innerHTML = "Invalid Confirm Password";
			 document.getElementById("cpwd").value = ""
			 document.getElementById("cpwd").focus();
			 }
		 else
			 {
			 document.getElementById("demo").innerHTML = "";
			 }
		}
}
</script>
</body>
</html>