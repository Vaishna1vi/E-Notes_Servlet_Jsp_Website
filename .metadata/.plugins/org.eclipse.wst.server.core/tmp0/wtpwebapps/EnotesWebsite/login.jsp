<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.main .row .reg .card .cd {
	background-color: #f25c54;
}

.row {
	background-image: linear-gradient(to left bottom, #94d2bd, #98c89e, #a6bb7e, #b9ab64,
		#cc9857, #cc9857, #cc9857, #cc9857, #b9ab64, #a6bb7e, #98c89e, #94d2bd
		);
}
</style>
<meta charset="UTF-8">
<title>Login Page</title>
<%@include file="allComponents/cdnFile.jsp"%>
</head>
<body>
	<%@include file="allComponents/navbar.jsp"%>
	
	<div class="container-fluid main">
	
		<div class="row">
			<div class="col-md-4 offset-md-4 reg">
				<div class="card my-5 border-black text-center">
					<div class="card-header border-black cd">
						<i class="fa-solid fa-house-user fa-3x"></i>
						<h4>Login</h4>
					</div>
					<%
					String logMsg = (String) session.getAttribute("failed");
					if (logMsg != null) {
					%>
					<div class="alert alert-danger" role="alert"><%=logMsg%>
						Register first <a href="register.jsp"> Click-here</a>
					</div>
					<%
					session.removeAttribute("failed");
					}
					%>
					
					<%
				 String lgMsg = (String)session.getAttribute("logoutMsg");
					if(lgMsg!=null){%>
						<div class="alert alert-success" role="alert"><%=lgMsg%>
					</div>
					<%
					session.removeAttribute("logoutMsg");
					}
					%>
					<%
if(session.getAttribute("user") == null){
	String msg = (String) session.getAttribute("updateMsg"); 
	if (msg != null) {%>
	<div class="alert alert-success text-center" role="alert"><%=msg%>
	</div>
<% 
 session.removeAttribute("updateMsg"); } }
%>
					<div class="card-body">
						<form class="item-center" action="LoginServlet" method="post">
							<div class="mb-3 text-start">
								<label for="exampleInputEmail1" class="form-label">Email
									Address</label> <input type="email" placeholder="Enter Email-Id"
									class="form-control border-secondary" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="logname" required="required">
							</div>
							<div class="mb-3 text-start">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control border-secondary"
									placeholder="Enter Password" id="exampleInputPassword1"
									name="logpwd" required="required">
							</div>
							<button type="submit"
								class="btn btn-success px-5 mx-auto col-6 rounded-pill ">Login</button>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

	<%@include file="allComponents/footer.jsp"%>


</body>
</html>