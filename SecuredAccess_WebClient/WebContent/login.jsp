<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<font size="5" color="blue">Please login</font>
</body>
<hr>

<form action="j_security_check" method="post">
	<p><strong>Username </strong>
	<input type="text" name="j_username">
	<p><strong>Password </strong>
	<input type="password" name="j_password">
	<p>
	<input type="submit" value="login">
</form>
</html>