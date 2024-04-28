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

/**
 * Servlet implementation class EditProfileServlet
 */
@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
	String photo = request.getParameter("profilePic");
	String dob = request.getParameter("dob");
	String phone = request.getParameter("phonenumber");
	String gender = request.getParameter("gender");
	String uname =  request.getParameter("name");
	String email = request.getParameter("useremail");
	String uId = request.getParameter("uId");
	
	UserDao ud = new UserDao(DBConnect.getConn());
	boolean f = ud.addProfile(photo, phone, dob, gender, uname, email, uId);
	if(f) {
		System.out.println("Profile Updated");
		HttpSession session = request.getSession();
		session.setAttribute("updateMsg", "Profile Updated Successfully");
		response.sendRedirect("Profile.jsp");
	} else {
		System.out.println("Profile Not Updated !!");
	}
} catch (Exception e) {
	e.printStackTrace();
}
		
		
	}

}
