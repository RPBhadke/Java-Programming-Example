<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>


</head>


<body style="background-image:url('Images/blue_background.jpg')">
<form method="post" action="DonorResult.jsp">
<div style="padding: 100px 0 0 250px;">


<div id="login-box">

<H2>Donor Login Page</H2>
Please provide your credential to use this website
<br />
<br />
<div id="login-box-name" style="margin-top:20px;">DonorUserId:</div>
<div id="login-box-field" style="margin-top:20px;">
<input name="DonoruserId" class="form-login" title="DonorName" value="" size="30" maxlength="50" />

</div><br></br>
<div id="login-box-name">DonorPassword:</div><br>
<div id="login-box-field">
<input name="Donorpassword" type="Donorpassword" class="form-login" title="Donorpassword" value="" size="30" maxlength="48" />
</div>
<br />
<span class="login-box-options">


</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Login" />
</div>

</div>

</form>

</body>
</html>