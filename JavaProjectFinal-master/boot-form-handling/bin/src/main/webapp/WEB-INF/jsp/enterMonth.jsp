<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<jsp:include page="menu.jsp" />
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<h1 style="color: #FF0045;">Select the month of Workshop</h1>

	<div id="addWorkshop" style="font-size:20px;">
		<form action="/getWorkshopsByMonth" method="post">
			<p>
				<input type="radio" name="month" value="jan"/><label>January</label>
			</p>
			<p>
				<input type="radio" name="month" value="feb"/><label>February</label>
			</p>
			<p>
				<input type="radio" name="month" value="mar"/><label>March</label>
			</p>
			<p>
				<input type="radio" name="month" value="apr"/><label>April</label>
			</p>
			<p>
				<input type="radio" name="month" value="may"/><label>May</label>
			</p>
			<p>
				<input type="radio" name="month" value="jun"/><label>June</label>
			</p>
			<p>
				<input type="radio" name="month" value="jul"/><label>July</label>
			</p>
			<p>
				<input type="radio" name="month" value="aug"/><label>August</label>
			</p>
			<p>
				<input type="radio" name="month" value="sep"/><label>September</label>
			</p>
			<p>
				<input type="radio" name="month" value="oct"/><label>October</label>
			</p>
			<p>
				<input type="radio" name="month" value="nov"/><label>November</label>
			</p>
			<p>
				<input type="radio" name="month" value="dec"/><label>December</label>
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>
</html>