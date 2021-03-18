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

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<style>
.save-btn>input {
	color: white;
	background-color: #0d6efd;
	border: 1px solid #0d6efd;
	border-radius: .25rem;
	padding: 4px;
	width: 50px;
}
</style>

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
		<html:form action="ManageRecord.do" method="get">
			<div class="mb-3 row">
				<div class="col-lg-12 d-none">
					<label class="col-sm-2 col-form-label">ID</label>
					<html:text property="id" value="${id}" />
				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-lg-12">
					<label class="col-sm-2 col-form-label">Full Name</label>
					<html:text property="fullName" value="${fullName}" />
				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-lg-12">
					<label class="col-sm-2 col-form-label">Age</label>
					<html:text property="age" value="${age}" />
				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-lg-12 save-btn">
					<html:submit property="method" value="edit" />
				</div>
			</div>
		</html:form>

	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>