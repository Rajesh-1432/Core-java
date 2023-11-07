<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form action="Store.jsp">
<label>Name</label>
<input type="text" class="form-control" name="name"><br>
<label>Gender</label>
Male<input type="radio" class="form-control" name="male">
Female<input type="radio" class="form-control" name="female">
Others<input type="radio" class="form-control" name="others"><br>
<label>Country</label>
<select name="country">
<option value="">Country</option>
<option value="india">India</option>
<option value="us">US</option>
<option value="canada">Canada</option>
</select>
<label>Email</label>
<input type="email" class="form-control" name="email"><br>
<label>Age</label>
<input type="number" class="form-control" name="age"><br>
<label>Qualification</label>
<input type="text" class="form-control" name="qual"><br>

<input type="submit" value="submit">
</form>
</div>
</body>
</html>