package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.TextDao;
import com.Dao.UserDao;
import com.Db.DBConnect;

/**
 * Servlet implementation class EditPwdServlet
 */
@WebServlet("/EditPwdServlet")
public class EditPwdServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			String pwd = request.getParameter("pwd");
			String email = request.getParameter("email");
			
			UserDao ud = new UserDao(DBConnect.getConn());
			boolean f = ud.updatePwd(pwd, email);
			
			if(f) {
				System.out.println("Password Updated successfully");
				HttpSession session = request.getSession();
				session.setAttribute("updateMsg", "Password Updated Successfully. Login Again !!");
				session.removeAttribute("currentUser");
				response.sendRedirect("login.jsp");
			} else {
				System.out.println("Password Not Updated !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
