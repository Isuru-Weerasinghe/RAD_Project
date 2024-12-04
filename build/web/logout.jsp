

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Cookie ck1 = new Cookie("username", "");
    Cookie ck2 = new Cookie("userId", "");
        
        
        ck1.setMaxAge(0);
        ck2.setMaxAge(0);
       
        
        response.addCookie(ck1);
        response.addCookie(ck2);
       
        response.sendRedirect("login.html");
%>
<!DOCTYPE html>

