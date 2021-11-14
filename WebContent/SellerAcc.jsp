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
	<c:forEach var="sell" items="${seller}">
	
	<tr>
		<td>Seller First Name: </td>
		<td>${sell.firstName} </td>
	</tr>	
	<tr>
		<td>Seller Last Name: </td>
		<td>${sell.lastName} </td>
	</tr>	
	<tr>
		<td>Seller NIC: </td>
		<td>${sell.nic} </td><br>
		
	</tr>	
	<tr>
		<td>Seller Email: </td>
		<td>${sell.email} </td>
	</tr>	
	<tr>
		<td>Seller Phone Number: </td>
		<td>${sell.phone} </td>
	</tr>	
	<tr>
		<td>Seller Address: </td>
		<td>${sell.address} </td>
	</tr>	
	<tr>
		<td>Seller Postal Code: </td>
		<td>${sell.postalCode} </td>
	</tr>
	

	<%--${buy.password} --%>
	
	
	
	</c:forEach>
	</table>

</body>
</html>