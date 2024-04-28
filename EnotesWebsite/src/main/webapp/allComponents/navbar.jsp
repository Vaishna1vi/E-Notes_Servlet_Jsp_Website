<%@page import="java.net.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav
	class="navbar navbar-expand-lg border-bottom border-2 border-dark bg-custom navbar-custom">
	<div class="container-fluid ">
		<a class="navbar-brand" href="#" type="button" data-bs-toggle="modal"
			data-bs-target="#staticBackdropLogo"> <img id="logo"
			style=" gap: 10px; border-radius: 100px;" alt=""
			src="https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=50&h=50&rs=1&pid=ImgDetMain">
			Study-Scribe
		</a>
		<!-- Modal -->
		<div class="modal fade" id="staticBackdropLogo" data-bs-backdrop="static"
			data-bs-keyboard="false" tabindex="-1"
			aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content bg-transparent border-0">
					<div class="modal-header text-white border-0">
						<button type="button" class="btn-close bg-white"
							data-bs-dismiss="modal" aria-label="Close"></button>
					</div>
					<div class="modal-body bg-transparent text-white">
						<img id="logo" style="border-radius: 300px;" alt=""
							src="https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=450&h=450&rs=1&pid=ImgDetMain">
					</div>
				</div>
			</div>
		</div>
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

				<li class="nav-item"><a class="nav-link" href="#" type="button"
					data-bs-toggle="modal" data-bs-target="#staticBackdrop"><i
						class="fa-solid fa-file-circle-plus"></i>Add Notes</a> <!-- Modal -->
					<div class="modal fade" id="staticBackdrop"
						data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
						aria-labelledby="staticBackdropLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h1 class="modal-title fs-5" id="staticBackdropLabel">Alert</h1>
									<button type="button" class="btn-close" data-bs-dismiss="modal"
										aria-label="Close"></button>
								</div>
								<div class="modal-body">Please register or login first
									before adding notes...</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-bs-dismiss="modal">Understood</button>
								</div>
							</div>
						</div>
					</div></li>

				<li class="nav-item"><a class="nav-link" href="#" type="button"
					data-bs-toggle="modal" data-bs-target="#Backdrop"><i
						class="fa-solid fa-eye"></i>View Notes</a> <!-- Modal -->
					<div class="modal fade" id="Backdrop" data-bs-backdrop="static"
						data-bs-keyboard="false" tabindex="-1"
						aria-labelledby="staticBackdropLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h1 class="modal-title fs-5" id="staticBackdropLabel">Alert</h1>
									<button type="button" class="btn-close" data-bs-dismiss="modal"
										aria-label="Close"></button>
								</div>
								<div class="modal-body">Please login first to view your
									notes...</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-bs-dismiss="modal">Understood</button>
								</div>
							</div>
						</div>
					</div></li>
			</ul>

			<a href="login.jsp" class="btn mx-3" type="submit"><i
				class="fa-solid fa-user-check"></i>Login</a> <a href="register.jsp"
				class="btn mx-3" type="submit"><i class="fa-solid fa-user-plus"></i>Register</a>

		</div>
		
	</div>
</nav>