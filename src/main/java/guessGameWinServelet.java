import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "guessGameWinServelet",  urlPatterns = "/correct")
public class guessGameWinServelet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
}

