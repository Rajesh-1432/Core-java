<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome connected page</h1>
<%
int n1=(Integer)session.getAttribute("Add");
int n2=(Integer)session.getAttribute("Mul");
int n3=(Integer)session.getAttribute("Div");
out.println("Add of::"+n1+"<br>");
out.println("Mul of::"+n2+"<br>");
out.println("Div of::"+n3+"<br>");
%>
</body>
</html>