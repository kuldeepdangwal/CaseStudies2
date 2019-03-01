package com.cg.payroll.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/allAssociateDetails")
public class AllAssociateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PayrollServices services;
	
	public void init() {
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Associate> associates = new ArrayList<Associate>();
		associates=services.getAllAssociatesDetails();
		request.setAttribute("associates", associates);
		request.getRequestDispatcher("allAssociateDetails.jsp").forward(request, response);
	}
	public void destroy() {
		services=null;
	}
}
