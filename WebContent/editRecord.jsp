<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Record | Employee CRUD</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<%@ page import="com.empstruts.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));

		Employee e = EmployeeManager.getEmployee(id);

		request.setAttribute("fullName", e.getFullName());
		request.setAttribute("age", e.getAge());
		request.setAttribute("id", id);
	%>

	<div class="container text-center">
		<br />
		<h3>Edit Employee</h3>
		<br />
		<form action="EditRecord.do" method="get">
			<div class="mb-3 row d-none">
				<label for="inputId" class="col-sm-2 col-form-label">ID</label>
				<div class="col">
					<input type="number" class="form-control" id="inputId"
						name="inputId" value="${id}" readonly>
				</div>
			</div>
			<div class="mb-3 row">
				<label for="inputFullName" class="col-sm-2 col-form-label">Full
					Name</label>
				<div class="col">
					<input type="text" class="form-control" id="inputFullName"
						name="inputFullName" value="${fullName}" required>
				</div>
			</div>
			<div class="mb-3 row">
				<label for="inputAge" class="col-sm-2 col-form-label">Age</label>
				<div class="col">
					<input type="number" class="form-control" id="inputAge"
						name="inputAge" value="${age}" required>
				</div>
			</div>
			<br />
			<div class="mb-3 row">
				<div class="col">
					<button type="submit" class="btn btn-primary mb-3">Save</button>
				</div>
			</div>
		</form>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>