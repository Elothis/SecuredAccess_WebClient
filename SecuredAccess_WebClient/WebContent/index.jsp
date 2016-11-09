<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Secured Access EJB</title>
</head>
<body>

	<a href="work?action=basicTask">Basic task</a>
	<br>
	<a href="work?action=managingTask">Managing task</a>
	<br>
	<a href="work?action=administrationTask">Administration task</a>
	<p>
	${result }
	<p><p>
	<a href="logout.jsp">Logout</a>
</body>
</html>