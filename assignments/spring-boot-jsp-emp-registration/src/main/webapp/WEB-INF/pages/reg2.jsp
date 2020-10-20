<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<h1>Registration Form</h1>
	<hr>
	<br>
	<form action="reg2" method="post">
		<table>

			<tr>
				<td>ID:</td>
				<td><input name="id" type="text"><br /></td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><input name="name" type="text"><br /></td>
			</tr>
			<tr>
				<td>Location:</td>
				<td><input name="location" type="text"><br /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input name="salary" type="text"><br /></td>
			</tr>

		</table>
		<input value="Register" type="submit">
	</form>
</body>
</html>