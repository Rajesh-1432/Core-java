<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
</head>
<body>

<h1>Welcome</h1>
<table class="table">
<thead>
<tr>
<th>Charector</th>
<th>Ascii code</th>
</tr>
</thead>

<%
//int a=10;
//int b=100;
//System.out.println("Addition:"+(a+b));
//System.out.println("difference:"+(b-a));
//System.out.println("Multiplication:"+(a*b));
String str1="Welcome";
for(int i=0;i<str1.length();i++){
	char ch=str1.charAt(i);
	int n1=(int)ch;	

%>
<tbody>
<tr>
<td><%=ch%></td>
<td><%=n1 %></td>
</tr>
</tbody>
<%
}
%>
</table>
</body>
</html>