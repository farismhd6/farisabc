<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Login</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
  <style>
    body {
      background-image: url('img/log.jpg'); /* Replace 'your-image.jpg' with the path to your background image */
      background-size: cover; /* Ensure the image covers the entire background */
      background-position: center; /* Center the background image */
      background-repeat: no-repeat; /* Prevent the background image from repeating */
      height: 100vh; /* Set the height to 100% of the viewport height */
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
    <h2 class="text-center mb-4">Patient Login</h2>
    
    
    <form action="patientLoginController" method="post">
    	<div class="form-group">
          <label for="username">Username</label>
          <input type="text" class="form-control" id="username" name="username" placeholder="Enter username" required>
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" class="form-control mb-2" id="password" name="password" placeholder="Enter password" required>
        </div>
        <div class="ml-5 pl-5">
            <input type="submit" class="btn btn-primary btn-block ml-5 mb-3" value="Login" onclick="return validateForm()" style="width: 200px">
        </div>
        
      
        
        <div id="errorMessage" style="display: none; color: red;"></div>
    </form>
    <p>Create New Account!<a href="AddPatient.jsp"  class="text-white">  Register</a></p>

    <script>
        function validateForm() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            
            // You can add client-side validation if needed
            
            // If the username or password is empty, display an error message
            if (username.trim() === "" || password.trim() === "") {
                displayErrorMessage("Username and password are required.");
                return false;
            }
            
            // If no validation errors, submit the form
            return true;
        }
    </script> 
    
     </div>
  </div>
</div>
</div>
</body>
</html>
