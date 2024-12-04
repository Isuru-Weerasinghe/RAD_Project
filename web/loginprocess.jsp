<%-- 
    Document   : index
    Created on : 2 Aug, 2023, 1:59:01 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="classes.DBconnector" %>
<%@page import="classes.MD5" %>
<%!
    String email, password;
%>
<%
    email = request.getParameter("email");

    password = MD5.getMd5(request.getParameter("password"));


%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>


        <%            Connection con = new DBconnector().getConnection();
            String query = "SELECT * from user WHERE email=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            String db_password = null;

            String db_email = null;
            String admin_email = "admin@gmail.com";
            String db_username = null;
            String userId = null;

            while (rs.next()) {
                db_password = rs.getString("password");
                db_username = rs.getString("username");
                userId = rs.getString("id");
                //db_email = rs.getString("email");

            }
            /*if (db_email.equals(admin_email)) {
                      response.sendRedirect("admin.html");
                }*/

            if (db_password.equals(password)) {
                if (email.equals(admin_email)) {
                    response.sendRedirect("admin.html");
                } else {
                    Cookie ck1 = new Cookie("username", db_username);
                    Cookie ck2 = new Cookie("userId", userId);

                    response.addCookie(ck1);
                    response.addCookie(ck2);

                    response.sendRedirect("home.jsp");
                }

            } else {
                response.sendRedirect("loginFailed.html");

            }


        %>
        <h1><%=email%></h1>
        <h1><%=password%></h1>
        <h1><%=db_password%></h1> 



    </body>
</html>
