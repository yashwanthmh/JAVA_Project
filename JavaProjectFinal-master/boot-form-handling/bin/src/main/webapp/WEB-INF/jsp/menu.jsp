<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 5px solid #654321;padding: 20px; margin-bottom: 0px;background-image:url('http://i.stack.imgur.com/jGlzr.png');">
	<a href="${pageContext.request.contextPath}/welcome" style="color:yellow;font-size:20px;">Home</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/addWorkshop"style="color:yellow;font-size:20px;">Add Workshop</a> | &nbsp; 
	<a href="${pageContext.request.contextPath}/getWorkshops"style="color:yellow;font-size:20px;">Workshop List</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/UpdateByField"style="color:yellow;font-size:20px;">Update by Field</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/UpdateAll"style="color:yellow;font-size:20px;">Update All</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/Delete"style="color:yellow;font-size:20px;">Delete Workshop</a>
</div>