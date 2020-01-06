<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Querying Workshops</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<h1 style="color: #FF0045;">Search for Workshops by ID</h1>

	<div id="addWorkshop">
		<form action="/getWorkshopsByID" method="post">
			<p style="font-size:20px;font-family:'Times New Roman';">
				<label>Enter Workshop ID : </label>
				<input type="text" name="id" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>
</html>