
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>kfc colombo</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
  <style>
   body {
      background-image: url('img/');
      background-size: cover;
      background-position: center;
      background-attachment: fixed;
    }
  .custom-box1 {
      background-image: url('img/doctor.jpg'); 
      background-size: cover;
      background-position: center;
      filter: brightness(1);
      border-radius: 5px;
    }
    
    .about-section {
      background-color: #f8f9fa;
      padding: 50px 0;
    }
    .about-heading {
      margin-bottom: 30px;
    }
    .icon {
      font-size: 48px;
      margin-bottom: 15px;
    }
    .navbar-brand {
      margin-left: auto;
      margin-right: auto;
      display: table;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container">
    <img class="mx-2" style="border-radius:10%;width: 50px;height: 50px;" alt="Hospitel Logo" src="img/logo1.png">
    <a class="navbar-brand d-none d-lg-block" href="#">International Lab</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link text-dark mx-2 " href="User_Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="User_Home.jsp">Services</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="User_Home.jsp">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="User_Home.jsp">Contact</a>
        </li>
        
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid">
    <nav class="navbar navbar-expand-lg navbar-light  mt-3 ">
  		<div class="container bg-dark py-1 rounded">
    		<a class="navbar-brand text-white" href="Appointment">Appointments </a>
    		<a class="navbar-brand bg-white text-dark rounded px-4" href="SearchAppointment.jsp">search and update </a>
    		<a class="navbar-brand text-white" href="AddAppointment.jsp">Add </a>
  		</div>
	</nav>


<br/>
    <br/>
    <div class="form-group px-5 mx-5 mb-4 ">
 	<div class=" px-5 mx-5">
 	<div class=" p-5 mx-5 bg-light">
    
    <div class="container ">
    <div class="row">
    	<div class="col-md-12 text-center">
        	<h1>Register Appointment</h1>
        	<p>${message}</p>
    	</div>
  	</div>
        <form method="get" action="appointment">
            <label for="appointmentID">Appointment ID: </label>
            <input type="number" class="form-control" id="appointmentID" name="appointmentID"/>
            <input type="hidden" name="type" value="specific"/>
            <br/>
            <button type="submit" class="btn btn-info">Search</button>
        </form>

        <br/>
        <p>${message}</p>
        <br/>
        <h3>Edit Appointment-----------------</h3>
        <br/>
        <br/>
        <form method="post" action="appointment">
            <label for="appointmentID">Appointment ID:    </label>
            <input type="text" readonly class="form-control" id="appointmentID" name="appointmentID" value="${appointment.appointmentID}"/>
            <br/>
            <br/>
            <label for="patientID">Patient ID:    </label>
            <input type="text" class="form-control" id="patientID" name="patientID"  value="${appointment.patientID}"/>
            <br/>
            <br/>
            <label for="date">Appointment Date:    </label>
            <input type="date" class="form-control" id="date" name="date"  value="${appointment.appointmentDate}"/>
            <br/>
            <br/>
            <label for="test">Test Name:    </label>
            <input type="text" class="form-control" id="test" name="test"  value="${appointment.testName}"/>
            <br/>
            <br/>
            <label for="request">Appointment Request:    </label>
            <input type="text" class="form-control" id="request" name="request"  value="${appointment.appointmentRequest}"/>
            <input type="hidden" name="type" value="update"/>
            <br/>
            <br/>
            <button type="submit" class="btn btn-warning">Update</button>
        </form>
    </div>
</div>
</div>
</div>
</div>
</body>
</html>
