<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ include file="jdbc1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
</head>
<body>
<div class="container">
<table>
<thead>
 <tr>

<th>Name</th>
<th>Gender</th>
<th>Country</th>
<th>Email</th>
<th>Age</th>
<th>Qualification</th>
</tr>
</thead>
<%
Statement st=con.createStatement();
String vsql="select * from Mreg";
ResultSet rs=st.executeQuery(vsql);
while(rs.next()){
%>
<tbody>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
</tr>
<%} %>
</tbody>
</table>
<a href="admin.jsp" class="btn btn-primay">GoBack</a>
<a href="mreg.jsp">Home</a>
</div>
</body>
</html>