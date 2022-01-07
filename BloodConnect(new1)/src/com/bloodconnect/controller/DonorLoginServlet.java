package com.bloodconnect.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bloodconnect.model.Donor;
import com.bloodconnect.service.DonorLoginService;

public class DonorLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String DonorUserId = request.getParameter("DonorUserId");	
		 String DonorPassword = request.getParameter("DonorPassword");
		 DonorLoginService loginServiced = new DonorLoginService();
		boolean result = loginServiced.authenticateUser(DonorUserId, DonorPassword);
		Donor donor = loginServiced.getUserByUserId(DonorUserId);
		 if(result == true){
			 request.getSession().setAttribute("donor", donor);		
			 response.sendRedirect("DonorResult.jsp");
		 }
		 else{
			 response.sendRedirect("error.jsp");
		 }
	}

}
