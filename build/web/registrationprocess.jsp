<%-- 
    Document   : registration
    Created on : 30 Jul, 2023, 12:33:06 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.MD5" %>
<%@page import="classes.DBconnector" %>
<%@page import="java.sql.*" %>
<%!
    String firstname, lastname, username, phoneno, email, password;
%>
<%
    firstname = request.getParameter("firstname");
    lastname = request.getParameter("lastname");
    username = request.getParameter("username");
    phoneno = request.getParameter("phoneno");
    email = request.getParameter("email");
    password = MD5.getMd5(request.getParameter("password"));


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%            try {
                Connection con = new DBconnector().getConnection();
                String query = "INSERT into user(firstname,lastname,username,phoneno,email,password)VALUES(?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, firstname);
                pstmt.setString(2, lastname);
                pstmt.setString(3, username);
                pstmt.setString(4, phoneno);
                pstmt.setString(5, email);
                pstmt.setString(6, password);

                int a = pstmt.executeUpdate();

                if (a > 0) {
                    response.sendRedirect("login.html");
                
        %>
       <h1><%out.println("successfully added data");%></h1>
        
        <%
        } else {
        %>
        <h1><%out.println("Error");%></h1>
        <%
            }
        %>
        <%
            } catch (Exception e) {
            }
        %>

        <h1>Full name :<%=firstname%></h1>
        <h1>Last name :<%=lastname%></h1>
        <h1>User name :<%=username%></h1>
        <h1>Phone no :<%=phoneno%></h1>
        <h1>Email :<%=email%></h1>
        <h1>Password :<%=password%></h1>

    </body>
</html>
