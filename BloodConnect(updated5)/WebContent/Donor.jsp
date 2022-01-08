<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <html>
<head>
  <title>Welcome to the Donor Registration page</title>
<form action="DonorRegisterServlet" method="POST">
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
.form{
                    border: 5px outset red;
                    background-color:lightblue;
                    width:400px;
                    height:400px;
                    display: block;
                    position:absolute;
                    left:450px;
                    top: 150px;
}
.innertext{
                    display: block;
                    position:absolute;
                    left:60px;
                    top: 40px;       
}
#textarea{
                    border-radius: 4px;
                    background-color:rgb(247, 250, 236) ;
                    float:right;
}
.requirements{
                    display:block;
                    position:absolute;
                    right:5px;
                    top:90px;
                    font-style: italic;
                    width:400;
                    height:500;
                    font-size: 15px;
                    word-spacing: 10px;
                    line-height: 30px;
}


#area{
                    position:absolute;
                    left:110px;
                    border-radius: 4px;
                    background-color:rgb(247, 250, 236) ;
}
</style>
<body style="background-image:url('Images/blue_background.jpg')">
                    
                    <div class="header">
                                        
                                        <h1>Donor Registration</h1>  
                    </div>
                    
   <img src="Images/donor.png" alt="Donar image" height="350" width="350" style="position:absolute;left:20px;bottom: 140px;"> 
   <img src = "Images/logo.png" alt = "Connect Blood" style="position:absolute;bottom:20px;left:0px;width:270px;height:70px">
<div class="form">
                    <div class="innertext">
<label for="DonorName">Donor Name: </label>
  <input type="text" id="textarea" name="DonorName"><br><br>
  <label for="Address">Address: </label>
  <input type="text" id="textarea" name="Address"><br><br>
  <label for="Age">Age:</label>
  <input type="text" id="textarea" name="Age"><br><br>
  <label for="Gender">Gender: </label>
 <select id="textarea" name="Gender"><br><br>
      <option value="Male">Male</option>
      <option value="Female">Female</option>
      <option value="Other">Other</option>
   </select><br><br>
 
  <label for="MobileNumber">Mobile Number: </label>
  <input type="text" id="textarea" name="MobileNumber"><br><br>
  <label for="Bloodgroup">Blood Group: </label>
  <select id="textarea" name="Bloodgroup"><br><br>
      <option value="A+">Group A+</option>
      <option value="B+">Group B+</option>
      <option value="AB+">Group AB+</option>
      <option value="O+">Group O+</option>
      <option value="A-">Group A-</option>
      <option value="B-">Group B-</option>
      <option value="AB-">Group AB-</option>
      <option value="O-">Group O-</option>
  </select><br><br>
   <label for="Email">Email Id: </label>
  <input type="text" id="textarea" name="Email"><br><br>
   <label for="DonorUserId">DonorUserId: </label>
  <input type="text" id="textarea" name="DonorUserId"><br><br>
   <label for="DonorPassword">Donor Password: </label>
  <input type="password" id="textarea" name="DonorPassword"><br><br>

  <center>
        
   <input type="submit" id="submit" value="Submit">
    <input type="reset" value="Reset">  
   </center>
  </div>
                    
</div>
<div>
                    <p class ="requirements"><b>Basic requirements for donors:</b><br><br>

                                       <b>*</b>	   The donor must be fit and healthy, and should not be suffering from transmittable diseases.<br><br>
                                        
                                        <b>*</b>	<b>Age and weight</b>- Between 18-€œ65 years old and should weigh a minimum of 50 kg.<br><br>
                                        
                                        <b>*</b>    <b>Pulse rate</b>- Between 50 and 100 without irregularities.<br><br>
                                        
                                        <b>*</b>	<b>Haemoglobin level</b>- A minimum of 12.5 g/dL.<br><br>
                                        
                                        <b>*</b>	<b>Blood pressure</b>- Diastolic: 50-100 mm Hg, Systolic: 100-180 mm Hg.<br><br>
                                        
                                        <b>*</b>	<b>Body temperature</b>- Should be normal, with an oral temperature not exceeding 37.5 °C.<br><br>
                                        
                                        <b>*</b>	   The time period between successive blood donations should be more than 3 months.</p><br><br>
</div>

</body>


</html>