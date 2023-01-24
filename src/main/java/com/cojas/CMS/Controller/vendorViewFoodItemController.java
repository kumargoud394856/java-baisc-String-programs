package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.ItemVendorDaoImpl;
import com.ojas.CMS.model.FoodItems;

/**
 * Servlet implementation class AdminViewFoodItemController
 */
@WebServlet("/adminviewItem")
public class vendorViewFoodItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public vendorViewFoodItemController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		int vid = Integer.parseInt(req.getParameter("vid"));
		ItemVendorDaoImpl dao = new ItemVendorDaoImpl();
		FoodItems fooditem = dao.viewFoodItem(vid);

		writer.println("<p> food id:" + fooditem.getFid() + "<br>" +

				" food  name" + fooditem.getFname() + "<br>  price " + fooditem.getPrice() + "<br> Qty:"
				+ fooditem.getQty() + "<br> Address:" + fooditem.getVid());

	}

}
