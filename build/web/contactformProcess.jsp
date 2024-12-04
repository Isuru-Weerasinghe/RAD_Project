

<%@page import="classes.DBconnector" %>
<%@page import="java.sql.*" %>
<%
                            String alert="";
                        if (request.getParameter("name") != null) {
                            String username = request.getParameter("name");
                            String email = request.getParameter("email");
                            String message = request.getParameter("message");
                            String subject = request.getParameter("subject");
                            

                            try {
                                Connection con = new DBconnector().getConnection();
                                String query = "INSERT INTO contact_us (username,email,subject,message)VALUES(?,?,?,?)";
                                PreparedStatement pstmt = con.prepareStatement(query);
                                pstmt.setString(1, username);
                                pstmt.setString(2, email);
                                pstmt.setString(3, subject);
                                pstmt.setString(4, message);
                                int x = pstmt.executeUpdate();
                                if (x > 0) {
                                   response.sendRedirect("contact.jsp?status=1");
                                } else {
                                    
                                     response.sendRedirect("contact.jsp?status=0");
                                }
                            } catch (Exception e) {
                                out.println(e);
                            }
                        }


                    %>   