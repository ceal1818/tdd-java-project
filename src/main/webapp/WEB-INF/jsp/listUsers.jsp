<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
	<div>
		<h1>Users - List</h1>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>Nickname</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Actions</td>
			</tr>
			<c:forEach var="user" items="${users}" >
			<tr>
				<td>${user.id}</td>
				<td>${user.nickname}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>
					<a href="/users/edit?id=${user.id}">Edit | </a>
					<a href="/users/remove?id=${user.id}">Delete</a>
				</td>				
			</tr>
			</c:forEach>
		</table>
		<a href="/users/new">Create</a>
	</div>
</body>
</html>