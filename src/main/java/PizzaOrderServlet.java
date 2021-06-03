import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizzaOrder.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("sauce"));
        System.out.println(request.getParameter("pepperoni"));
        System.out.println(request.getParameter("mushrooms"));
        System.out.println(request.getParameter("cheese"));
        System.out.println(request.getParameter("address"));
        request.getRequestDispatcher("/pizzaOrder.jsp").forward(request, response);
    }
}