<%@page import="java.util.List"%>
<%@page import="com.Db.DBConnect"%>
<%@page import="com.Dao.TextDao"%>
<%@page import="com.User.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<style>
body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        
        .count-container {
	        max-width: 800px;
            margin: 50px auto;
            margin-left: 30%;
            background-color: #fff;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            justify-content: center;
            text-align: center;
            margin-top: 150px;
            margin-bottom: 100px;
        }

h1 {
	color: #333;
	font-size: 1.5em;
	margin-bottom: 20px;
	padding-bottom: 25px;
}

#noteCount, #recycleBinCount {
	color: #555;
	font-size: 1.2em;
	cursor: pointer;
	transition: transform 0.2s;
}

#noteCount:hover, #recycleBinCount:hover {
	transform: scale(1.1);
}
</style>
<%@include file="allComponents/cdnFile.jsp"%>
<!-- <link rel="stylesheet" href="css/DashStyle.css"> -->
<!-- <link rel="stylesheet" href="css/style.css"> -->
</head>
<body style="background: #E9C46A;">

	<%@include file="allComponents/SideNav.jsp"%>
	<%@include file="allComponents/homeNav.jsp"%>
	<div class="count-container">

		<h1>Notes Dashboard</h1>

		<%
				UserDetails user2 = (UserDetails) session.getAttribute("currentUser");
				if (user2 != null) {
					TextDao textDao = new TextDao(DBConnect.getConn());
					List<textNotes> list = textDao.getAllText(user2.getEmail());
					int totalNotesCount = list.size();
					int recycleBinCount = list.size()-list.size()+1;
					
				%>

		<a href="ViewNotes.jsp">
			<p id="noteCount">
				Total Count of Notes:
				<%=totalNotesCount%></p>
		</a> <a href="">
			<p id="recycleBinCount">
				Count of Deleted Notes:
				<%=recycleBinCount%></p>
		</a>
		<% } %>
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
