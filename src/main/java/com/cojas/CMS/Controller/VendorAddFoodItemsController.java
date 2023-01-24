package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.ItemVendorDaoImpl;
import com.ojas.CMS.dao.admin.AdminVendorImpl;
import com.ojas.CMS.model.FoodItems;

/**
 * Servlet implementation class VendorAddFoodItemsController
 */
@WebServlet("/addfoodbyvender")
public class VendorAddFoodItemsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorAddFoodItemsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     PrintWriter writer = response.getWriter();
		     response.setContentType("text/html");
		     String vname=request.getParameter("fname");
		      int qty=Integer.parseInt(request.getParameter("qty"));
		      double price=Double.parseDouble(request.getParameter("price"));
		      int vid=Integer.parseInt(request.getParameter("vid"));
		      
		     
		      
		       FoodItems foodItems=new FoodItems();
		        foodItems.setFname(vname);
		        foodItems.setQty(qty);
		        foodItems.setPrice(price);
		        foodItems.setVid(vid);
		     ItemVendorDaoImpl dao=new ItemVendorDaoImpl();
		     int status = dao.addFoodItem(foodItems);
		     if(status!=0) {
		    	 writer.println("Items aded SuccessFully");
		     RequestDispatcher rd=request.getRequestDispatcher("./9_vendor_addproduct.html");
		     }
		     else {
		    	 writer.println("unable to add");
		    	 RequestDispatcher rd=request.getRequestDispatcher("./9_vendor_addproduct.html");
		     }
		     
		     
		     
		    
	}

}
