<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	 
	 <title>Donor logout Page</title>
</head>
<body style="background-image:url('Images/blue_background.jpg')">
	 <%		
		 session.removeAttribute("DonorUserId");
		 session.removeAttribute("DonorPassword");
		 session.invalidate();
	 %>
	 
	 
<center>
	 <h1>You have successfully logged out</h1>
	 To Donor login again <a href="Donorlogin.jsp">click here</a><br><br>
	 
	 
</center>
</body>
</html>