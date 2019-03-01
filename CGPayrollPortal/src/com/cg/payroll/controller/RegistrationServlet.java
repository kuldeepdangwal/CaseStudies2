package com.cg.payroll.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services;
	@Override
	public void init() {
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int yearlyInvestmentUnder80c = Integer.parseInt(request.getParameter("yearlyInvestmentUnder80c"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailId = request.getParameter("emailId");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		String pancard = request.getParameter("panCard");
		int basicSalary = Integer.parseInt(request.getParameter("basicSalary"));
		int epf = Integer.parseInt(request.getParameter("epf"));
		int companyPf = Integer.parseInt(request.getParameter("companyPf"));
		int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
		String bankName = request.getParameter("bankName");
		String ifscCode = request.getParameter("ifscCode");
		int associateId = services.acceptAssociateDetails(new Associate(yearlyInvestmentUnder80c, firstName, lastName, department, designation, pancard, emailId, new Salary(basicSalary,epf,companyPf), new BankDetails(accountNumber,bankName,ifscCode)));
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("successPage.jsp");
		request.setAttribute("associateId", associateId);
		dispatcher.forward(request, response);
	}
	@Override
	public void destroy() {
		services=null;
	}
}