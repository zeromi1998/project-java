package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.model.ViewManager;
import com.pojo.Product;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String mdate=request.getParameter("manu");
		String edate=request.getParameter("exp");
		Double p=Double.parseDouble(request.getParameter("p"));
		
		Product pro=new Product();
		pro.setProductId(id);
		pro.setProname(name);
		pro.setManufacturedDate(mdate);
		pro.setExpireDate(edate);
		pro.setPrice(p);
		
		
		ViewManager vm=new ViewManager();
		vm.AddProduct(pro);
		
		
		
	}

}
