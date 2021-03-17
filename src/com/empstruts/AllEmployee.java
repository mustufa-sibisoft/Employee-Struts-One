package com.empstruts;

import org.apache.struts.action.ActionForm;

public class AllEmployee extends ActionForm {
	private static final long serialVersionUID = 1L;

	public AllEmployee() {
		super();
		EmployeeManager.loadRecord();
	}

}
