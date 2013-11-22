<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Mouse Hunt</title>
	</head>
	<body>
	
	
	<c:out value="I printed this to the page with JSTL." />
	
	
	<%
		// out is an implicit object we have access to
		// JspWriter -- writes to the resulting 
		// response page
		
		out.println("I printed this to the "+
				"page from a scriptlet.");
	
	%>

	<!-- To get a request parameter, use param -->
	The value of the tomcat param is: ${ param.tomcat }
	
	<br/>
	
	
	<!-- The request implicit object
			HttpServletRequest -->

	<%=  request.getAttribute("randomtom")  %>
	
	<br/><br/><br/>
	
	This is the randomtom attribute: 
		
	${ requestScope.randomtom }
	
	<br/><br/><br/>
	When we're dealing with attributes, <br/>
	the scope does not need to be specified<br/>
	but should be.
	
	${ randomjerry }
	

	<br/><br/><br/>
	
	${ requestScope.lunchPizza["type"] }
	
	${ requestScope.lunchPizza["typeOfCrust"] }
	
	
	<br/><br/><br/>
	
	<!--  The ServletContext object -->
	
	<%= "Problem? Email "+
		application.getInitParameter("admin_email") %><br/>
	
	${ initParam["admin_email"] } <br/>
		
	${ initParam.admin_email }<br/>
	
	
	
	
	
		
	<form action="more" method="post">
		<input type="submit" value="Keep Going" />
	</form>	
		
	</body>
</html>