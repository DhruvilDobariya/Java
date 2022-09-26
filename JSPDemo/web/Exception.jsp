<%-- 
    Document   : Exception
    Created on : Mar 21, 2022, 1:25:28 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        An Exception occured
        <% out.print(exception.toString());%>
    </body>
</html>
