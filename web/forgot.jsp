

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.DBconnector" %>
<%@page import="classes.MD5" %>
<%@page import="java.sql.*" %>
<%!
    String email,password;
    %>
    <%
        email=request.getParameter("email");
        password=MD5.getMd5(request.getParameter("password"));
        
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                  Connection con = new DBconnector().getConnection();
                  String query ="UPDATE user SET password=? WHERE email=?";
                  PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1,password);
                  pstmt.setString(2,email);
                 int a = pstmt.executeUpdate();
                 if(a>0){
                     response.sendRedirect("login.html?success=1");
                 }
                  
                } catch (Exception e) {
                }
            %>
        <h1>Email :<%=email %></h1>
         <h1>Password :<%=password %></h1>
    </body>
</html>
