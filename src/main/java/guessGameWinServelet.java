import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "guessGameWinServelet",  urlPatterns = "/correct")
public class guessGameWinServelet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("outcome", "WON!");
        request.getRequestDispatcher("/guessGameOutcome.jsp").forward(request, response);
    }
}

