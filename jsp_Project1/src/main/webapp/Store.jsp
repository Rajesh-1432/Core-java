<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<%@ include file="jdbc1.jsp" %>
<%
String vname=request.getParameter("name");
String vgender=request.getParameter("gender");
String vcountry=request.getParameter("country");
String vemail=request.getParameter("email");
int vage=Integer.parseInt(request.getParameter("age"));
String vqual=request.getParameter("qual");
String vsql="insert into Mreg values(?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(vsql);
pst.setString(1, vname);
pst.setString(2, vgender);
pst.setString(3, vcountry);
pst.setString(4, vemail);
pst.setInt(5, vage);
pst.setString(6, vqual);
int n1=pst.executeUpdate();
if(n1!=-1){
%>
<script>
alert("Inserted Succesfully");
window.location="sus.jsp";
</script>
<%} %>