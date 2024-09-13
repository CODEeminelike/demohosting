import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.User;

@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String howDidYouHear = request.getParameter("howDidYouHear");
        boolean receiveAnnouncements1 = request.getParameter("receiveAnnouncements1") != null;
        boolean receiveAnnouncements2 = request.getParameter("receiveAnnouncements2") != null;
        String contactMethod = request.getParameter("contactMethod");
    
        boolean receiveAnnouncements = receiveAnnouncements1 || receiveAnnouncements2;

        User user = new User(firstName, lastName, email, dateOfBirth, howDidYouHear, receiveAnnouncements, contactMethod);
        request.setAttribute("user", user);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
