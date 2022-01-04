<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">RegistrationAndLogin</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='<c:url value="/login"></c:url>'>Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link  active" aria-current="page" href='<c:url value="/"></c:url>'>Register</a>
        </li>
      </ul>
     
    </div>
  </div>
</nav>
<div class="container mt-5">
<div class="card" style="width: 55rem; ">
  <div class="card-header text-center bg-light" >
    Registration
  </div>
  <c:if test="${success != null}">
 <div  style="color: green;font-size: 20px;" role="alert"><c:out value="${success}"/></div>
</c:if>
  <div class="card-body" >
   <f:form action="register" modelAttribute="donor" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">DonorUserId</label>
    <f:input type="text" path="donorUserId" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">DonorName</label>
    <f:input type="text" path="donorName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email</label>
    <f:input type="text" path="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">DonorPassword</label>
    <f:input type="password" path="donorPassword" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Address</label>
    <f:textarea type="text" path="address" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Gender</label>
    <f:input type="text" path="gender" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">MobileNumber</label>
    <f:input type="text" path="mobileNumber" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Blood Group</label>
    <f:input type="text" path="bloodgroup" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Age</label>
    <f:input type="text" path="age"  class="form-control" id="exampleInputPassword1"/>
  </div>
  
  <center><button type="submit" class="btn btn-primary">Register</button></center>
</f:form>
  </div>
</div>
</div>
</body>
</html>