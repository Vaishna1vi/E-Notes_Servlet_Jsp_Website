<%@page import="java.net.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav
	class="navbar navbar-expand-lg border-bottom border-2 border-dark bg-custom navbar-custom">
	<div class="container-fluid ">
		<a class="navbar-brand" href="#"><i
			class="fa-solid fa-book-open-reader"></i>E-Notes</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<ul class="navbar-nav me-auto mb-2 mb-lg-0 mx-5">
				<li class="nav-item"><a class="nav-link" href="index.jsp"><i
						class="fa-solid fa-house-user"></i>Home</a></li>
				<%
				String msg = (String) request.getAttribute("alertMsg");
				%>
				<li class="nav-item"><a class="nav-link" href="#"
					onclick="alert('<%=msg%>')"><i
						class="fa-solid fa-file-circle-plus"></i>Add Notes</a></li>

				<li class="nav-item"><a class="nav-link" href="#"><i
						class="fa-solid fa-eye"></i>View Notes</a></li>
			</ul>

			<a href="login.jsp" class="btn mx-3" type="submit"><i
				class="fa-solid fa-user-check"></i>Login</a> <a href="register.jsp"
				class="btn mx-3" type="submit"><i class="fa-solid fa-user-plus"></i>Register</a>

		</div>
	</div>
</nav>