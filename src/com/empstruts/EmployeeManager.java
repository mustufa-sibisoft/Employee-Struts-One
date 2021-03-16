package com.empstruts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	private static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/", "root", "sibi@soft");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static void loadRecord() {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from mysql.employee_crud");

			EmployeeManager.clearList();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				EmployeeManager.addEmployeeToList(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void addEmployee(String fullName, int age) {

		try {
			Connection con = getConnection();

			Statement stmt = con.createStatement();
			stmt.executeUpdate(
					"insert into mysql.employee_crud(`full_name`, `age`) values('" + fullName + "', " + age + ")");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		loadRecord();
	}

	private static void addEmployeeToList(int id, String fullName, int age) {

		employeeList.add(new Employee(id, fullName, age));

	}

	public static void editEmployee(int id, String fullName, int age) {

		try {
			Connection con = getConnection();

			Statement stmt = con.createStatement();
			stmt.executeUpdate("update mysql.employee_crud set `full_name`='" + fullName + "', `age`=" + age
					+ " where `id`=" + id);

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		loadRecord();
	}

	public static void deleteEmployee(int id) {

		try {
			Connection con = getConnection();

			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from mysql.employee_crud where id=" + id);

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		loadRecord();
	}

	public static Employee getEmployee(int id) {

		for (Employee e : employeeList) {
			if (id == e.getId()) {
				return e;
			}
		}

		return null;
	}

	private static void clearList() {

		employeeList.clear();
	}

	public static List<Employee> getAllEmployees() {

		return employeeList;

	}
	
}
