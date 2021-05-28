import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double randomNumber = Math.floor((Math.random() * (3 - 1) + 1));
        String userGuess = request.getParameter("number");
        int userNumber = Integer.parseInt(userGuess);
        request.setAttribute("number", userNumber);
        request.setAttribute("random", randomNumber);

        if (userNumber == randomNumber){
            request.setAttribute("outcome", "WON!");
            request.getRequestDispatcher("/guessGameOutcome.jsp").forward(request, response);

        }
        else{
            request.setAttribute("outcome", "LOST!");
            request.getRequestDispatcher("/guessGameOutcome.jsp").forward(request, response);

        }
    }
}
