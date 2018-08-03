package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Controller.SecondServlet")
public class SecondServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1> Include request attribute</h1>");
        Enumeration e = request.getAttributeNames();
        while(e.hasMoreElements()){
            String name = (String) e.nextElement();
            pw.println(name+": "+request.getAttribute(name));
            pw.println("</br>");

        }
        pw.println("</body>");
        pw.println("</html>");






    }
}
