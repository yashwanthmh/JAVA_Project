<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Workshops</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<h1 style="color: #FF0045;">Update Workshops</h1>

	<div id="addWorkshop" style="font-size:20px;">
		<form action="/UpdateAll" method="post">
			<p>
				<label>Enter Workshop ID to update</label>
				<input type="text" name="workid" />
			</p><br/><br/>
			<p>Enter New Values</p><br/><br/>
			<p>
				<label>Enter Workshop Topic</label>
				<input type="text" name="topic" />
			</p>
			<p>
				<label>Enter Workshop Venue</label>
				<input type="text" name="venue" />
			</p>
			<p>
				<label>Enter Workshop Date</label>
				<input type="text" name="wsdate" />
			</p>
			<p>
				<label>Enter Registration Fee</label>
				<input type="text" name="regfee" />
			</p>
			<p>
				<label>Enter Workshop Organizer</label>
				<input type="text" name="organiser" />
			</p>
			<p>
				<label>Enter Workshop Location</label>
				<input type="text" name="location" />
			</p>
			<input type="SUBMIT" value="Update!" />
		</form>
	</div>
</body>
</html>