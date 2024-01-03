package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.UserDao;
import com.Db.DBConnect;
import com.User.UserDetails;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = request.getParameter("logname");
		String pwd = request.getParameter("logpwd");

		UserDetails us = new UserDetails();
		us.setEmail(email);
		us.setPassword(pwd);

		UserDao dao = new UserDao(DBConnect.getConn());
		boolean f = dao.loginUser(us);

		if (f) {
			response.sendRedirect("dashboard.jsp");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("failed", "Invalid Credentials...");
			response.sendRedirect("login.jsp");
		}
	}

}
