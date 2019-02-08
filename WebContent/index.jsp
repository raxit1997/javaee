<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<%@ page import="com.zilker.config.Config"%>
	<%--  --%><jsp:include page="./pages/welcome-registration.jsp" />  
	<form action="${Config.BASE_PATH}HelloServlet" method="post">
		<label for="first-name">First Name: </label>
		<input type="text" id="first-name" name="fname"><hr />
		<label for="last-name">Last Name: </label>
		<input type="text" id="last-name" name="lname"><hr />
		<label for="dept-name">Department Name: </label>
		<input type="text" id="dept-name" name="deptname"><hr />
		<label for="regno">Registration Number: </label>
		<input type="text" id="regno" name="regno"><hr />
		<label for="year">Passing year: </label>
		<input type="number" id="year" name="year"><hr />
		<input type="Submit" value="Submit">
	</form>
</body>
</html>