package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.ViewManager;
import com.pojo.Product;

/**
 * Servlet implementation class BuyProductServlet
 */
@WebServlet("/BuyProductServlet")
public class BuyProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		ViewManager vm=new ViewManager();
		Product pro=new Product();
		pro=vm.showSignleProduct(pid);
		
		String proid=pro.getProductId();
		String proname=pro.getProname();
		String expo=pro.getExpireDate();
		String manu=pro.getManufacturedDate();
		Double price=pro.getPrice();
		
		HttpSession hs=request.getSession();
		hs.setAttribute("pid", proid);
		hs.setAttribute("proname", proname);
		hs.setAttribute("expireDate", expo);
		hs.setAttribute("manufactureDate", manu);
		hs.setAttribute("price", price);
		hs.setAttribute("pro", pro);
		response.sendRedirect("SingleProduct.jsp");
	}

}
