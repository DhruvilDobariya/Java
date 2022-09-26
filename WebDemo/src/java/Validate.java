import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Validate extends HttpServlet
{   
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {    
        response.setContentType("text/html");
        
        PrintWriter out=response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals("Dhruvil") && password.equals("Dhruvil")){
            
        }
        
    }
}