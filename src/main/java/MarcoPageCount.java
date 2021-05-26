import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MarcoPageCount", urlPatterns = "/count")
public class MarcoPageCount extends HttpServlet {
    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count++;
        String reset = request.getParameter("reset");
        if (reset != null) {
            count =0;
        }
        response.getWriter().println("<h1>You are the " + count + " visitor to the website<h1>");
    }
}
