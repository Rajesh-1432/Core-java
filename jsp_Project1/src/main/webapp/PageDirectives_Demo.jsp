<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.util.*,java.io.*"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
</head>
<body>
<div class="container" style="width:40%;background:pink">
<%
List l= new ArrayList();
l.add("Hai");
l.add("Hello");
l.add("Happy Journey");
l.add(22);
l.add(20);
l.add(222);
Iterator it=l.iterator();
while(it.hasNext()){
%>
<table class="table table-bordered">
<thead>
<tr class='active'></tr>
</thead>
<tbody>
<tr><%=it.next()%></tr>
</tbody>
</table>

<%
}
%>
</div>
</body>
</html>