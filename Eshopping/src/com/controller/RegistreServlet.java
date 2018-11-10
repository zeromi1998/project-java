package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ViewManager;
import com.pojo.Register;

/**
 * Servlet implementation class RegistreServlet
 */
@WebServlet("/RegistreServlet")
public class RegistreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String add=request.getParameter("add");
		String pho=request.getParameter("pho");
		
		Register r=new Register();
		r.setName(name);
		r.setEmail(email);
		r.setPassword(pass);
		r.setAddress(add);
		r.setPhone(pho);
		
		ViewManager vm=new ViewManager();
		vm.SaveUserData(r);
		response.sendRedirect("UserLogin.jsp");
		
		
	}

}
