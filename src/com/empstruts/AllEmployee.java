package com.empstruts;

import org.apache.struts.action.ActionForm;

public class AllEmployee extends ActionForm {
	private static final long serialVersionUID = 1L;
	private String hello = null;

	public AllEmployee() {
		super();
		EmployeeManager.loadRecord();
		//hello = "Hello All Employees";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}
