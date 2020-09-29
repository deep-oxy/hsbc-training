
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tags Here</title>
</head>
<body>
	<%--Declaration tag puts code outside _jspService() --%>
	<%!String fname = "Piyush";
	String lname = "Deep";

	public String concat(String s1, String s2) {
		return s1 + " " + s2;
	}%>

	<%--Expression Tag puts code inside out.print() in _jspService --%>
	<%=(fname + " " + lname)%>

	<%=new Date()%>

	<%=concat("Micheal", "Jackson")%>

	<%--Scriptlets put code as such inside _jspService() --%>
	<%
		out.print(fname + "+" + lname);
		ArrayList<String> a1 = new ArrayList<>();
	%>


</body>
</html>