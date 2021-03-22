package com.empstruts;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	public static void addEmployee(String fullName, int age) {
		
		Employee emp = new Employee();
		emp.setFullName(fullName);
		emp.setAge(age);

		EmployeeDAO.addEmployee(emp);
		loadRecord();
		
	}

	public static void editEmployee(int id, String fullName, int age) {

		Employee emp = new Employee();
		emp.setFullName(fullName);
		emp.setAge(age);
		emp.setId(id);

		EmployeeDAO.updateEmployee(emp);
		loadRecord();
		
	}

	public static void deleteEmployee(int id) {

		EmployeeDAO.deleteEmployee(id);
		loadRecord();
		
	}

	public static void loadRecord() {

		clearList();
		for (Employee retrivedEmp : getAllEmployees()) {
			System.out.println(retrivedEmp.getFullName());
			System.out.println(retrivedEmp.getAge());
			addEmployeeToList(retrivedEmp.getId(), retrivedEmp.getFullName(), retrivedEmp.getAge());
		}

	}

	public static Employee getEmployee(int id) {

		for (Employee e : employeeList) {
			if (id == e.getId()) {
				return e;
			}
		}

		return null;

	}

	public static List<Employee> getAllEmployees() {

		return EmployeeDAO.getAllEmployees();

	}
	
	private static void clearList() {

		employeeList.clear();

	}

	private static void addEmployeeToList(int id, String fullName, int age) {

		employeeList.add(new Employee(id, fullName, age));

	}

}
