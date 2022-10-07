package com.survival.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.survival.domain.model.Product;
import com.survival.domain.repository.ProductRepository;

@WebServlet(name="ProductController",urlPatterns = {"/products.do","/addProduct.do"})
public class ProductController extends HttpServlet {
	
	private static final long serialVersionUID  = -8981601493800853908L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = req.getRequestURI().substring(req.getContextPath().length());
		ProductRepository repository = ProductRepository.getInstance();
		
		if(command.equals("/products.do")) {
			 
             List<Product> products = repository.getAllProducts();
             req.getSession().setAttribute("products",products);
		} else if (command.equals("/addProduct.do")) {
		
		}
		
		System.out.println("통과!!!");
		
		req.getRequestDispatcher("products.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
		
}