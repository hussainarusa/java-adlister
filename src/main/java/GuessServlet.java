import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", value = "/GuessServlet")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guess.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random= new Random();
        int randomNum = random.nextInt(3) + 1;
        int userGuess = Integer.parseInt(request.getParameter("guess"));

        if(randomNum == userGuess){
            response.sendRedirect("/WinServlet");
        }else {
            response.sendRedirect("/LossServlet");

        }
    }
}
