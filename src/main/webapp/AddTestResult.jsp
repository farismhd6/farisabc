<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Result</title>
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
  </style></head>
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
    		<a class="navbar-brand text-white" href="TestResult">Store </a>
    		<a class="navbar-brand text-white" href="SearchTestResult.jsp">search and update </a>
    		<a class="navbar-brand bg-white text-dark rounded px-4" href="AddTestResult.jsp">Add </a>
  		</div>
	</nav>



    <br/>
    <br/>
	<div class="form-group px-5 mx-5 mb-4 ">
 	<div class=" px-5 mx-5">
 	<div class=" p-5 mx-5 bg-light">
    
    <div class="container ">        
    <h3>Register Result</h3>
        <br/>
        <p>${message}</p>
        <br/>
        <form method="post" action="testResultController">
            <br/>
            <label for="appointmentID">Appointment ID:</label>
            <input type="text" class="form-control" id="appointmentID" name="appointmentID"/>
            <br/>
            <br/>
            <label for="result">Result:</label>
            <input type="text" class="form-control" id="result" name="result"/>
            <br/>
            <br/>
            <label for="report">Report:</label>
            <!-- Assuming the report is uploaded as a file -->
            <input type="file" class="form-control" id="report" name="report"/>
            <input type="hidden" name="type" value="add"/>
            <br/>
            <br/>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>
</div>
</div>
</div>
</div>
</body>
</html>
