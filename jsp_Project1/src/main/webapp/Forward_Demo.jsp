<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welocome Forward Demo</h1>
<%
int a=10;
int b=30;
int c=a+b;
int d=a*b;
int e=a/b;
session.setAttribute("Add", c);
session.setAttribute("Mul", d);
session.setAttribute("Div", e);

%>
<label></label>
<jsp:forward page="/F1.jsp"></jsp:forward>
</body>
</html>