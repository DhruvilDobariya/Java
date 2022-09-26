import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        
        if(Username.equals("admin") && Password.equals("admin")){
            out.println("Hi " + Username);
            HttpSession session = request.getSession();
            session.setAttribute("Username", Username);
            request.getRequestDispatcher("Link.html").include(request, response);
        }
        else{
            out.println("<div>Username or Password dosn't match.</div>");
            request.getRequestDispatcher("Login.html").include(request, response);
        }
    }

}
