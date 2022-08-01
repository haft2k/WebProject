package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAO;
import com.model.LoginBean;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginDAO loginDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() { loginDAO = new LoginDAO(); }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {

		response.sendRedirect("login/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {
		authenticate(request, response);
	}

	private void authenticate( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {

		LoginBean lBean = new LoginBean();
		lBean.setUsername(request.getParameter("username"));
		lBean.setPassword(request.getParameter("password"));
		
		RequestDispatcher reqDispatcher = null;
		try {
			// validateLogin LoginBean SQL username, password
			if (loginDAO.validateLogin(lBean)) {
				reqDispatcher = request.getRequestDispatcher("page/home.jsp");
				reqDispatcher.forward(request, response);
				
			} else {
				HttpSession session = request.getSession();
				reqDispatcher = request.getRequestDispatcher("login/login.jsp");
				reqDispatcher.include(request, response);
			}
			
		} catch (Exception e) {}
	}

}
