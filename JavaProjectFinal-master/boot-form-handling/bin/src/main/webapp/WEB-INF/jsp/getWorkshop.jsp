<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Workshops List</title>
</head>
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<jsp:include page="menu.jsp" />
	
	   <div style="border: 5px solid #654321;padding: 10px;background-image:url('http://i.stack.imgur.com/jGlzr.png');">
		<a href="${pageContext.request.contextPath}/getWorkshopsByID" style="color:cyan;font-size:20px;">Get Workshops by ID</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByTopic" style="color:cyan;font-size:20px;">Get Workshops by Topic</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByCollege" style="color:cyan;font-size:20px;">Get Workshops by Venue</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByOrganiser" style="color:cyan;font-size:20px;">Get Workshops by Organiser</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByMonth" style="color:cyan;font-size:20px;">Get Workshops by Month</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByYear" style="color:cyan;font-size:20px;">Get Workshops by Year</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByCity" style="color:cyan;font-size:20px;">Get Workshops by Location/City</a><br>
		<a href="${pageContext.request.contextPath}/getWorkshopsByDate" style="color:cyan;font-size:20px;">Get Workshops by Date</a><br>
		</div>
	<i><h1 >Showing All Workshops</h1></i>
	
	<div style="font-size:20px;">
	<ul id="count" style="list-style-type:square;">
		<c:forEach var="listValue" items="${works}">
			<li>
			Workid	 :${listValue.workid}<br>
			Topic	 :${listValue.topic}<br>
			Venue	 :${listValue.venue}<br>
			Date	 :${listValue.date}<br>
			Fee		 :${listValue.reg_fee}<br>
			Organiser:${listValue.organiser}<br>
			Location :${listValue.location}
			</li>
		</c:forEach>
	</ul>
	</div>
</body>
</html>