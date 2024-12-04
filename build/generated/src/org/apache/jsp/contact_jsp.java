package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("</html><!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Inspira Ella-Contact</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Icon Font Stylesheet -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\n");
      out.write("                <span class=\"sr-only\">Loading...</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar & Hero Start -->\n");
      out.write("        <div class=\"container-fluid position-relative p-0\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0\">\n");
      out.write("                <a href=\"index.jsp\" class=\"navbar-brand p-0\">\n");
      out.write("                    <h1 class=\"text-primary m-0\"><i class=\"fa fa-map-marker-alt me-3\"></i>Inspira Ella</h1>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"fa fa-bars\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                    <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-item nav-link\">Home</a>\n");
      out.write("                        <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                        <a href=\"booking.jsp\" class=\"nav-item nav-link\">Room  Reservation</a>\n");
      out.write("                        <a href=\"package.html\" class=\"nav-item nav-link\">Packages</a>\n");
      out.write("                        <div class=\"nav-item dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Rate Us</a>\n");
      out.write("                            <div class=\"dropdown-menu m-0\">\n");
      out.write("                                <a href=\"reviewform.jsp\" class=\"dropdown-item\">Rating</a>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"contact.jsp\" class=\"nav-item nav-link active\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"login.html\" class=\"btn btn-primary rounded-pill py-2 px-4\">Login</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid bg-primary py-5 mb-5 hero-header\">\n");
      out.write("                <div class=\"container py-5\">\n");
      out.write("                    <div class=\"row justify-content-center py-5\">\n");
      out.write("                        <div class=\"col-lg-10 pt-lg-5 mt-lg-5 text-center\">\n");
      out.write("                            <h1 class=\"display-3 text-white animated slideInDown\">Contact Us</h1>\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb justify-content-center\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Pages</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item text-white active\" aria-current=\"page\">Contact</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navbar & Hero End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Contact Start -->\n");
      out.write("        <div class=\"container-xxl py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"text-center wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("                    <h6 class=\"section-title bg-white text-center text-primary px-3\">Contact Us</h6>\n");
      out.write("                    <h1 class=\"mb-5\">Contact For Any Query</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row g-4\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("                        <h5>Get In Touch</h5>\n");
      out.write("                        <p class=\"mb-4\">\n");
      out.write("                            We would love to hear from you! For any inquiries, feedback, or assistance, please don't hesitate to reach out to our friendly team.</p>\n");
      out.write("                        <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center flex-shrink-0 bg-primary\" style=\"width: 50px; height: 50px;\">\n");
      out.write("                                <i class=\"fa fa-map-marker-alt text-white\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ms-3\">\n");
      out.write("                                <h5 class=\"text-primary\">Office</h5>\n");
      out.write("                                <p class=\"mb-0\">Inspira Ella, 1st Lane, Sapumalthena, Ella, 90900 Ella, Sri Lanka</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center flex-shrink-0 bg-primary\" style=\"width: 50px; height: 50px;\">\n");
      out.write("                                <i class=\"fa fa-phone-alt text-white\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ms-3\">\n");
      out.write("                                <h5 class=\"text-primary\">Telephone</h5>\n");
      out.write("                                <p class=\"mb-0\">+94552222810</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center flex-shrink-0 bg-primary\" style=\"width: 50px; height: 50px;\">\n");
      out.write("                                <i class=\"fa fa-envelope-open text-white\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ms-3\">\n");
      out.write("                                <h5 class=\"text-primary\">Email</h5>\n");
      out.write("                                <p class=\"mb-0\">info@inspiraella.com</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\n");
      out.write("                        <iframe class=\"position-relative rounded w-100 h-100\"\n");
      out.write("                                src=\"https://storage.googleapis.com/maps-solutions-aynlcq8a2j/locator-plus/fnkx/locator-plus.html\"\n");
      out.write("                                frameborder=\"0\" style=\"min-height: 300px; border:0;\" allowfullscreen=\"\" aria-hidden=\"false\"\n");
      out.write("                                tabindex=\"0\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");

                        String message="";
                        if(request.getParameter("status")!=null){
                           int status=Integer.parseInt(request.getParameter("status"));
                           if(status==0){
                               message= "<p style='color:green'>failed to submit your data!</p>";
                           }
                           if(status==1){
                               message= "<p style='color:green;text-align:center'>You have successfully submitted the data!</p>";
                           }
                        }
                        
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 wow fadeInUp\" data-wow-delay=\"0.5s\">\n");
      out.write("                        <form action=\"contactformProcess.jsp\" method=\"POST\">\n");
      out.write("                            <div class=\"row g-3\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Your Name\">\n");
      out.write("                                        <label for=\"name\">Your Name</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Your Email\">\n");
      out.write("                                        <label for=\"email\">Your Email</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"subject\" name=\"subject\" placeholder=\"Subject\">\n");
      out.write("                                        <label for=\"subject\">Subject</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-floating\">\n");
      out.write("                                        <textarea class=\"form-control\" placeholder=\"Leave a message here\" id=\"message\" name=\"message\" style=\"height: 100px\"></textarea>\n");
      out.write("                                        <label for=\"message\">Message</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <button class=\"btn btn-primary w-100 py-3\" type=\"submit\">Send Message</button>\n");
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
      out.write("        <!-- Contact End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row g-5\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h4 class=\"text-white mb-3\">Inspira Ella</h4>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">About Us</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Contact Us</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\n");
      out.write("                        <a class=\"btn btn-link\" href=\"\">FAQs & Help</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h4 class=\"text-white mb-3\">Contact</h4>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>Inspira Ella, 1st Lane, Sapumalthena, Ella, 90900 Ella, Sri Lanka</p>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+94(0)552222810</p>\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@inspiraella.com</p>\n");
      out.write("                        <div class=\"d-flex pt-2\">\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <h4 class=\"text-white mb-3\">Gallery</h4>\n");
      out.write("                        <div class=\"row g-2 pt-2\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-1.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-2.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-3.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-4.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-5.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <img class=\"img-fluid bg-light p-1\" src=\"img/gallary-6.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                            &copy; <a class=\"border-bottom\" href=\"#\">Inspira Ella</a>, All Right Reserved.\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                            <div class=\"footer-menu\">\n");
      out.write("                                <a href=\"index.jsp\">Home</a>\n");
      out.write("                                <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("                                <a href=\"help.jsp\">Help</a>\n");
      out.write("                                <a href=\"faq.jsp\">FQAs</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("        <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
