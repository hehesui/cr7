//simple jsp page to display...

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
</head>
<body>
	<div class="container">
  <h2>Registration form</h2>
  <form action="SubmiteData.jsp">
     Username  :<br>
     <input type="text"  id="uname" placeholder="Enter username." name="uname"><br> <br> 
   
     Password :<br>       
     <input type="password"  id="password" placeholder="Enter Password" name="password"><br> <br> 
      
	 Country :<br>      
        <input type="text"  id="country" placeholder="Country" name="country"><br> <br> 
  
   	 Email :<br>
      
        <input type="email"  id="email" placeholder="Enter email" name="email"><br> <br> <br> 
     
        <button type="submit" >Submit</button>
  </form>
	
</body>
</html>


---------------------------------------------------------------------

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	 import="java.io.*,java.util.*,java.sql.*"
	
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
</head>
<body >

	  
    <%
	String  username = request.getParameter("uname");
	String  password1 = request.getParameter("password");
	String  country1 = request.getParameter("country");
	String  email1 = request.getParameter("email");
		
	%>	
	<h1><center><%= username %></center></h1>
	<h1><center><%= password1 %></center></h1>
	<h1><center><%= country1 %></center></h1>
	<h1><center><%= email1 %></center></h1>

</body>
</html>
