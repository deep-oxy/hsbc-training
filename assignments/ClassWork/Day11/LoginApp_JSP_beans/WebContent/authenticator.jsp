<%@page import="java.util.ArrayList"%>
<%@page import="com.hsbc.tr.web.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.hsbc.tr.web.User" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticator</title>
</head>
<body>
	<jsp:setProperty name="user" property="*" />
	<%
		User u = (User) session.getAttribute("user");
		if (u.isAuthenticated()) {
	%>
	<jsp:forward page="success.jsp" />
	<%
		} else {
	%>
	<jsp:forward page="failed.jsp" />
	<%
		}
	%>

</body>
</html>