<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update Student Here</h2>
<hr>

<form action="update" method="post">

Id : <input type="text" name="stdId" readonly="readonly" value="${student.stdId}"><br><br>

Name  : <input type="text" name="stdName" value="${student.stdName}">
<br><br>

Mobile No : <input type="text" name="stdMno" value="${student.stdMno}">
<br><br>

<input type="submit" value="Register">
</form>
</body>
</html>