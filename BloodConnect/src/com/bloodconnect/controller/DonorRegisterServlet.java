
package com.bloodconnect.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bloodconnect.model.Donor;
import com.bloodconnect.service.DonorRegisterService;
@WebServlet("/DonorRegisterServlet")
public class DonorRegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String DonorName = request.getParameter("DonorName");
		Long Age = request.getContentLengthLong();
		String Gender = request.getParameter("Gender");
		String Address = request.getParameter("Address");
		Long MobileNumber = request.getContentLengthLong();
		String Bloodgroup = request.getParameter("Bloodgroup");
		String Email = request.getParameter("Email");
		String DonorUserId = request.getParameter("DonorUserId");
		String DonorPassword = request.getParameter("DonorPassword");
		
		
Donor donor = new Donor(DonorName, Age, Gender, Address, MobileNumber, Bloodgroup, Email, DonorUserId,DonorPassword);
		try {
			DonorRegisterService registerServiced = new DonorRegisterService();
			// boolean result = registerServiced.register(donor);
			boolean result = registerServiced.register(donor);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Registration Successful</title>");
			out.println("</head>");
			out.println("<body  style=\"background-image:url('Images/blue_background.jpg')\">");
			out.println("<center>");
			if (result) {
				out.println("<h1>Thanks for Registering with us :</h1>");
				out.println("To login with UserId and Password<a href=Donorlogin.jsp>Click here</a>");
			} else {
				out.println("<h1>Registration Failed</h1>");
				out.println("To try again<a href=Donor.jsp>Click here</a>");
			}
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

}