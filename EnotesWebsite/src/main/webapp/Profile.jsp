<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
    <title>Profile Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .profile-container {
            max-width: 800px;
            margin: 50px auto;
            margin-left: 30%;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            justify-content: center;
            text-align: center;
            margin-top: 100px;
        }
        
		#profile-picture {
			height: 200px;
			width: 200px;
			border-radius: 50%;
			margin-bottom: 20px;
		}
        
        h1, h2 {
            color: #333;
        }
        p {
            color: black;
        }
    </style>
    <%@include file="allComponents/cdnFile.jsp" %>
    <link rel="stylesheet" href="css/DashStyle.css">
	<link rel="stylesheet" href="css/style.css">
</head>
<body style="background: #E9C46A;">
<%@include file="allComponents/homeNav.jsp" %>
<%@include file="allComponents/SideNav.jsp" %>
<div class="profile-container">
    <h3>User Profile</h3>
    
    <%-- Display Profile Picture --%>
    <img id="profile-picture" src="https://cdn.pixabay.com/photo/2021/02/12/07/03/icon-6007530_640.png" alt="Profile Picture">
    
    <%-- Display User Details --%>
    <h4>User Details</h4>
    <p>Name: <%=user.getName()%></p>
    <p>Email: <%=user.getEmail()%></p>
    <p>Date of Birth: 14-05-2000</p>
    <p>Contact Number: 952244567</p>
    <p>Gender: Female</p>
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