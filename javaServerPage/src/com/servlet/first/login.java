package com.servlet.first;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String user = request.getParameter("un");
		String pass = request.getParameter("pwd");
		if(user.equals("sandy") && pass.equals("sandy"))
		{
			out.println("<h3> welcome "+user);
			System.out.println("hi");
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
			out.close();
		}
		else
		{
			out.println("<p>"+user+". please enter correct username and password</p>");
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
			out.close();
		}
	}

}
