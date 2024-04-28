package com.Db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.TextDao;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer noteid = Integer.parseInt(request.getParameter("note_id"));
		
		TextDao td = new TextDao(DBConnect.getConn());
		boolean f = td.deleteText(noteid);
		HttpSession session=null;
		if (f) {
			session = request.getSession();
			session.setAttribute("succMsg", "Text Note Deleted Successfully");
			response.sendRedirect("ViewNotes.jsp");
		} else {
			session = request.getSession();
			session.setAttribute("failedMsg", "Something went wrong on server.");
			response.sendRedirect("ViewNotes.jsp");
		}
	}

	

}
