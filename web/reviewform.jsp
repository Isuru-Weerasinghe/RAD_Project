<%-- 
    Document   : reviewform
    Created on : Aug 11, 2023, 4:52:49 PM
    Author     : Heshan Himantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Date"%>
<%@page import="classes.DBconnector" %>
<%@page import="java.sql.*, java.util.*, java.io.*" %>


<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Inspira Ella</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <link href="img/favicon.ico" rel="icon">

        <link rel="" href="https://fonts.googleapis.com">
        <link rel="" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">

        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>

        <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>

        <div class="container-fluid position-relative p-0">
            <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
                <a href="index.jsp" class="navbar-brand p-0">
                    <h1 class="text-primary m-0"><i class="fa fa-map-marker-alt me-3"></i>Inspire Ella</h1>
                    
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="fa fa-bars"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto py-0">
                        <a href="index.jsp" class="nav-item nav-link">Home</a>
                    <a href="about.jsp" class="nav-item nav-link">About</a>
                    <a href="booking.jsp" class="nav-item nav-link">Room  Reservation</a>
                    <a href="package.html" class="nav-item nav-link">Packages</a>
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link active dropdown-toggle" data-bs-toggle="dropdown">Rate Us</a>
                            <div class="dropdown-menu m-0">
                                <a href="reviewform.jsp" class="dropdown-item">Rating</a>
                                <a href="#" class="dropdown-item">Reviews</a>
                            </div>
                        </div>
                        <a href="contact.jsp" class="nav-item nav-link">Contact Us</a>
                    </div>
                    <a href="login.html" class="btn btn-primary rounded-pill py-2 px-4">Login</a>
                </div>
            </nav>

            <div class="container-fluid bg-primary py-5 mb-5 hero-header">
                <div class="container py-5">
                    <div class="row justify-content-center py-5">
                        <div class="col-lg-10 pt-lg-5 mt-lg-5 text-center">
                            <h1 class="display-3 text-white mb-3 animated slideInDown">Enjoy Your Vacation With Us</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Header end-->
        <div class="container-xxl py-5 wow fadeInUp" data-wow-delay="0.1s">
            <div class="container">
                <div class="review p-5">
                    <div class="row g-5 align-items-center">
                        <div class="col-md-6 text-white">
                            <h6 class="text-white text-uppercase">Rating and review</h6>
                            <h1 class="text-white mb-4">Write your Comment and Rating Our Inspire Hotel</h1>

                        </div>
                        <div class="col-md-6">
                            <h1 class="text-primary mb-4"><center>Write Your Review</center></h1>
                            <form action="insert.jsp" method="POST">
                                <div class="row g-3">
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control bg-transparent" id="id" placeholder="Enter your User id" name="id" required />
                                            <label for="name">Customer ID</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control bg-transparent" id="username" placeholder="Enter your User Name" name="username" required />
                                            <label for="name">User Name</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <label for="userrating">Rating No:</label>
                                            <input type="text" class="form-control bg-transparent" id="ratingno" placeholder="Enter your Rating No 1 to 5"name="ratingno" min="1" max="5" required>
                                        </div>
                                    </div>

                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control bg-transparent datetimepicker-input" id="review" placeholder="Enter your Review" name="review"  data-toggle="datetimepicker" />
                                            <label for="review">User Review</label><!--new id datetime1-->
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating date" id="date3">
                                            <input type="date" class="form-control bg-transparent datetimepicker-input" id="datetime" placeholder="Date & Time" name="datatime" required data-target="#date3a" data-toggle="datetimepicker" />
                                            <label for="datetime">Date and Time</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button class="btn btn-secondary w-45 py-2" type="submit">Submit</button>
                                        
                                    </div>
                                </div>
                            </form>

                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--Display Review Details-->
<center><h1>View All review Details</h1></center>
<center>
    <form method="post" action="display.jsp">
        <button class="btn btn-secondary w-45 py-2" type="submit" value="display">click the button</button>
    </form>
</center>   
    <div class="container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container py-5">
            <div class="row g-5">
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Inspira Ella</h4>
                    <a class="btn btn-link" href="">About Us</a>
                    <a class="btn btn-link" href="">Contact Us</a>
                    <a class="btn btn-link" href="">Privacy Policy</a>
                    <a class="btn btn-link" href="">Terms & Condition</a>
                    <a class="btn btn-link" href="">FAQs & Help</a>
                </div>
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Contact</h4>
                    <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>Inspira Ella, 1st Lane, Sapumalthena, Ella, 90900 Ella, Sri Lanka</p>
                    <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+94(0)552222810</p>
                    <p class="mb-2"><i class="fa fa-envelope me-3"></i>info@inspiraella.com</p>
                    <div class="d-flex pt-2">
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Gallery</h4>
                    <div class="row g-2 pt-2">
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-1.jpg" alt="">
                        </div>
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-2.jpg" alt="">
                        </div>
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-3.jpg" alt="">
                        </div>
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-4.jpg" alt="">
                        </div>
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-5.jpg" alt="">
                        </div>
                        <div class="col-4">
                            <img class="img-fluid bg-light p-1" src="img/gallary-6.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="copyright">
                <div class="row">
                    <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                        &copy; <a class="border-bottom" href="#">Inspira Ella</a>, All Right Reserved.
                    </div>
                    <div class="col-md-6 text-center text-md-end">
                        <div class="footer-menu">
                            <a href="index.jsp">Home</a>
                            <a href="contact.jsp">Contact Us</a>
                            <a href="help.jsp">Help</a>
                            <a href="faq.jsp">FQAs</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>



    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/wow/wow.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/tempusdominus/js/moment.min.js"></script>
    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>


    <script src="js/main.js"></script>
</body>

</html>
