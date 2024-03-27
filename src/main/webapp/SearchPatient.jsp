<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <title>Search and Update Patient</title>
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
    		<a class="navbar-brand text-white" href="patient">Store </a>
    		<a class="navbar-brand bg-white text-dark rounded px-4" href="SearchPatient.jsp">search and update </a>
    		
  		</div>
		</nav>
        <br/>
        <br/>
        <div class="form-group px-5 mx-5 mb-4 ">
 	<div class=" px-5 mx-5">
 	<div class=" p-5 mx-5 bg-light">
    
    <div class="container ">
            <h3>Search Patient</h3>
            <br/>
            <form method="get" action="patientController">
                Enter Patient ID: <input type="text" name="patientId">
                <input type="hidden" name="type" value="specific">
                <button type="submit" class="btn btn-info">Search</button>            
            </form>
                        
            <br/>
            <p>${searchResult}</p>
            <br/>
            <h3>Edit Patient</h3>
            <br/>
            <form method="post" action="patientController">
                <label for="patientId">Patient ID:</label>
                <input type="text" readonly class="form-control" id="patientId" name="patientId" value="${not empty patient ? patient.idPatient : ''}"/>
                <br/>
                <label for="fullName">Full Name:</label>
                <input type="text" class="form-control" id="fullName" name="fullName"  value="${not empty patient ? patient.fullName : ''}"/>
                <br/>
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email"  value="${not empty patient ? patient.email : ''}"/>
                <br/>
                <label for="phoneNumber">Phone Number:</label>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber"  value="${not empty patient ? patient.phoneNumber : ''}"/>
                <br/>
                <label for="address">Address:</label>
                <input type="text" class="form-control" id="address" name="address"  value="${not empty patient ? patient.address : ''}"/>
                <br/>
                <label for="gender">Gender:</label>
                <input type="text" class="form-control" id="gender" name="gender"  value="${not empty patient ? patient.gender : ''}"/>
                <br/>
                <label for="userName">Username:</label>
                <input type="text" class="form-control" id="userName" name="userName"  value="${not empty patient ? patient.userName : ''}"/>
                <br/>
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password"  value="${not empty patient ? patient.password : ''}"/>
                <br/>
                <label for="medicalProblem">Medical Problem:</label>
                <input type="text" class="form-control" id="medicalProblem" name="medicalProblem"  value="${not empty patient ? patient.medicalProblem : ''}"/>
                <input type="hidden" name="type" value="update"/>
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
