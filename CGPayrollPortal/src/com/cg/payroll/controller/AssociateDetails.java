package com.cg.payroll.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/associateDetails")
public class AssociateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services;
	
	public void init() {
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId=Integer.parseInt(request.getParameter("associateId"));
		Associate associate=null;
		RequestDispatcher dispatcher=null;
		try {
			associate=services.getAssociateDetails(associateId);
			dispatcher= request.getRequestDispatcher("associateDetails.jsp");
			request.setAttribute("associate", associate);
			dispatcher.forward(request, response);	
		}catch(Exception e) {
			dispatcher= request.getRequestDispatcher("associateDetailsError.jsp");
			request.setAttribute("error", e.getMessage());
		}
	}
	public void destroy() {
		services=null;
	}
}