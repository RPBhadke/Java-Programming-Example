
package com.bloodconnect.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bloodconnect.model.Recipient;
import com.bloodconnect.service.RecipientLoginService;


public class RecipientLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String RecipientUserId = request.getParameter("RecipientUserId");	
		 String RecipientPassword = request.getParameter("RecipientPassword");
		 RecipientLoginService loginServicer = new RecipientLoginService();
		boolean result = loginServicer.authenticateUser(RecipientUserId, RecipientPassword);
		Recipient recipient = loginServicer.getUserByUserId(RecipientUserId);
		 if(result == true){
			 request.getSession().setAttribute("recipient", recipient);		
			 response.sendRedirect("RecipientResult.jsp");
		 }
		 else{
			 response.sendRedirect("error.jsp");
		 }
	}

}