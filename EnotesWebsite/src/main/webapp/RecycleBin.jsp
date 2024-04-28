<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.User.*"%>
<%@page import="com.Dao.TextDao"%>
<%@page import="java.util.*"%>
<%@page import="com.Db.DBConnect"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Text Notes</title>
<style type="text/css">
.notes-container {
	max-width: 800px;
	margin: 50px auto;
	margin-left: 30%;
	padding: 20px;
	border-radius: 10px;
	justify-content: center;
	margin-top: 100px;
	margin-bottom: 50px;
	text-align: center;
}

.note-card {
	background-color: #ffffba;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	justify-content: center;
	margin-top: 50px;
	margin-bottom: 50px;
}
</style>
<%@include file="allComponents/cdnFile.jsp"%>
<!-- <link rel="stylesheet" href="css/DashStyle.css"> -->
<!-- <link rel="stylesheet" href="css/style.css"> -->
</head>
<body style="background: #E9C46A;">
	<%@include file="allComponents/SideNav.jsp"%>
	<%@include file="allComponents/homeNav.jsp"%>
	<%
	String msg = (String) session.getAttribute("updateMsg");
	if (msg != null) {
	%>
	<div class="alert alert-success text-center" style="width: 50%; margin-left: 35%; margin-top: 6%;" role="alert"><%=msg%>
	</div>
	<%
	session.removeAttribute("updateMsg");
	}
	%>
	<%
	String delmsg = (String) session.getAttribute("succMsg");
	if (delmsg != null) {
	%>
	<div class="alert alert-success text-center" style="width: 50%; margin-left: 35%; margin-top: 6%;" role="alert"><%=delmsg%>
	</div>
	<%
	session.removeAttribute("succMsg");
	}
	%>
	<%
	String wrongmsg = (String) session.getAttribute("failedMsg");
	if (wrongmsg != null) {
	%>
	<div class="alert alert-success text-center" style="width: 50%; margin-left: 35%; margin-top: 6%;" role="alert"><%=msg%>
	</div>
	<%
	session.removeAttribute("failedMsg");
	}
	%>
	<div class="notes-container">
		<h2>Text Notes</h2>
		<div class="row">
			<div class="col-md-12">
				<%
				UserDetails user2 = (UserDetails) session.getAttribute("currentUser");
				if (user2 != null) {
					TextDao textDao = new TextDao(DBConnect.getConn());
					List<textNotes> list = textDao.getAllText(user2.getEmail());
					for (textNotes tn : list) {
				%>
				<div class="note-card mt-3">
					<img alt=""
						src="https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=100&h=100&rs=1&pid=ImgDetMain"
						class="card-img-top mt-2 mx-auto" style="max-width: 100px;">
					<div class="card-body p-4">

						<h5 class="card-title"><%=tn.getTitle()%></h5>
						<p class="card-text"><%=tn.getContent()%>.
						</p>
						<p>
							<b class="text-muted">Published by: <%=user2.getName()%></b> <br>
							<b class="text-muted">Published Date: <%=tn.getPdate()%></b> <br>
							<b class="text-muted">Note Id: <%=tn.getId()%></b>
						</p>
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%=tn.getId()%>" class="btn btn-danger mx-3 px-3">Delete</a>
							<a href="edit.jsp?note_id=<%=tn.getId()%>"
								class="btn btn-primary mx-3 px-3">Edit</a> <a
								href="mailto:?subject=Text Notes send by Author: <%=user2.getName()%>, Title: <%=tn.getTitle()%>&body=<%=tn.getContent()%>"
								class="btn btn-success mx-3 px-3">Share</a>
						</div>
					</div>
				</div>
				<%
				}
				}
				%>

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