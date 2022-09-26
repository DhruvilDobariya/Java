<%-- 
    Document   : Result
    Created on : Mar 21, 2022, 12:36:27 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="Exception.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int a = 0;
            if(request.getParameter("operation").equals("1")){
                String a1 = request.getParameter("number1") + request.getParameter("number2");
            }
            else if(request.getParameter("operation").equals("2")){
            
            }
            else if(request.getParameter("operation").equals("3")){
            
            }
            else if(request.getParameter("operation").equals("4")){
            
            }
            else{
                
            }
        %>
        <div>
            Your ans : 
            <% 
                out.print(a1);
            %>
        </div>
    </body>
</html>
