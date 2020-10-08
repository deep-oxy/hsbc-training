<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cart</title>
</head>
<body>
	<h1 style="color: blue">Everyday Shopping Experience</h1>
	<h1 style="color: blue" align="center">Cart Items</h1>
	<hr>
	<p>Cart Items will appear here.</p>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies.length > 0) {
	%>
	<table>
		<tr>
			<td>Item Name</td>
			<td>Item Price</td>
		</tr>
		<%
			for (Cookie c : cookies) {
		%>
		<tr>
			<td><%=c.getName()%></td>
			<td><%=c.getValue()%></td>
		</tr>

		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	<h1>No Items In Cart</h1>
	<%
		}
	%>

</body>
</html>