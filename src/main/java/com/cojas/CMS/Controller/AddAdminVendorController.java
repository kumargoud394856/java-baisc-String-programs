package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.admin.AdminVendorImpl;

/**
 * Servlet implementation class AddAdminVendorController
 */
@WebServlet("/addvendor")
public class AddAdminVendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdminVendorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponsereq)
	 */
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	           
		
		PrintWriter out =res.getWriter();
		res.setContentType("text/html");
		String vendorName = req.getParameter("vname");
		String vendorEmail = req.getParameter("email");
		long vendorMobile = Long.parseLong(req.getParameter("mob"));
		String address = req.getParameter("address");
		AdminVendorImpl adminDAO = new AdminVendorImpl();
		String message = adminDAO.addVendor(vendorName, vendorEmail, vendorMobile, address);
		out.println(message);
		RequestDispatcher rd = req.getRequestDispatcher("./addvendor.html");
		rd.include(req,res);
	}

}
