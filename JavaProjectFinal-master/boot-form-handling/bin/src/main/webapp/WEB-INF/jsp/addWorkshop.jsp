<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Workshop</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<h2 style="color: cyan;">To Add New Workshop</h2>
	<h2 style="color: orange;">Fill the following details:</h2>
	<div id="addWorkshop" style="font-size:20px;">
		<form:form action="/addWorkshop" method="post"
			modelAttribute="work">
			<p>
				<label>Enter Workshop ID : </label>
				<form:input path="workid" />
			</p>
			<p>
				<label>Enter Workshop Topic : </label>
				<form:input path="topic" />
			</p>
			<p>
				<label>Enter Workshop Venue : </label>
				<form:input path="venue" />
			</p>
			<p>
				<label>Enter Workshop Date : </label>
				<form:input path="date" />
			</p>
			<p>
				<label>Enter Registration Fee : </label>
				<form:input path="reg_fee" />
			</p>
			<p>
				<label>Enter Workshop Organizer : </label>
				<form:input path="organiser" />
			</p>
			<p>
				<label>Enter Workshop Location : </label>
				<form:input path="location" />
			</p>
			<input type="SUBMIT" value="Add Workshop" />
		</form:form>
	</div>
</body>
</html>
