<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Registration</h2>
<h3>${message}</h3>
<form method="post">
    UserName:<input type="text" name="uname" id="uname"><br>
    Password:<input type="text" name="pwd" id="pwd"><br>
    <input type="button" onclick="sendToRegistration()" value="Register">
    </form>
      <script type="text/javascript">
    function sendToRegistration()
    {
    	var uname = document.getElementById("uname").value
    	var pwd = document.getElementById("pwd").value
    	var detailsObject = {"uname":uname,"pwd":pwd};
    	var detailsJsonObject = JSON.stringify(detailsObject);
    	var url = "/Registration"
    	url = encodeURIComponent(url)
    	var request = new XMLHttpRequest();
    	request.open("POST",url,true);
    	request.send(detailsJsonObject);
    }
    </script>
</body>
</html>