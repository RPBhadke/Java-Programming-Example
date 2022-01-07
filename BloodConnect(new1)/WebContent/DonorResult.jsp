<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import=" com.bloodconnect.model.Donor"%>
<%@page import=" com.bloodconnect.service.DonorLoginService"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 
	 <title>Welcome to the Result Page</title>	
</head>
<style>
*{
                    margin:0;
                    padding:0;
                    list-style:none;
                    text-decoration: none;
}
.header{
                    width:100%;
                    height: 50px;
                    display: block;
                    background-color:hsl(0, 87%, 76%);
                    text-align:center;
                    font-size: 18px;
                    padding: 10px;
                    font-family: cursive;
}
div.absolute {
                                                        
                                                            font-size:25px;
                                                            font-family: cursive;
                                        }
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td,th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
                                        
</style>
<body style="background-image:url('Images/blue_background.jpg')">
<center>
	 
	 <div class="header">
		 <h1>Donor Details</h1>
		 </div>
		 <div id="container">
		 
			 <br/>
			 </br>
			 <br>
			 <%
			 Donor donor = (Donor) session.getAttribute("donor");
			 %>		
			 
			 <div class="absolute"><h4>Find your match...</h4></div>  
			 
			
			 
			  	
			 <br/>
			 
		 </p>

		 <table>
			 <thead>
				 <tr>
				     <th>Donor UserId</th>
					 <th>Donor Name</th>
					 <th>Age</th>
					 <th>Gender</th>
					 <th>Address</th>
					 <th>MobileNumber</th>
					 <th>Blood Group</th>
					 <th>Email</th>
					 
					 
				 </tr>
			 </thead>
			 <tbody>
				 <%
				 DonorLoginService donorLoginService = new DonorLoginService();
					 List<Donor> list = donorLoginService.getListOfUsers();
					 for (Donor u : list) 
					 {
				 %>
				 <tr>
					 <td><%=u.getDonorUserId()%></td>
					 <td><%=u.getDonorName()%></td>
					 <td><%=u.getAge()%></td>
					  <td><%=u.getGender()%></td>
					  <td><%=u.getAddress()%></td>
					  <td><%=u.getMobileNumber()%></td>
					  <td><%=u.getBloodgroup()%></td>
					  <td><%=u.getEmail()%></td>
					 
					 
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		
		 <br/>
		 <a href="Donorlogout.jsp">Logout</a>
	 </div>
	</center>	
	<img src = "Images/logo.png" alt = "Connect Blood" style="position:absolute;bottom:20px;left:0px;width:270px;height:70px">
	
</body>
</html>