<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.fdmgroup.servlets.User,java.util.List;" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Here is my List of Users</title>
	</head>
	<body>
	
	<!-- Copies contents of included file
		Pastes it here -->
	<%@ include file="header.jsp" %>
	
	<!-- Inserts the RESPONSE of header.jsp -->
	<jsp:include page="header.jsp" />
	
	<!--  Also check out the JSTL tag "c:import" -->
	
	<c:forEach var="u" items="${requestScope.myList}">
   		<p> ${u.username}'s password is ${u.password}! Hacked!</p>
	</c:forEach> 
	</body>
</html>