package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Inspira Ella-Package Booking</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"\" name=\"keywords\">\n");
      out.write("    <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("        <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\n");
      out.write("            <span class=\"sr-only\">Loading...</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid position-relative p-0\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0\">\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand p-0\">\n");
      out.write("                <h1 class=\"text-primary m-0\"><i class=\"fa fa-map-marker-alt me-3\"></i>Inspira Ella</h1>\n");
      out.write("               \n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                <span class=\"fa fa-bars\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                    <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                    <a href=\"booking.jsp\" class=\"nav-item nav-link\">Room  Reservation</a>\n");
      out.write("                    <a href=\"package.html\" class=\"nav-item nav-link\">Packages</a>\n");
      out.write("                    <div class=\"nav-item dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Rate Us</a>\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\n");
      out.write("                            <a href=\"reviewform.jsp\" class=\"dropdown-item\">Rating</a>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"login.html\" class=\"btn btn-primary rounded-pill py-2 px-4\">Login</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid bg-primary py-5 mb-5 hero-header\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row justify-content-center py-5\">\n");
      out.write("                    <div class=\"col-lg-10 pt-lg-5 mt-lg-5 text-center\">\n");
      out.write("                        <h1 class=\"display-3 text-white mb-3 animated slideInDown\">Enjoy Your Vacation With Us</h1>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"container-xxl py-5 wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"booking p-5\">\n");
      out.write("                <div class=\"row g-5 align-items-center\">\n");
      out.write("                    <div class=\"col-md-6 text-white\">\n");
      out.write("                        <h6 class=\"text-white text-uppercase\">Booking</h6>\n");
      out.write("                        <h1 class=\"text-white mb-4\">Online Booking</h1>\n");
      out.write("                        <p class=\"mb-4\">Welcome to our hotel's seamless and user-friendly online booking platform. Booking your dream stay with us has never been easier. Experience the convenience of our state-of-the-art website, \n");
      out.write("                            designed to ensure a smooth and efficient booking process.</p>\n");
      out.write("                        <p class=\"mb-4\">Booking your stay with us online is not only convenient but also gives you access to exclusive perks and benefits. Experience the ease and efficiency of our online booking platform and secure your spot at our hotel today. \n");
      out.write("                            We look forward to welcoming you and ensuring a memorable and delightful stay with us.</p>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    ");

                        String message="";
                        if(request.getParameter("status")!=null){
                           int status=Integer.parseInt(request.getParameter("status"));
                           if(status==0){
                               message= "<p style='color:red'>failed to submit your data!</p>";
                           }
                           if(status==1){
                               message= "<p style='color:green;text-align:center'>You have successfully submitted the data!</p>";
                           }
                        }
                        
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h1 class=\"text-white mb-4\">Book Now</h1>\n");
      out.write("                        <form action=\"BookNow.jsp\" method=\"POST\">\n");
      out.write("                            <div class=\"row g-3\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-transparent\" id=\"name\" name=\"name\" placeholder=\"Your Name\">\n");
      out.write("                                        <label for=\"name\">Your Name</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control bg-transparent\" id=\"email\" name=\"email\" placeholder=\"Your Email\">\n");
      out.write("                                        <label for=\"email\">Your Email</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating date\" id=\"date3\" data-target-input=\"nearest\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-transparent datetimepicker-input\" id=\"datetime\" name=\"datetime\" placeholder=\"Date & Time\" data-target=\"#date3\" data-toggle=\"datetimepicker\" />\n");
      out.write("                                        <label for=\"datetime\">Date & Time</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <select class=\"form-select bg-transparent\" id=\"select1\" name=\"select1\">\n");
      out.write("                                            <option value=\"1\">Sri Lankan Package</option>\n");
      out.write("                                            <option value=\"2\">Honeymoon Package</option>\n");
      out.write("                                            <option value=\"3\">Stay Package</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <label for=\"select1\">Package</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <textarea class=\"form-control bg-transparent\" placeholder=\"Special Request\" id=\"message\" name=\"message\" style=\"height: 100px\"></textarea>\n");
      out.write("                                        <label for=\"message\">Special Request</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <button class=\"btn btn-outline-light w-100 py-3\" type=\"submit\">Book Now</button>\n");
      out.write("                                </div>\n");
      out.write("                                ");
      out.print(message );
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("           \n");
      out.write("            <!-- Footer Start -->\n");
      out.write("    <div class=\"container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row g-5\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Inspira Ella</h4>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">About Us</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Contact Us</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">FAQs & Help</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Contact</h4>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>Inspira Ella, 1st Lane, Sapumalthena, Ella, 90900 Ella, Sri Lanka</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+94(0)552222810</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@inspiraella.com</p>\n");
      out.write("                    <div class=\"d-flex pt-2\">\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Gallery</h4>\n");
      out.write("                    <div class=\"row g-2 pt-2\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-2.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-4.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-5.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-6.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                        &copy; <a class=\"border-bottom\" href=\"#\">Inspira Ella</a>, All Right Reserved.\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\n");
      out.write("                            <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("                            <a href=\"help.jsp\">Help</a>\n");
      out.write("                            <a href=\"faq.jsp\">FQAs</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer End -->\n");
      out.write("           \n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("    \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
