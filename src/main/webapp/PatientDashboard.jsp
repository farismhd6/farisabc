
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
  <style>
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
        
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="#Services">Patient Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="AddAppointment.jsp">Make Appointment</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark mx-2" href="AddPayment.jsp">Pay Payment</a>
        </li>
        
      </ul>
    </div>
  </div>
</nav>


<section class="p-5" style="background-image: url('img/recep.jpg'); background-size: cover; width: 100%; height: 100% ">
  <div class="container " >
    <h1>Welcome to ABC International Lab</h1>
    <p class="lead my-4">Giving quality patient care can absolutely have an effect on health outcomes.<br>
    		 It contributes to a more positive patient recovery experience and <br>
    		  can improve the physical and mental quality of life for people with <br>
    		   serious illnesses, such as cancer</p>
    <a href="PatientLogin.jsp" class="rounded-pill btn btn-dark py-2 px-3">Book Appointment >> </a>
  </div>
</section>

<section class="bg-light pt-2 d-none d-lg-block">
  <div class="container">
    <div class="row">
      <div class="col-md">
        <div class="text-center">
          <img alt="" src="img/a1.png" style="width:60px; height: 60px" class="">
        </div>
      </div>
      <div class="col-md">
        <div class="text-center">
          <img alt="" src="img/a2.png" style="width:50px; height: 50px" class="">
        </div>
      </div>
      <div class="col-md">
        <div class="text-center">
          <img alt="" src="img/a3.png" style="width:50px; height: 50px" class="">
        </div>
      </div>
      <div class="col-md">
        <div class="text-center">
          <img alt="" src="img/a4.png" style="width:50px; height: 50px" class="">
        </div>
      </div>
    </div>
  </div>
</section>

<section class="my-5 py-5" id="About">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 offset-lg-2">
          <h2 class="text-center about-heading">About Our Hospital Laboratory</h2>
          <div class="text-center">
            <i class="fas fa-flask icon"></i>
          </div>
          <p class="text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi.</p>
          <div class="text-center">
            <i class="fas fa-microscope icon"></i>
          </div>
          <p class="text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi.</p>
          <div class="text-center">
            <i class="fas fa-user-md icon"></i>
          </div>
          <p class="text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi.</p>
        </div>
      </div>
    </div>
  </section>
  
  
  
  


    <section class=" about-section  py-5" id="Contact">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 offset-lg-2">
          <h2 class="text-center contact-heading mb-3">Contact Us</h2>
          <div class="text-center mb-2">
            <i class="fas fa-map-marker-alt icon mx-2" ></i>
            <span class="contact-info ">123 Hospital Street, City, Country</span>
          </div>
          <div class="text-center mb-2 ">
            <i class="fas fa-phone icon mx-2"></i>
            <span class="contact-info">+1 (123) 456-7890</span>
          </div>
          <div class="text-center mb-2 ">
            <i class="fas fa-envelope icon mx-2"></i>
            <span class="contact-info">info@example.com</span>
          </div>
          <div class="text-center">
            <i class="fas fa-globe icon mx-2"></i>
            <span class="contact-info">www.example.com</span>
          </div>
        </div>
      </div>
    </div>
  </section>
  
  

<footer class="bg-dark text-white py-4">



  <div class="container">
    <div class="row">
      <div class="col-md-6">
        <p>&copy; 2024 ABC Lab. All rights reserved.</p>
      </div>
      <div class="col-md-6 text-right">
        <a href="#" class="text-white"><i class="fab fa-facebook-square fa-lg"></i></a>
        <a href="#" class="text-white ml-3"><i class="fab fa-twitter-square fa-lg"></i></a>
        <a href="#" class="text-white ml-3"><i class="fab fa-instagram-square fa-lg"></i></a>
        <a href="#" class="text-white ml-3"><i class="fab fa-linkedin fa-lg"></i></a>
      </div>
    </div>
  </div>
</footer>






</body>
</html>