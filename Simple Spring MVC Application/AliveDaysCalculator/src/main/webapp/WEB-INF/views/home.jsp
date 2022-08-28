<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form submit</title>
</head>
<body>
	<form:form action="register.html" method="POST"
		modelAttribute="userForm">
		<table border="0">
			<tr>
				<td colspan="2" align="center"><h2>Spring MVC Application</h2></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><form:input type="text" path="userName" /></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><form:input type="date" path="birthDate" /></td>
			</tr>
			<tr>
				<td><form:button>Register</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>

