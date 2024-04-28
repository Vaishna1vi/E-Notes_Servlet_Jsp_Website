<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
<%@page import="com.Dao.UserDao"%>
<%@page import="com.Dao.TextDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.Db.DBConnect" %>
	<%@page import="com.User.UserDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.editpwd-container {
	max-width: 800px;
	background-color: #ffffba;
	margin: 50px auto;
	margin-left: 30%;
	padding: 20px;
	border-radius: 10px;
	justify-content: center;
	margin-top: 150px;
	margin-bottom: 150px;
}
</style>
<%@include file="allComponents/cdnFile.jsp"%>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/DashStyle.css">
</head>
<body style="background: #E9C46A;" >

<%@include file="allComponents/homeNav.jsp" %>
<%@include file="allComponents/SideNav.jsp"%>
<div class="editpwd-container">
	<h1 class="text-center mt-2">Edit your password here</h1>
		<div class="row">
			<div class="col-md-12">
				<form action="EditPwdServlet" method="post">
				
					<input type="hidden" name="email" value="<%=user.getEmail()%>" />
				
					
					<div class="form-group mb-3 text-start">	
						<label for="exampleInputEmail1">Password:</label> <input
							type="text" class="form-control mt-2" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter title"
							name="pwd" required="required" value="<%=user.getPassword()%>" >
					</div>
					
					<div class="container text-center">
						<button type="submit" class="btn btn-primary mt-3">Update</button>
					</div>
				</form>
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
	<%@include file="allComponents/footer.jsp" %>
	<script>
    // Disable browser back button
    window.history.pushState(null, null, location.href);
    window.onpopstate = function () {
        window.history.forward();
    };
</script>
	
</body>
</html>