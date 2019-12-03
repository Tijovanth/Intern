<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrive</title>
</head>
<body onload="document.getElementById('selectionForm').style.display='none'">
<h3>Do you Want to Select Query by Plan</h3>
<label for="yes">Yes</label>
 <input type="radio" name="selection" id="yes" value="yes"><br>
 <label for="no">No</label>
  <input type="radio" name="selection" id="no" value="no"><br>
  <input type="button" onclick="AskingSelection()" value="click">
  <br>
<form action="/Retrive" id="selectionForm" >
 <h3>Please Enter the below details</h3>
<h3>Query by Month</h3><br>
Enter the From: <select name="fromMonth" id="fromMonth">
<option value="0">Jan</option>
<option value="1">Feb</option>
<option value="2">Mar</option>
<option value="3">Apr</option>
<option value="4">May</option>
<option value="5">Jun</option>
<option value="6">Jul</option>
<option value="7">Aug</option>
<option value="8">Sep</option>
<option value="9">Oct</option>
<option value="10">Nov</option>
<option value="11">Dec</option>
</select><br><br>
Enter the To: <select name="toMonth" id="toMonth">
<option value="0">Jan</option>
<option value="1">Feb</option>
<option value="2">Mar</option>
<option value="3">Apr</option>
<option value="4">May</option>
<option value="5">Jun</option>
<option value="6">Jul</option>
<option value="7">Aug</option>
<option value="8">Sep</option>
<option value="9">Oct</option>
<option value="10">Nov</option>
<option value="11">Dec</option>
</select><br><br>
  Choose Plan : <select name="plan">
       <option value="Normal">Normal</option>
       <option value="Campus">Campus</option>
       <option value="SureJob">SureJob</option>
       </select><br><br>
  <input type="submit">
  </form>
  <br>
  <a href="add.jsp">Add</a>
  <script>
  function AskingSelection()
  {
	  var selectedValue = document.getElementsByName("selection")
	  for(var i = 0 ; i < selectedValue.length; i++)
		  {
		   if(selectedValue[i].checked)
			   {
			   if(selectedValue[i].value == "yes")
				   {
				   document.getElementById('selectionForm').style.display="block"
				   }
			   else
				   {
				   document.getElementById('selectionForm').style.display="none"  
				   }
			   }
		  }
  }
  </script>
</body>
</html>