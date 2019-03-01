package com.cg.banking.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

@WebServlet("/bankingDepositMoney")
public class BankingDepositMoneyServlet extends HttpServlet{
	private BankingServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException{
		services=new BankingServicesImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo=Integer.parseInt(request.getParameter("accountNo"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		try {
			float balance=services.depositAmount(accountNo, amount);
			request.setAttribute("balance", balance);
			request.getRequestDispatcher("bankingDepositMoney.jsp").forward(request, response);	 
			}catch(Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("bankingDepositMoney.jsp").forward(request, response);	
			}
	}
	
	@Override
	public void destroy(){
		services=null;
	}
}
