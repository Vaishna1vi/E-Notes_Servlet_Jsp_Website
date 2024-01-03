<%@page import="java.sql.Connection"%>
<%@page import="com.Db.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.back-img {
	height: 80vh;
	width: 100%;
	background:
		url("https://blacklinesandbillables.com/wp-content/uploads/2016/09/notepad-1280x640.jpeg")
		no-repeat center center/cover;
}

.content {
	margin-top: 1rem;
}

.head {
	color: #b39ddb;
	padding-top: 50px;
}

.book-icon {
	color: #264653;
}
</style>
<meta charset="UTF-8">
<title>E-Notes-Website</title>
<%@include file="allComponents/cdnFile.jsp"%>
</head>
<body>
	<%@include file="allComponents/navbar.jsp"%>

	<div class="back-img">
		<div class="container-fluid text-center">
			<h1 class="head">
				<i class="fa-solid fa-book-open book-icon"></i> E Notes - A website
				where you can take your notes
			</h1>
			<a class="btn btn-center m-5" href="login.jsp"><i
				class="fa-solid fa-user-check"></i>Login</a> <a
				class="btn btn-center m-5" href="register.jsp"><i
				class="fa-solid fa-user-plus"></i>Register</a>
		</div>
	</div>
	<%@include file="allComponents/footer.jsp"%>
</body>
</html>