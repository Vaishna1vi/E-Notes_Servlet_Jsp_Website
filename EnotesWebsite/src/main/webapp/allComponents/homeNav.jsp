<%@page import="java.net.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.User.UserDetails"%>
<nav
	class="navbar navbar-expand-lg border-bottom border-2 border-dark bg-custom navbar-custom"
	style="width: 100%; position: fixed; top: 0%;">
	<div class="container-fluid ">

		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<ul class="navbar-nav me-auto mb-2 mb-lg-0 mx-5">

			</ul>

			<a href="#" class="btn mx-3" type="button" data-bs-toggle="modal"
				data-bs-target="#BackdropHome"><i class="fa-solid fa-user-check"></i>
				<%
				UserDetails us = (UserDetails) session.getAttribute("currentUser");
				if (us != null) {
					out.println(us.getName());
				}
				%> </a>
			
			
			
			<a href="LogoutServlet" class="btn mx-3" type="submit"><i
				class="fa-solid fa-user-plus"></i>Logout</a>

		</div>
		
			</div>
</nav>