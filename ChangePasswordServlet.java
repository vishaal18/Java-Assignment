package Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Username");
        String passOld = request.getParameter("OldPassword");
        String passNew = request.getParameter("NewPassword");

        if(Helper.passwordchange(name, passOld,passNew))
        {
            request.setAttribute("message" ,"Change successful" );
        }
        else{
            request.setAttribute("message", "Change not successful");


        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);




    }


}
