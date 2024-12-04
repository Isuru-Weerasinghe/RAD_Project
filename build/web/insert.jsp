<%-- 
    Document   : insert.jsp
    Created on : Aug 12, 2023, 3:41:52 PM
    Author     : Heshan Himantha
--%>

<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.DBconnector" %>
<%@page import="java.sql.*, java.util.*, java.io.*" %>

<%
    String id = request.getParameter("id");
    String username = request.getParameter("username");
    String ratingno = request.getParameter("ratingno");
    String review = request.getParameter("review");
    String datatime = request.getParameter("datatime");
    
    //Insert query
    String insertQuery="INSERT INTO `review_table` (`review_id`, `user_name`, `user_rating`, `user_review`, `datetime`) VALUES" + " ('"+id+"', '"+username+"', '"+ratingno+"', '"+review+"', '"+datatime+"')";
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/inspiraella","root","");
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insertQuery);
        
    }
    catch(Exception e){
        
        out.println(e);
    }
    

%>