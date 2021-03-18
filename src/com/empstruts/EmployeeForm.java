package com.empstruts;

import org.apache.struts.action.ActionForm;

public class EmployeeForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String id;
	private String fullName;
	private String age;

	public EmployeeForm() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
