<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%!
int age=23;
String name="Raj";
double sal=230000;
static String bname="hyd";
public void show(){
	System.out.println("Age::"+age);
	System.out.println("Name::"+name);
	System.out.println("Salary::"+sal);
	System.out.println("Location::"+bname);
}

%>
<%
show();

%>
Age::<%=age %><hr>
Name::<%=name %><hr>
Salary::<%=sal %><hr>
Location::<%=bname %><hr>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</body>
</html>