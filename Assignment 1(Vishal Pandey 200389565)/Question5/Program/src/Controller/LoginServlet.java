/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.*;

/**
 *
 *
 */
public class LoginServlet extends HttpServlet
{

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if(username != null && password != null && password.equals(Helper.check(username)) )
		{
			//set userid in request to pass it on to AccountServlet
			req.setAttribute("username", username);

			//userid,password verified. Forward request to AccountServlet.
			//observe the use of absolute path.
			req.getRequestDispatcher("/accountDetails").forward(req, res);
			return;
		}
		else
		{
			//Unable to login. Send login.jsp to the user.
			//observe the use of relative path.
			req.getRequestDispatcher("/login.jsp").forward(req, res);
			return;
		}

	}
	public void init()
	{
		Helper.setData("ann", "aaa");
		Helper.setData("john", "jjj");
		Helper.setData("mark", "mmm");
	}
}
