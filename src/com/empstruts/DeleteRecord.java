package com.empstruts;

import org.apache.struts.action.ActionForm;

public class DeleteRecord extends ActionForm {
	private static final long serialVersionUID = 1L;
	private String hello = null;

	public DeleteRecord() {
		super();
		hello = "Delete All Employees";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public static void deleteEmployee(int id) {
		EmployeeManager.deleteEmployee(id);
	}
}