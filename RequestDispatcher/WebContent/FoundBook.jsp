<%@ page import= "java.util.*,com.training.entity.*,com.training.domains.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Book book = (Book)request.getAttribute("Book");
	
	//	out.println(book.toString());
	%>
	<table align= "center" border= "1px solid blue">
		<tr>
			<td>Book Number</td>
			<td>Book Name</td>
			<td>Book Author</td>
			<td>Price</td>
		</tr>
		<tr>
			<td> <%= book.getBookNumber() %></td>
			<td> <%= book.getBookName() %></td>
			<td> <%= book.getAuthor() %></td>
			<td> <%= book.getPrice() %></td>
		</tr>
	</table>
</body>
</html>