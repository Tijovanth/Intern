<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Add</title>
  </head>
  <body>
    <p>Add Fields</p>
    <form action="/add" method="post">
    Name : <input type="text" name="uname" required><br><br>
    JoiningDate : <input type="date" name="joiningDate" required><br><br>
    Choose Plan : <select name="plan">
       <option value="Normal">Normal</option>
       <option value="Campus">Campus</option>
       <option value="SureJob">SureJob</option>
       </select><br><br>
    <input type="submit">
    </form>
  </body>
</html>