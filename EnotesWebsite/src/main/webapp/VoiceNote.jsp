<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
UserDetails user1 = (UserDetails) session.getAttribute("currentUser");
if (user1 == null) {
	response.sendRedirect("Login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Voice-Notes</title>
<style>
body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
            overflow-x: hidden;
        }



.notes-container {
	        max-width: 800px;
            margin: 50px auto;
            margin-left: 30%;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            justify-content: center;
            margin-top: 100px;
            margin-bottom: 50px;
        }
</style>
<%@include file="allComponents/cdnFile.jsp"%>
</head>
<body style="background: #E9C46A;">
	<%@include file="allComponents/SideNav.jsp"%>
	<%@include file="allComponents/homeNav.jsp"%>
	<div class="notes-container">
	<h1 class="text-center mb-4">Add your voice notes</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<form action="VoiceNoteServlet" method="post">
					<div class="form-group mb-3">

						<%
						UserDetails cuser = (UserDetails) session.getAttribute("currentUser");
						if (cuser != null) {
						%>
						<input type="hidden" name="useremail"
							value="<%=cuser.getEmail()%>" />
						<%
						}
						%>

						<label for="exampleInputEmail1" class="text-left font-weight-bold">Note Title:</label> <input
							type="text" class="form-control mt-2" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter title"
							name="title" required="required">
					</div>
					<div class="form-group mb-3">
						<label for="exampleInputEmail1">Record your notes with your voice</label> <br>
						
					</div>
					<div class="form-group mb-3 text-center">
					<button class="btn btn-primary text-center  m-3" id="startRecording">Start Recording</button>
						<button class="btn btn-danger text-center m-3" id="stopRecording">Stop Recording</button>
					</div>
					<div class="container text-center">
						<button type="submit" class="btn btn-primary">Add</button>
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
	<script>
    const startRecordingButton = document.getElementById('startRecording');
    const stopRecordingButton = document.getElementById('stopRecording'); // Add this line

    let mediaRecorder;
    let chunks = [];

    async function startRecording() {
        const stream = await navigator.mediaDevices.getUserMedia({ audio: true });
        mediaRecorder = new MediaRecorder(stream);

        mediaRecorder.ondataavailable = (event) => {
            chunks.push(event.data);
        };

        mediaRecorder.onstop = () => {
            const audioBlob = new Blob(chunks, { type: 'audio/wav' });
            // Save the audioBlob to your server or perform any other action
        };

        mediaRecorder.start();
        startRecordingButton.textContent = 'Recording...';
    }

    function stopRecording() {
        mediaRecorder.stop();
        startRecordingButton.textContent = 'Start Recording'; // Reset the button text
    }

    startRecordingButton.addEventListener('click', startRecording);
    stopRecordingButton.addEventListener('click', stopRecording); // Add this line
</script>
	
	
</body>
</html>