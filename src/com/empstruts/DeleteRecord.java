package com.empstruts;

import org.apache.struts.action.ActionForm;

public class DeleteRecord extends ActionForm {
	private static final long serialVersionUID = 1L;

	public DeleteRecord() {
		super();
	}

	public static void deleteEmployee(int id) {
		EmployeeManager.deleteEmployee(id);
	}
}