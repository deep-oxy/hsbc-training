<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Front</title>
</head>
<body>
	<h1 style="color: blue">Everyday Shopping Experience</h1>
	<hr>
	<form action="shoppingcart" method="post">
		Item Name: <input type="text" name="itemname"> <br />
		ItemPrice: &nbsp;<input type="text" name="itemprice"> <br />
		<br /> <input type="submit" value="Add Item">
	</form>
	<br />
	<a href="view_cart.jsp">View Cart</a>
	<br />
	<a href="shoppingcart?itemname=Pen&itemprice=30">Pen</a>

</body>
</html>