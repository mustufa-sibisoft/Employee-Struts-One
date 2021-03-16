package com.empstruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class EditEmployeeAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("inputId"));
		String fullName = request.getParameter("inputFullName");
		int age = Integer.parseInt(request.getParameter("inputAge"));
		
		EditEmployeeForm.editEmployee(id, fullName, age);
		
		return mapping.findForward("hello");
	}

}
