<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Add TextNotes</title>
  <style>
  
  body {
	font-family: 'Roboto', sans-serif;
	background: linear-gradient(to bottom right, #74ebd5, #ACB6E5);
	margin: 0;
	padding: 0;
	text-align: center;
	justify-content: center;
	align-items: center;
	height: auto;
	overflow: hidden;
}
.container {
	margin-top: 100px;
}

  
  </style>
  <%@include file="allComponents/cdnFile.jsp"%>
</head>
<body style="background: #E9C46A;">
<%@include file="allComponents/SideNav.jsp"%>
	<%@include file="allComponents/homeNav.jsp"%>
	
	<div class="container mt-200">
		<div class="card mt-5 mb-5" style="width: 50rem; justify-content: center; align-items: center; margin-left: 25%; margin-top: 5%;">
			<div class="card-body text-center">
			<img style="width: 250px; height: 250px;" class="img-fluid mx-auto" alt="Note-Book Icon" src="https://cdn-icons-png.flaticon.com/512/446/446718.png">
			<h1 class="card-title">Start taking your Text Notes</h1>
			<a href="TextNotes.jsp" class="btn btn-outline-primary">Start</a>
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
					<td><%= user.getName() %></td>
					</tr>
					
					<tr>
					<th>Email ID</th>
					<td><%= user.getEmail() %></td>
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