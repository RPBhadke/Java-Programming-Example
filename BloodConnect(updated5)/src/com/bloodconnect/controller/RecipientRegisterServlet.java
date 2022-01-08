
package com.bloodconnect.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bloodconnect.model.Recipient;
import com.bloodconnect.service.RecipientRegisterService;

@WebServlet("/RecipientRegisterServlet")
public class RecipientRegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 String RecipientName=request.getParameter("RecipientName");
	 String Age=request.getParameter("Age");
     String Gender=request.getParameter("Gender");
     String Address=request.getParameter("Address");
     String  MobileNumber=request.getParameter("MobileNumber");
     String Bloodgroup=request.getParameter("Bloodgroup");
	 String Email=request.getParameter("Email");
	 String RecipientUserId=request.getParameter("RecipientUserId");
     String RecipientPassword=request.getParameter("RecipientPassword");
	 Recipient recipient = new Recipient(RecipientName,Age,Gender,Address,MobileNumber,Bloodgroup,Email,RecipientUserId,RecipientPassword);
			
	 try {	
		 RecipientRegisterService registerServiced = new RecipientRegisterService();
		 boolean result = registerServiced.register(recipient);		
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Registration Successful</title>");		
		 out.println("</head>");
		 out.println("<body  style=\"background-image:url('Images/blue_background.jpg')\">");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Thanks for Registering with us :</h1>");
			 out.println("To login with UserId and Password<a href=Recipientlogin.jsp>Click here</a>");
		 }else{
			 out.println("<h1>Registration Failed</h1>");
			 out.println("To try again<a href=Recipient.jsp>Click here</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
}

}