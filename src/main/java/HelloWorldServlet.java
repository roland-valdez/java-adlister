import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MarcoHelloWorld", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        if (name != null) {
            response.getWriter().println("<h1>Hello " + name + "!</h1>");
        }
        else {
            response.getWriter().println("<h1>Hello Codeup!</h1>");
        }
    }
}





