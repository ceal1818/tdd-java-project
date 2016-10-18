<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
	<div>
		<h1>Users - Edit</h1>
		<form:form action="save" method="post" modelAttribute="user">
			<form:hidden path="id"/>
			<table>
				<tr>
					<td>NickName: </td>
					<td>
						<form:input path="nickname"/>
					</td>
				</tr>
				<tr>
					<td>First name: </td>
					<td>
						<form:input path="firstName"/>
					</td>
				</tr>
				<tr>
					<td>Last name: </td>
					<td>
						<form:input path="lastName"/>
					</td>
				</tr>
				<tr>
					<td>Email: </td>
					<td>
						<form:input path="email"/>
					</td>
				</tr>
				<tr>
					<td>Age: </td>
					<td>
						<form:input path="age"/>
					</td>
				</tr>
				<tr>
					<td>Photo: </td>
					<td>
						<form:input path="photo"/>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>