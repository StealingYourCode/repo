<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page Ever</title>
</head>
<body>
	hello
	<br />
	<br />
	Hi ${ param.user_name }! <br/>

	You are holding a cup of ${ coffee }. <br/>
	<br/>

	Trainee ${ currentTrainee.name } is registered for stream  ${ currentTrainee.stream }. <br/>

	
	<core:forEach var="day" items="${ gym_days }">
		<core:out value="${day}" />
	</core:forEach>
	<br/><br/>
	Your admin is ${ applicationScope.admin.name }.
	
	
</body>
</html>