<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="ISO-8859-1">
    <title>Add Patient</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
  <style>
   
    body {
      background-image: url('img/reg.jpg');
      background-size: cover;
      background-position: center;
      background-attachment: fixed;
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
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="Registerpatient"></a>
        </li>
        <li class="nav-item">
          <a href="PatientRegister.jsp" class="rounded btn btn-dark ml-5 px-3 d-none d-lg-block">Register >> </a>
        </li>
      </ul>
    </div>
  </div>
</nav>

   
    
    <div class="container pt-5 mt-5">
	<div class="  pt-4 ">
  	<div class="row login-container">
    	<div class="col-md-6">
    	<h2 class="text-center ">Register Patient</h2>
        <p class="text-center ">${message}</p>
        
        <form method="post" action="patientregController">
            <br/>
				<label for="fullName">Full Name:</label>
				<input type="text" class="form-control" id="fullName" name="fullName"/>
				<br/>
				<label for="email">Email:</label>
				<input type="email" class="form-control" id="email" name="email"/>
				<br/>
				<label for="phoneNumber">Phone Number:</label>
				<input type="text" class="form-control" id="phoneNumber" name="phoneNumber"/>
				<br/>
				<label for="address">Address:</label>
				<input type="text" class="form-control" id="address" name="address"/>
				<br/>
				<label for="gender">Gender:</label>
				<select class="form-control" id="gender" name="gender">
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<option value="Other">Other</option>
				</select>
				<br/>
				<label for="userName">Username:</label>
				<input type="text" class="form-control" id="userName" name="userName"/>
				<br/>
				<label for="password">Password:</label>
				<input type="password" class="form-control" id="password" name="password"/>
				<br/>
				<label for="medicalProblem">Medical Problem:</label>
				<input type="text" class="form-control" id="medicalProblem" name="medicalProblem"/>
				<br/>
				<input type="hidden" name="type" value="add"/>
				<br/>
				 <div class="ml-5 pl-5">
            		<button type="submit" class="btn btn-primary btn-block ml-5 mb-5" style="width: 200px">Register</button>
        		</div>
            
        </form>
    </div>
    </div>
    </div>
    </div>
</div>
</body>
</html>

