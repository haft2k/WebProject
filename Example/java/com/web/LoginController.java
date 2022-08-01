package com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {
		// TODO Auto-generated method stub
		authenticate(request, response);
	}

	private void authenticate( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {
		
		LoginBean lBean = new LoginBean();
		lBean.setUsername(request.getParameter("username"));
		lBean.setPassword(request.getParameter("password"));
		
		try {
			if (loginDAO.validateLogin(lBean)) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
