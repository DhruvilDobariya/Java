<%-- 
    Document   : Home
    Created on : Mar 28, 2022, 12:41:32 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.User" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            User user = (User)request.getAttribute("user1");
            out.print("Welcome " + user.getUsername());
        %>
        
    </body>
</html>
