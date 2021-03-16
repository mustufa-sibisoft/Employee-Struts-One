package com.empstruts;

import org.apache.struts.action.ActionForm;

public class EditEmployeeForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String hello = null;

	public EditEmployeeForm() {
		super();
		hello = "Hello Sibisoft";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public static void editEmployee(int id, String fullName, int age) {
		EmployeeManager.editEmployee(id, fullName, age);
	}
}

