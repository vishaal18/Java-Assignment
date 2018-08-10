/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 *
 */
public class LoginServlet extends HttpServlet
{
	Hashtable users = new Hashtable();

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
		String userid = req.getParameter("username");
		String password = req.getParameter("password");


		if(userid != null && password != null && password.equals(users.get(userid)) )
		{
			//set userid in request to pass it on to AccountServlet
			req.setAttribute("userid", userid);

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
		users.put("ann", "aaa");
		users.put("john", "jjj");
		users.put("mark", "mmm");
	}

}

