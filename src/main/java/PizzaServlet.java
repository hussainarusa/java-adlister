import org.jetbrains.annotations.NotNull;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza")
public class PizzaServlet extends HttpServlet  {
    @Override
    protected void doGet(@NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pizza.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String orderAdress = request.getParameter("adress");
        String crustType = request.getParameter("crust");
        String sauceType = request.getParameter("sauce");
        String[] toppingType = request.getParameterValues("topping");

        System.out.println(orderAdress);
        System.out.println(crustType);
        System.out.println(sauceType);
        System.out.println(Arrays.toString(toppingType));

        request.setAttribute("orderAdress", orderAdress);
        request .setAttribute("crustType", crustType);
        request.setAttribute("sauceType", sauceType);
        request.setAttribute("toppingType", toppingType);

        ServletResponse resp;
        request.getRequestDispatcher("pizza.jsp").forward(request, response);
    }
}
