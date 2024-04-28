<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
<style type="text/css">
.profile-container {
	max-width: 800px;
	margin: 50px auto;
	background-color: #ffffba;
	margin-left: 30%;
	padding: 20px;
	border-radius: 10px;
	justify-content: center;
	margin-top: 100px;
	margin-bottom: 50px;
	text-align: center;
}</style>
<%@include file="allComponents/cdnFile.jsp"%>
<link rel="stylesheet" href="css/DashStyle.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body style="background: #E9C46A;">
	<%@include file="allComponents/homeNav.jsp"%>
	<%@include file="allComponents/SideNav.jsp"%>
	<div class="profile-container">
	<h1 class="text-center mt-5">Edit Profile</h1>
		<div class="container w-50 mx-auto mt-50">
			<div class="row">
				<div class="col-md-12">
					<form action="EditProfileServlet" method="post"
						enctype="multipart/form-data">
							<!-- Date of Birth -->
							<%
							UserDetails cuser = (UserDetails) session.getAttribute("currentUser");
							if (cuser == null) {
								session.setAttribute("failed", "Login first or");
								response.sendRedirect("login.jsp");
								} else {
							%>
							<div class="form-group text-start mb-2">

								<label for="exampleInputEmail1">Email</label>
								<!-- Profile Picture -->
								<input type="email" class="form-control mt-1"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter title" name="useremail" required="required"
									value="<%=cuser.getEmail()%>" disabled> <br>
							</div>
						<div class="form-group text-start mb-2">
							<label for="exampleInputEmail1">Name</label> <input type="text"
								class="form-control mt-1" id="exampleInputEmail1" name="name"
								value="<%=cuser.getName()%>" required="required"> <br>
						</div>
							<%
							} 
							
							%>

						<div class="form-group text-start mb-2">

							<label for="exampleInputEmail1">Profile Picture</label>
							<!-- Profile Picture -->
							<input type="file" class="form-control mt-1" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="Enter title"
								name="profilePic" required="required"> <br>
						</div>
						<div class="form-group text-start mb-2">
							<!-- Date of Birth -->
							<label for="exampleInputEmail1">Date of Birth</label> <input
								type="date" class="form-control mt-1" id="exampleInputEmail1"
								name="dob" required="required"> <br>
						</div>

						<div class="form-group text-start mb-2">
							<!-- Date of Birth -->
							<label for="exampleInputEmail1">Contact Number</label> <input
								type="number" class="form-control mt-1" id="exampleInputEmail1"
								name="phonenumber" required="required"> <br>
						</div>
						<div class="form-group text-start mb-2">
							<!-- Gender -->
							<label for="exampleInputEmail1">Gender</label> <select
								name="gender">
								<option value="M">Male</option>
								<option value="F">Female</option>
								<option value="O">Other</option>
							</select> <br>
						</div>
						<div class="container text-center mb-2">
							<button type="submit" class="btn btn-primary">Save</button>
						</div>
					</form>
				</div>
			</div>

		</div>

	</div>
	<div class="modal fade" id="BackdropHome" data-bs-backdrop="static"
		data-bs-keyboard="false" tabindex="-1"
		aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="staticBackdropLabel">Login
						Details</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>

				<div class="modal-body">

					<div class="text-center">
						<i class="fa fa-user fa-3x"></i>
						<h5></h5>
						<table class="table">
							<tbody>

								<tr>
									<th>Full Name</th>
									<td>
										<%
										if (user != null) {
										%><%=user.getName()%> <%
 } else {
 session.setAttribute("failed", "Login first or");
 response.sendRedirect("login.jsp");
 }
 %>

									</td>
								</tr>

								<tr>
									<th>Email ID</th>
									<td>
										<%
										if (user != null) {
										%><%=user.getEmail()%> <%
 }
 %>
									</td>
								</tr>

							</tbody>

						</table>
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Close</button>
					</div>

				</div>
			</div>
		</div>

	</div>
	<%@include file="allComponents/footer.jsp"%>
</body>
</html>