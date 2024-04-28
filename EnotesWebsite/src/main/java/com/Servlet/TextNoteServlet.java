package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.TextDao;
import com.Db.DBConnect;

@WebServlet("/TextNoteServlet")
public class TextNoteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String useremail = request.getParameter("useremail");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
	
		TextDao td = new TextDao(DBConnect.getConn());
	boolean f =	td.addText(title, content, useremail);
	
	if(f) {
		System.out.println("Text Note Added successfully...");
		response.sendRedirect("ViewNotes.jsp");
		}else {
			System.out.println("Text Note Not Added !!");
		}
	}
		
		
	}

