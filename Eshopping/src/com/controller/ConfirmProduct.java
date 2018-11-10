package com.controller;

import java.io.IOException;
import java.security.SecureRandom;
import java.sql.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.ViewManager;
import com.pojo.Order;
import com.pojo.Product;
import com.pojo.Register;

/**
 * Servlet implementation class ConfirmProduct
 */
@WebServlet("/ConfirmProduct")
@MultipartConfig(maxFileSize = 16175455)
public class ConfirmProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Random RANDOM = new SecureRandom();
	public static final int PASSWORD_LENGTH = 8;
	public static String generateRandomPassword()
	{
		 String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ23456789";
		 String pw="";
		 for(int i=0;i<PASSWORD_LENGTH;i++)
			 {
			 int index = (int)(RANDOM.nextDouble()*letters.length());
			 pw += letters.substring(index, index+1);
			 }
		 return pw;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orid=ConfirmProduct.generateRandomPassword();
		//Date date=new Date(date);
		Date date=new Date(0);
		
		
		HttpSession hs=request.getSession();
		Register r=(Register)hs.getAttribute("em");
		
		HttpSession ht=request.getSession();
		Product pro=(Product)ht.getAttribute("pro");
		
		Order or=new Order();
		or.setOrderId(orid);
		or.setOrderDate(date);
		or.setRegister(r);
		or.setProduct(pro);
		
		ViewManager vm=new ViewManager();
		vm.SaveOrder(or);
		
		
		
		
		
	}

}
