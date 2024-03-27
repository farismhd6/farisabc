<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Centered Navbar in Bootstrap</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    /* Custom CSS for centering the navbar */
    .navbar-brand {
      /* Center-align the navbar brand */
      margin-left: auto;
      margin-right: auto;
      display: table;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container">
    <!-- Navbar brand/logo -->
    <a class="navbar-brand" href="#">Centered Navbar</a>
  </div>
</nav>

<!-- Bootstrap JS (optional, if you need JavaScript functionality) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
