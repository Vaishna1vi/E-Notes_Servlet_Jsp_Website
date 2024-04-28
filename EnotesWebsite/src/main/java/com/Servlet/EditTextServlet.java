package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.TextDao;
import com.Db.DBConnect;

/**
 * Servlet implementation class EditTextServlet
 */
@WebServlet("/EditTextServlet")
public class EditTextServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Integer id = Integer.parseInt(request.getParameter("noteid"));
			String Title = request.getParameter("title");
			String Content = request.getParameter("content");
			
			TextDao td = new TextDao(DBConnect.getConn());
			boolean f = td.updateText(id, Title, Content);
			
			if(f) {
				System.out.println("Text Note Updated successfully");
				HttpSession session = request.getSession();
				session.setAttribute("updateMsg", "Text Note Updated Successfully");
				response.sendRedirect("ViewNotes.jsp");
			} else {
				System.out.println("Text Note Not Updated !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
