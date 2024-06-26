package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.UserDao;
import com.Db.DBConnect;
import com.User.UserDetails;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String pwd = req.getParameter("upwd");

		UserDetails us = new UserDetails();
		us.setName(name);
		us.setEmail(email);
		us.setPassword(pwd);

		UserDao dao = new UserDao(DBConnect.getConn());
		boolean f = dao.addUser(us);

		// PrintWriter out = res.getWriter();
		HttpSession session;
		if (f) {
			// out.print("User Registered Successfully.");
			session = req.getSession();
			session.setAttribute("reg-success", "Registered Successfully...");
			res.sendRedirect("register.jsp");
		} else {
			// out.print("Data not inserted.");
			session = req.getSession();
			session.setAttribute("failed", "Something went wrong on server. Try using different email...");
			res.sendRedirect("register.jsp");
		}
		
	}
}
