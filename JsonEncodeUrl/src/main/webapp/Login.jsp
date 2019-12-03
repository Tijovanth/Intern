<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Login</title>
  </head>

  <body>
    <h1>Login App!</h1>
     <h3 id="demo"></h3>
    <form method="post">
    UserName:<input type="text" name="uname" id="uname"><br>
    Password:<input type="text" name="pwd" id="pwd"><br>
    <button onclick="sendToLogin()">Login</button>
    </form>
    <a href="Registration.jsp">Register</a>
    <script type="text/javascript">
    function sendToLogin()
    {
    	var uname = document.getElementById("uname").value
    	var pwd = document.getElementById("pwd").value
    	var detailsObject = {"uname":uname,"pwd":pwd};
    	var detailsJsonObject = JSON.stringify(detailsObject);
    	var url = "/Login"
    	url = encodeURIComponent(url)
    	var request = new XMLHttpRequest();
    	request.onreadystatechange = function()
		{
			if(request.readyState == 4 && request.status == 200)
				{
				document.getElementById("demo").innerHTML = request.responseText;
				}
		}
    	request.open("POST",url,true);
    	request.send(detailsJsonObject);
    }
    </script>
  </body>
</html>