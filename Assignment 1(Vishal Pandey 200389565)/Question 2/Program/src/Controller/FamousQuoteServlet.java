package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FamousQuoteServlet")
public class FamousQuoteServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>" + contextParameter() +"</h1>");
        pw.println("<h1>"+ contextServlet("Quote") + "</h2>");
        pw.println("<h1>"+ contextServlet("Greetings") + "</h2>");
        pw.println("</body>");
        pw.println("</html>");


        pw.flush();



    }

    private String contextParameter()
    {
        return getServletContext().getInitParameter("Question2")==null? "Context Error"
                :getServletContext().getInitParameter("Question2");
    }

    private String contextServlet(String param)
    {
        return getServletConfig().getInitParameter(param)==null? "No "+  param
                :getServletConfig().getInitParameter(param);
    }
}
