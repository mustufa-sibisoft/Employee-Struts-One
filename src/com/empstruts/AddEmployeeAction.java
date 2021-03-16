package com.empstruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AddEmployeeAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String fullName = request.getParameter("inputFullName");
		int age = Integer.parseInt(request.getParameter("inputAge"));
		
		AddEmployeeForm.addEmployee(fullName, age);
		
		//return mapping.findForward("hello");
		response.sendRedirect("AllRecords.do");
		return null;
	}

}
