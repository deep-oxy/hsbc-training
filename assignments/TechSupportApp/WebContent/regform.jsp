<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<h1>Customer Registration</h1>
	<hr>
	Please register here.
	<br>
	<br>
	<form action="regform" method="POST">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" size="30"></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" size="30"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" size="30"></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phoneNumber" size="30"></td>
			</tr>
		</table>
		<input type="hidden" name="action" value="register"> <br>
		<input type="submit" value="Submit Request">
	</form>
</body>
</html>