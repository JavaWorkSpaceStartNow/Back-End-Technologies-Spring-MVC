<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-3">
		<h2 class="text-center">User List</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>FirstName</th>
					<th>MiddleName</th>
					<th>LastName</th>
					<th>Gender</th>
					<th>EmailAddress</th>
					<th>PhoneNumber</th>
					<th>Technologies</th>
					<th>Country</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${user.firstName}</td>
					<td>${user.middleName}</td>
					<td>${user.lastName}</td>
					<td>${user.gender}</td>
					<td>${user.emailAddress}</td>
					<td>${user.phoneNumber}</td>
					<td><c:forEach var="temp" items="${user.technologies}">

							<li>${temp}</li>

						</c:forEach></td>
					<td>${user.country}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>