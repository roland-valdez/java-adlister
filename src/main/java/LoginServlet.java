import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        boolean userEmpty = session.getAttribute("user") == null;
        if(userEmpty){
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        request.setAttribute("username", username);
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        boolean validUser = !username.equals("") && !password.equals("");


        if (validAttempt) {
            HttpSession session = request.getSession();
            session.setAttribute("user", true);
            response.sendRedirect("/profile");
        }
        else if (validUser){
            response.sendRedirect("/profile");
        }
        else {
            response.sendRedirect("/login");
        }
    }
}
