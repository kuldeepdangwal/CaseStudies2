package com.cg.payroll.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/calculate")
public class CalculateNetSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services;
	public void init() {
		services = new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId=Integer.parseInt(request.getParameter("associateId"));
		@SuppressWarnings("unused")
		int netSalary=services.calculateNetSalary(associateId);
		Associate associate = services.getAssociateDetails(associateId);
		request.setAttribute("associate", associate);
		request.getRequestDispatcher("netSalary.jsp").forward(request, response);
	}
	public void destroy() {
		services=null;
	}
}
