

<%@page import="classes.DBconnector"%>
<%@page import="java.sql.*" %>

<%
                            String alert="";
                        if (request.getParameter("name") != null) {
                            String name = request.getParameter("name");
                            String email = request.getParameter("email");
                            String datetime = request.getParameter("datetime");
                            String select1 = request.getParameter("select1");
                            String message = request.getParameter("message");
                            

                            try {
                                Connection con = new DBconnector().getConnection();
                                String query = "INSERT INTO packagebooking (name,email,datetime,select1,message) VALUES (?,?,?,?,?)";
                                PreparedStatement pstmt = con.prepareStatement(query);
                                pstmt.setString(1, name);
                                pstmt.setString(2, email);
                                pstmt.setString(3, datetime);
                                pstmt.setString(4, select1);
                                pstmt.setString(5, message);
                                int x = pstmt.executeUpdate();
                                if (x > 0) {
                                   response.sendRedirect("Book.jsp?status=1");
                                } else {
                                    
                                     response.sendRedirect("Book.jsp?status=0");
                                }
                            } catch (Exception e) {
                                out.println(e);
                            }
                        }


                    %>

