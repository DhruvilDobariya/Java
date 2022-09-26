import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        request.getRequestDispatcher("Link.html").include(request, response);
        
        HttpSession session = request.getSession(false);
        if(session != null){
            out.println("<div>Hi " + session.getAttribute("Username").toString() + " Welcome to Profile.</div>");
        }
        else{
            out.println("Please First Login.");
            
            request.getRequestDispatcher("Login.html").include(request, response);
        }
    }
}
