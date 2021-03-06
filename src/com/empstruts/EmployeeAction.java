package com.empstruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class EmployeeAction extends DispatchAction {

	public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return mapping.findForward("seeAllRecords");
	}

	public ActionForward save(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		EmployeeForm empForm = (EmployeeForm) form;
		String fullName = empForm.getFullName();
		int age = Integer.parseInt(empForm.getAge());
		EmployeeService.addEmployee(fullName, age);

		return mapping.findForward("seeAllRecords");
	}

	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		EmployeeForm empForm = (EmployeeForm) form;
		int id = Integer.parseInt(empForm.getId());
		String fullName = empForm.getFullName();
		int age = Integer.parseInt(empForm.getAge());
		EmployeeService.editEmployee(id, fullName, age);

		return mapping.findForward("seeAllRecords");
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeService.deleteEmployee(id);
		return mapping.findForward("seeAllRecords");
	}

}
