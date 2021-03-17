package com.empstruts;

import org.apache.struts.action.ActionForm;

public class EditEmployeeForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	public EditEmployeeForm() {
		super();
	}

	public static void editEmployee(int id, String fullName, int age) {
		EmployeeManager.editEmployee(id, fullName, age);
	}
}
