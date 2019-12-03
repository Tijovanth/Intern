<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Hello App Engine</title>
  </head>

  <body>
    <h1>This is a Sample page</h1>
    <% String name = request.getParameter("name"); %>
    <h2><%= name %></h2>
  </body>
</html>