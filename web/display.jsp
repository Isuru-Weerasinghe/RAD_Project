<%-- 
    Document   : display
    Created on : Aug 12, 2023, 5:51:03 PM
    Author     : Heshan Himantha
--%>

<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <a href="" class="navbar-brand p-0">
                    <h1 class="text-primary m-0"><i class="fa fa-map-marker-alt me-3"></i>Inspire Ella</h1>
                    <!-- <img src="img/logo.png" alt="Logo"> -->
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="fa fa-bars"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto py-0">
                        <a href="#" class="nav-item nav-link">Home</a>
                        <a href="#" class="nav-item nav-link">About</a>
                        <a href="#" class="nav-item nav-link active">Room  Reservation</a>
                        <a href="#" class="nav-item nav-link">Packages</a>
                        <div class="nav-item dropdown">
                            <a href="reviewform.jsp" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Rate Us</a>
                            <div class="dropdown-menu m-0">
                                <a href="reviewform.jsp" class="dropdown-item">Rating</a>
                                <a href="#" class="dropdown-item">Reviews</a>
                            </div>
                        </div>
                        <a href="contact.html" class="nav-item nav-link">Contact Us</a>
                    </div>
                    <a href="" class="btn btn-primary rounded-pill py-2 px-4">Login</a>
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

<% 
     String selectQuery = "SELECT * FROM `review_table` ORDER BY `review_id` DESC";
     
 try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/inspiraella","root","");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);
        
        //display the values using html elements
        
        out.println("<html>");
        out.println("<head><style>h1{color:#3380FF;text-align: center;font-size: 30px; text-transform: uppercase; margin-bottom: 15px;} table{width:100%;table-layout: fixed;cellpadding:0;cellspacing:0;border:0;} div{} th{padding: 20px 15px;text-align:center; font-weight: 500;font-size: 16px;color:#fff; text-transform: uppercase;} td{padding: 15px;text-align:center;vertical-align:middle;font-weight: 300;font-size: 14px;color:#2F2517;border-bottom: solid 1px rgba(255,255,255,0.1);} body{background: -webkit-linear-gradient(left, #25c481, #25b7c4);background: linear-gradient(to right, #25c481, #25b7c4); font-family: 'Roboto', sans-serif;} section{margin: 50px;} hr{color:white;} tr{border: $cell-border }</style></head>");
        out.println("<body>");
        out.println("<h1>View All Review Details<hr></h1>");
        out.println("<section>");
        out.println("<div>");
        out.print("<table>");
        
        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>User Name</th>");
        out.println("<th>Rating No</th>");
        out.println("<th>Review</th>");
        out.println("<th>Date</th>");
        out.println("</tr>");
        
        
        while(rs.next())
        {
           out.println("<tr>");
           out.println("<td> "+rs.getString("review_id")+"</td>");
           out.println("<td> "+rs.getString("user_name")+"</td>");
           out.println("<td> "+rs.getString("user_rating")+"</td>");
           out.println("<td> "+rs.getString("user_review")+"</td>");
           out.println("<td> "+rs.getString("datetime")+"</td>");
           out.println("</tr>");
        }
        
        out.println("</table>");
        out.println("</div>");
        out.println("</section>");
        out.println("</body>");
        out.println("</html>");
         
    }
    catch(Exception e){
        
        out.println(e);
    }
    


%>

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
                            <a href="">Home</a>
                            <a href="">Contact Us</a>
                            <a href="">Help</a>
                            <a href="">FQAs</a>
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