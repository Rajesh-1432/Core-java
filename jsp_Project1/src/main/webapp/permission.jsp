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
<form action="permissiondb.jsp">
<div class="container" style="width:40%;background:peru">
<select name="user">
<option value="">permission</option>
<option value="user">user</option>
<option value="csp">csp</option>
<option value="tpa">tpa</option>

</select></br>
Grant<input type="radio" name="per" value="grant">
Revoke<input type="radio" name="per" value="revoke"></br>
<input type="submit" value="submit" class="btn btn-primary">

</div>
</form>
</body>
</html>