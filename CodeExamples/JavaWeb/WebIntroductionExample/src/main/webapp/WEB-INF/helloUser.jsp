<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Hello ${user}</title>
</head>
<body>
	<p>Hello ${user.firstname} ${user.lastname}</p>
	<p>
		<c:if test="${user.lastname == \"\"}">
			You did not supply a last name. Oops!
		</c:if>
		<a href="./">Home</a>
	</p>
</body>
</html>