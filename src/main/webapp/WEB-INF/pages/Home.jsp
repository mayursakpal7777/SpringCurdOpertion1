<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Home Page</h2>
<hr>
<a href="add">Add Student</a>
<hr>
<table border="1">

<thead>
	<tr>
		<th>Sr.No</th>
		<th>Name</th>
		<th>Mobile No</th>
		<th>Action</th>
	</tr>
</thead>
<tbody>
	 <c:forEach items="${studentList}" var="student">
       <tr>
       		<td>${student.stdId}</td>
       		<td>${student.stdName}</td>
       		<td>${student.stdMno}</td>
       		<td>
       			<a href="delete?id=${student.stdId}">Delete</a> | 
       			<a href="edit?id=${student.stdId}">Update</a>
       		</td>
       </tr>
      </c:forEach>
</tbody>
</table>
</body>
</html>