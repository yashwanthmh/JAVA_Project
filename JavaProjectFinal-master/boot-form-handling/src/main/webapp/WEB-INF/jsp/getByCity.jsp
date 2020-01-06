<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Showing Workshops</title>
</head>
<body style="background-image:url('https://freefrontend.com/assets/img/css-background-patterns/css-dot-pattern-grid-background.png');">
	<jsp:include page="menu.jsp" />
	      
	<h1 style="color: #FF0045;">The Workshop with specified Location/City are</h1>
	<div style="font-size:20px;font-family:'Times New Roman';">
	<ul style="list-style-type:square;">
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