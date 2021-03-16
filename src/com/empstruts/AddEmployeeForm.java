package com.empstruts;

import org.apache.struts.action.ActionForm;

public class AddEmployeeForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	//private String hello = null;

	public AddEmployeeForm() {
		super();
		//hello = "Hello Sibisoft";
	}

//	public String getHello() {
//		return hello;
//	}
//
//	public void setHello(String hello) {
//		this.hello = hello;
//	}
	
	public static void addEmployee(String fullName, int age) {
		EmployeeManager.addEmployee(fullName, age);
	}
}
