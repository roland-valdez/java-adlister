import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MarcoHelloWorld", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        String name = request.getParameter("name");
//        response.getWriter().println("<h1>Hello " + name +" How are you guys doing?<h1>");
        count++;
        response.getWriter().println("<h1>You are the " + count + " visitor to the website<h1>");

    }

}






