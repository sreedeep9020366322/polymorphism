<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP </title>
</head>
<body>

	<%request.setAttribute("Location", "Gurgaon"); %>
	<% session.setAttribute("userName", "Sreedeep"); %>
	<% application.setAttribute("Mobile", "9020366322"); %>
	
	<div style= "text-align: right;">
		Welcome: <%= session.getAttribute("userName") %>
	</div>
	<div style= "text-align: right;">
		Location: <%= request.getAttribute("Location") %>
	</div>
	<div style= "text-align: right;">
		Mobile: <%= application.getAttribute("Mobile") %>
		
	</div>
	
	New Session := <span style= "color: red"> <%= session.isNew() %></span>
	Session Id := <span style= "color: blue"> <%= session.getId() %></span>

	<a href= "FirstServlet" >Continue</a>
	
</body>
</html>