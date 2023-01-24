package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.LoginDAO;
import com.ojas.CMS.dao.LoginDaoImpl;


/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/fpass")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("username");
		String type = request.getParameter("rtype");
		LoginDAO dao = new LoginDaoImpl();
		String pwd = dao.forgotPassword(uname, type);
		if(!pwd.equals(null)) {
		out.println("Your Forgoted Password : "+pwd);
		RequestDispatcher rd = request.getRequestDispatcher("./signin.html");
		rd.include(request, response);
		}else {
			out.println("Invalid Username / Type. Please try again....");
			RequestDispatcher rd = request.getRequestDispatcher("./forgot.html");
			rd.include(request, response);
		}
	}

}
