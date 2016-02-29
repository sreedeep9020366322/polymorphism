<%@ page import= "java.util.*,com.training.entity.*,com.training.domains.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Lists</title>
</head>
<body>

	<%
		HashMap<Long,Book> bookList = (HashMap<Long,Book>)request.getAttribute("BookLists");
	
	%>
	
	<table align= "center" border= "1px solid blue">
		<tr>
			<td>Book Number</td>
			<td>Book Name</td>
			<td>Book Author</td>
			<td>Price</td>
		</tr>
		<%
			//Iterator iterator = bookList.entrySet().iterator();
			Set<Long> set = bookList.keySet();	
		
			for(Long k: set) {
		%>   
				<tr>
					<td> <%= bookList.get(k).getBookNumber() %></td>
					<td> <%= bookList.get(k).getBookName() %> </td>
					<td> <%= bookList.get(k).getAuthor() %></td>
					<td> <%= bookList.get(k).getPrice() %></td>
				</tr>
		<%} %>
	</table>	
</body>
</html>