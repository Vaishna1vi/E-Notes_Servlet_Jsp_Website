<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.User.UserDetails"%>
<%@include file="cdnFile.jsp" %>
<link rel="stylesheet" href="css/DashStyle.css">

<div class="sidenav">
	<img id="logo"
		style="gap: 10px; border-radius: 100px; margin-left: 60px;" alt=""
		src="https://th.bing.com/th/id/OIG4.H4.vGzSTck6UQ6qG8KtQ?w=100&h=100&rs=1&pid=ImgDetMain">


	<h4 class="text-white mx-5">StudyScribe</h4>

	<a href="Profile.jsp">Profile</a> <a href="dashboard.jsp">Dashboard</a>
	<button class="dropdown-btn">
		Add Notes <i class="fa fa-caret-down"></i>
	</button>
	<div class="dropdown-container">
		<a href="AddNotes.jsp">Text Notes</a> 
	</div>
	<button class="dropdown-btn">
		View Notes <i class="fa fa-caret-down"></i>
	</button>
	<div class="dropdown-container">
		<a href="ViewNotes.jsp">Text Notes</a> 
	</div>
	<button class="dropdown-btn">
		Settings <i class="fa fa-caret-down"></i>
	</button>
	<div class="dropdown-container">
		<a href="editProfile.jsp">Edit Profile</a> <a href="ChangePwd.jsp">Change
			Password</a>
	</div>

	<%
	UserDetails user = (UserDetails) session.getAttribute("currentUser");

	if (user != null) {
	%>
	<h5 class="text-white mx-3 text-bottom mt-5"><%="Welcome "+ user.getName() %></h5>
	<%
	}
	%>

</div>
<script>
	/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
	let dropdown = document.getElementsByClassName("dropdown-btn");
	let i;

	for (i = 0; i < dropdown.length; i++) {
		dropdown[i].addEventListener("click", function() {
			this.classList.toggle("active");
			let dropdownContent = this.nextElementSibling;
			if (dropdownContent.style.display === "block") {
				dropdownContent.style.display = "none";
			} else {
				dropdownContent.style.display = "block";
			}
		});
	}
</script>