/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 * This software is the confidential and proprietary
 * information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it
 * only in
 * accordance with the terms of the license agreement you
 * entered into
 * with GumBox
 */
/**
 * 
 */
package net.usermanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.usermanagement.dao.UserDAO;
import net.usermanagement.model.User;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() { userDAO = new UserDAO(); }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
				case "/new":
					showNewForm(request, response);
					break;
				case "/insert":
					insertUser(request, response);
					break;
				case "/delete/":
					deleteUser(request, response);
					break;
				case "/edit":
					showEditForm(request, response);
					break;
				case "/update":
					updateUser(request, response);
					break;
				default:
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void listUser( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.selectAllUsers();

		request.setAttribute("listUser", listUser);

		RequestDispatcher dispatcher = request.getRequestDispatcher("user_list.jsp");
		dispatcher.forward(request, response);
	}
	/*
	 * new form for user input database
	 */
	private void showNewForm( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user_list.jsp");
		dispatcher.forward(request, response);
	}
	
	/*
	 * show form edit user exist
	 */
	private void showEditForm( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {

		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userDAO.selectUser(id);

		RequestDispatcher dispatcher = request.getRequestDispatcher("user_list.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	/*
	 * put new user to database
	 */
	private void insertUser( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country);

		userDAO.insertUser(newUser);
		response.sendRedirect("list");
	}

	/*
	 * change information of user in database
	 */
	private void updateUser( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("countr");

		User book = new User(id, name, email, country);
		userDAO.updateUser(book);
		response.sendRedirect("list");
	}

	/*
	 * delete user in database withd id
	 */
	private void deleteUser( HttpServletRequest request, HttpServletResponse response )
	        throws SQLException, IOException, ServletException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
		response.sendRedirect("list");
	}

}
