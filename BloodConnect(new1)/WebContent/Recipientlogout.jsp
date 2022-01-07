<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	 
	 <title>Recipient logout Page</title>
</head>
<body style="background-image:url('Images/blue_background.jpg')">
	 <%		
		 session.removeAttribute("RecipientUserId");
		 session.removeAttribute("RecipientPassword");
		 session.invalidate();
	 %>
	 
	 
<center>
	 <h1>You have successfully logged out</h1>
	 To Recipient login again <a href="Recipientlogin.jsp">click here</a>
	 
</center>
</body>
</html>