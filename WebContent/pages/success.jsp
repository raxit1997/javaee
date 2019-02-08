<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<%
		if (request.getAttribute("name") != null) {		
	%>
	<h2>Login Successful for user ${requestScope.name}</h2>
	<%
		} else {
	%>
	<h2>Request object not received</h2>
	<%
		}
	%>
</body>
</html>