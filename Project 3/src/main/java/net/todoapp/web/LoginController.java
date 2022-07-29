package net.todoapp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.todoapp.dao.LoginDAO;
import net.todoapp.model.LoginBean;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	
		processLogin(request, response);
	}

	private void processLogin(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		String userName = request.getParameter("txtUserName");
		String passWord = request.getParameter("txtPassWord");
		
		LoginBean lBean = new LoginBean(userName, passWord);
		LoginDAO logDAO = new LoginDAO();
		
		if (logDAO.checkLogin(lBean)) {
			HttpSession session = request.getSession();
			session.setAttribute("user_name", lBean.getUsername());
			RequestDispatcher reqDis = request.getRequestDispatcher("todo/admin_homepage.jsp");
			
		} else {
			// checkLogin no
			response.sendRedirect("login/login.jsp");

		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
