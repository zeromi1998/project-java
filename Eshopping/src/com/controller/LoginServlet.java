package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.ViewManager;
import com.pojo.Register;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String e=request.getParameter("email");
		String p=request.getParameter("pass");
		
		Register r=new Register();;
		r.setEmail(e);
		r.setPassword(p);
		ViewManager vm=new ViewManager();
		r=vm.SearchData(e,p);
		if(r!=null)
		{
			HttpSession hs=request.getSession();
			hs.setAttribute("em", r);
			response.sendRedirect("index.jsp");
			
			
		}
		else {
			
			response.sendRedirect("UserLogin.jsp");
		}
		
		
		
		
	}

}
