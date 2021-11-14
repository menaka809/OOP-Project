<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	
	<c:forEach var="buy" items="${details}">
	
	<tr>
		<td>Buyer First Name: </td>
		<td>${buy.firstName} </td>
	</tr>	
	<tr>
		<td>Buyer Last Name: </td>
		<td>${buy.lastName} </td>
	</tr>	
	<tr>
		<td>buyer NIC: </td>
		<td>${buy.nic} </td><br>
		
	</tr>	
	<tr>
		<td>Buyer Email: </td>
		<td>${buy.email} </td>
	</tr>	
	<tr>
		<td>Buyer Phone Number: </td>
		<td>${buy.phone} </td>
	</tr>	
	<tr>
		<td>Buyer Address: </td>
		<td>${buy.address} </td>
	</tr>	
	<tr>
		<td>Buyer Postal Code: </td>
		<td>${buy.postalCode} </td>
	</tr>
	

	<%--${buy.password} --%>
	
	
	
	</c:forEach>
	</table>
	<%--<c:url value="BuyerAcc.jsp" var="view">
		<c:param name="nic" value="${nic}"/>
		
	</c:url>
	<a href="${view}">
	</a>--%>
	<%--<form action="ViewProfileServlet" method="post">
	<input type="submit" name="view" value="viewProfile">
	</form>--%>
	
</body>
</html>