package net.javaguides.usermanagement.web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.usermanagement.dao.UserDAO;
import net.javaguides.usermanagement.model.User;


/**
 * Servlet implementation class UserServlet123
 */
@WebServlet("/")
public class UserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServelet() {

		super();
		// TODO Auto-generated constructor stub
	}

	public void init() { userDAO = new UserDAO(); }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		String action = request.getServletPath();
		// response.getWriter().append(action);
		try {
			switch (action) {
				case "/":
					response.getWriter().append("You are at New ....");
					break;
				default:
					response.getWriter().append("You are at HomePage");
					break;
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void listAllUsers(HttpServletRequest request, HttpServletResponse response) {

		// lay ra ket qua tra ve tu UserDAO
		List<User> lstOfUsers = new UserDAO().selectAllUsers();
		request.setAttribute("lstUsers", lstOfUsers);
	}

}