<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<h3>User Registration</h3>

	<form method="post" action="signIn">
		<table>
			<tr>
				<th></th>
				<th></th>

			</tr>
			<tr>
				<td><span>Email</span></td>
				<td><input type="email" name="emailTxt" /></td>
			</tr>
			<tr>
				<td><span>Name</span></td>
				<td><input type="text" name="userNameTxt" /></td>
			</tr>
			<tr>
				<td><span>Password</span></td>
				<td><input type="password" name="passwordTxt" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form>

</body>
</html>