<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h3>User Login</h3>

	<form method="post" action="signUp">
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
				<td><span>Password</span></td>
				<td><input type="password" name="passwordTxt" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>

	</form>

</body>
</html>