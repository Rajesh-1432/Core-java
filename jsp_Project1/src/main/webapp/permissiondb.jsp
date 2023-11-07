<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ include file="jdbc1.jsp"%>
<% 
String vuser=request.getParameter("user");
String vper=request.getParameter("permission");
String vsql="insert into per values(?,?)";
PreparedStatement pst=con.prepareStatement(vsql);
pst.setString(1,vuser);
pst.setString(2,vper);
int n1=pst.executeUpdate();
if(n1!=-1){
%>
<script type="text/javascript">
alert("permission Granted");
window.location="Mreg.jsp";
</script>
<% }%>