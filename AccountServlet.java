package Controller;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import Listener.ActiveSession;


/**
 * 
 *
 */
public class AccountServlet extends HttpServlet
{
	Hashtable data = new Hashtable();

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{

		//get the userid set by LoginServlet
		String userid = (String) req.getAttribute("userid");

		if(userid != null )
		{

		    HttpSession httpSession = req.getSession();
		    httpSession.setMaxInactiveInterval(60);
			// userid available. retrieve the data and generate the page.
			String[] records = (String[]) data.get(userid);

			PrintWriter pw = res.getWriter();
			pw.println("<html>");
			pw.println("<head>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h3>Account Status for "+userid+" at the start of previous three months...</h3><p>");
			pw.println("<h2>Number of active session in banking application "+ActiveSession.getActiveSession()+"</h2>");
			for(int i=0; i<records.length; i++)
			{
				pw.println(records[i]+"<br>");
			}

			pw.println("</body>");
			pw.println("</html>");


		}
		else
		{

			//No userid. Send login.jsp to the user.
			//observe the use of relative path.
			req.getRequestDispatcher("/login.jsp").forward(req, res);
		}


	}
	public void init()
	{
		data.put("ann", new String[]{ "01/01/2001 : 1000.00", "01/02/2001 : 1300.00", "01/03/2001 : 900.00"} );
		data.put("john", new String[]{ "01/01/2001 : 4500.00", "01/02/2001 : 2100.00", "01/03/2001 : 2600.00"} );
		data.put("mark", new String[]{ "01/01/2001 : 7800.00", "01/02/2001 : 5200.00", "01/03/2001 : 1900.00"} );
	}
}