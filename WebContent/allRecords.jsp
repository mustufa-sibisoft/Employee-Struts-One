<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Records | Employee CRUD</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function confirmDel(id) {
		const dataFullName = document.getElementById("fullName_" + id).innerText;
		const dataAge = document.getElementById("age_" + id).innerText;
		console.log(dataFullName, dataAge);
		if (confirm("Are you sure to delete " + dataFullName + "?")) {
			//window.location.href = "DeleteRecord.do?id=" + id;
			window.location.href = "ManageRecord.do?method=delete&id=" + id;
		}
	}
</script>

</head>
<body>
	<!-- JSP Directive -->
	<%@ page import="com.empstruts.*"%>

	<!-- JSP Core Tag -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<!-- JSP Scriplet -->
	<%
	HttpSession s = request.getSession();
	//EmployeeService.loadRecord();
	s.setAttribute("empList", EmployeeService.getAllEmployees());
	%>

	<div class="container">
		<div class="row">
			<div class="col">
				<br />
				<div style="text-align: center;">
					<h3>All Employees</h3>
					<br /> <a class="btn btn-primary" href="insertRecord.jsp">Add
						Employee</a> <br />
				</div>
				<br />
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Full Name</th>
							<th scope="col">Age</th>
							<th scope="col">Edit</th>
							<th scope="col">Delete</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${empList}" var="e">
							<tr id="${e.getId()}">
								<td id="fullName_${e.getId()}">${e.getFullName()}</td>
								<td id="age_${e.getId()}">${e.getAge()}</td>
								<td><a class="text-primary"
									href="editRecord.jsp?id=${e.getId()}">Edit</a></td>
								<td><a class="text-danger" style="cursor: pointer;"
									onclick="confirmDel(${e.getId()})">Delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>