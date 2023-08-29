import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PickColor", value = "/PickColor")
public class PickColor extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String color = request.getParameter("color");
        System.out.println("Received color: " + color);

        response.sendRedirect("ViewColor?color=" + color);

    }

}
