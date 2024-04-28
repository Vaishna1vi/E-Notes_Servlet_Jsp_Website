<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.Dao.TextDao" %>
	<%@ page import="com.Db.DBConnect" %>
	<%@ page import="com.User.UserDetails" %>
	<%@ page import="com.User.textNotes" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Your Text Notes</title>
<style type="text/css">
.edit-container {
	max-width: 800px;
	background-color: #ffffba;
	margin: 50px auto;
	margin-left: 30%;
	padding: 20px;
	border-radius: 10px;
	justify-content: center;
	margin-top: 100px;
	margin-bottom: 50px;
}
</style>
<%@include file="allComponents/cdnFile.jsp"%>
 <link rel="stylesheet" href="css/DashStyle.css"> 
 <link rel="stylesheet" href="css/style.css"> 
</head>
<body style="background: #E9C46A;">
<%
Integer id = Integer.parseInt(request.getParameter("note_id"));
TextDao textDao = new TextDao(DBConnect.getConn());
textNotes tn = textDao.getDataById(id);
%>
<%@include file="allComponents/SideNav.jsp"%>
	<%@include file="allComponents/homeNav.jsp"%>
	<div class="edit-container">
	<h1 class="text-center mt-2">Edit your text note here</h1>
		<div class="row">
			<div class="col-md-12">
				<form action="EditTextServlet" method="post">
					<input type="hidden" name="noteid" value="<%=id%>" />
					<div class="form-group mb-3 text-start">	
						<label for="exampleInputEmail1">Note Title:</label> <input
							type="text" class="form-control mt-2" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter title"
							name="title" required="required" value="<%=tn.getTitle()%>" >
					</div>
					<div class="form-group mb-3 text-start">
						<label for="exampleInputEmail1">Description:</label>
						<textarea class="form-control mt-2" id="exampleFormControlTextarea1"
							rows="5" cols="50" placeholder="Enter the content" name="content"
							required="required" ><%=tn.getContent() %></textarea>
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
</body>
</html>