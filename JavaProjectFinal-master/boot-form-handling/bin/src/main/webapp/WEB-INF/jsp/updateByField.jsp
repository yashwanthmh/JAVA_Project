<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Workshops</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<h1 style="color: #FF0045;">Update By Which Workshop Attribute?</h1>

	<div id="addWorkshop" style="font-size:20px;">
		<form action="/UpdateByField" method="post">
			
			<p>
				<input type="radio" name="fieldType" value="topic"/><label>Topic</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="venue"/><label>Venue</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="date"/><label>Date</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="regfee"/><label>Registration Fee</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="organiser"/><label>Organizer</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="location"/><label>Location</label>
			</p>
			<br/><br/>
			<p>Enter ID of Workshop <input type="text" name="workid"/></p>
			<p>New Value Of Attribute Selected <input type="text" name="field"/></p>
			
			<input type="SUBMIT" value="Update!" />
		</form>
	</div>
</body>
</html>