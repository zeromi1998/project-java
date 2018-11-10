package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.ViewManager;
import com.pojo.Admin;


/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String  us=request.getParameter("user");
		String  p=request.getParameter("pass");
		
		Admin a=new Admin();
		a.setUsername(us);
		a.setPassword(p);
		
		ViewManager vm=new ViewManager();
		a=vm.SearchAdminData(us,p);
		
		
		if (a!=null) 
		{
			HttpSession hs=request.getSession();
			hs.setAttribute("um", a);
			response.sendRedirect("AddProducts.jsp");
				
		}
		else {
			response.sendRedirect("AdminLogin.jsp");
		}
		
		
	}

}
