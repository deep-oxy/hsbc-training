<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<h1>Registration Successful with the following data,</h1>
	<hr>
	<br>
	<table>
		<tr>
			<td>ID:</td>
			<td>${data.id}</td>
		</tr>

		<tr>
			<td>Name:</td>
			<td>${data.name}</td>
		</tr>
		<tr>
			<td>Location:</td>
			<td>${data.location}</td>
		</tr>
		<tr>
			<td>Salary:</td>
			<td>${data.salary}</td>
		</tr>
	</table>
	<br>
	<a>Go to Registration page</a>
</body>
</html>