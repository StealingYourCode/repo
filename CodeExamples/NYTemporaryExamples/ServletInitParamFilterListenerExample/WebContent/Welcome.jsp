<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Second Page!</title>
	</head>
	<body>
		<%			
		  String permission = request.getAttribute("Permissions").toString();
		  String user = request.getParameter("Username");		
		%> 	
	
		Hello! <br />

		Welcome <%= user %> ! <br />
		Your permissions are: <%= permission %> <br/>
	
	
	<c:if test="${ param.Username == 'Tiger'}">
		<c:out value="Hi Tiger!" /> <br/>
	</c:if>
	

		
	</body>
</html>