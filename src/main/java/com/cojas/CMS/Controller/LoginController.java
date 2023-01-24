package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.LoginDaoImpl;


/**
 * Servlet implementation class loginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   PrintWriter out=response.getWriter();
		   response.setContentType("text/html");
		   String uname=request.getParameter("uname");
		   String pwd=request.getParameter("pass");
		   System.out.println(uname+"\t"+pwd);
		  
		   
		  LoginDaoImpl dao=new LoginDaoImpl();
		  String type = dao.login(uname,pwd);
		 
		  if(type.equals("admin")) {
				RequestDispatcher rd = request.getRequestDispatcher("./1_admin.html");
				rd.include(request, response);
			}else if(type.equals("vendor")){
				RequestDispatcher rd = request.getRequestDispatcher("./8_vendor.html");
				rd.include(request, response);
			}else if(type.equals("customer")){
				RequestDispatcher rd = request.getRequestDispatcher("./5_customer.html");
				rd.include(request, response);
			}else if(type.equals("")) {
				out.println("Invalid Username/password . please try again");
				RequestDispatcher rd = request.getRequestDispatcher("./0_index.html");
				rd.include(request, response);
			}
			
	}
	
	

}
