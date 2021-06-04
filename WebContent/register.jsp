<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Industrial Master</h1>
	<p>Train Your Brain</p>
	<hr/>
	<a href = "register.jsp">Register</a>
	<a href = "login.jsp">Login</a>
	<h3>Registration Page</h3>
	<hr>
	<form action="reg" method="post">
	<label>Name</label><br>
	<input type="text" name="name"><br>
	<label>Address</label><br>
	<input type="text" name="address"><br>
	<label>Telephone</label><br>
	<input type="text" name="telephone"><br>
	<input type="submit" name="submit" value="REGISTER">
	</form>
</body>
</html>