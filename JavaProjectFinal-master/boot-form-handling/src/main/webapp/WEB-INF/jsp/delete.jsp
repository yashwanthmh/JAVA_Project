<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Workshop</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	
	<h1 style="color: #FF0045;">Delete By Which Workshop Attribute?</h1>
	<div id="addWorkshop" style="font-size:20px;">
		<form action="/Delete" method="post">
			
			<p>
				<input type="radio" name="fieldType" value="workid"/><label>Delete a specific workshop by ID</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="topic"/><label>Delete all workshops with a specific topic</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="venue"/><label>Delete all workshops in a certain venue/college</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="date"/><label>Delete all workshops held on specific date</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="organiser"/><label>Delete all workshops held by a certain organizer</label>
			</p>
			<p>
				<input type="radio" name="fieldType" value="location"/><label>Delete all workshops held at a certain location</label>
			</p>
			<br/><br/>
			<p>Delete workshop with <input type="text" name="field"/> field</p>
			<script>alert.("Are You Sure You Want To Delete? Changes Cannot Be Reverted!!!")</script>
			<input type="SUBMIT" value="Delete!" />
				
		</form>
		
	</div>
</body>
</html>