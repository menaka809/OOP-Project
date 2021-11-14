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
	
	<c:forEach var="acc" items="${accountant}">
	
	<tr>
		<td>Accountant First Name: </td>
		<td>${acc.firstName} </td>
	</tr>	
	<tr>
		<td>Accountant Last Name: </td>
		<td>${acc.lastName} </td>
	</tr>	
	<tr>
		<td>Accountant NIC: </td>
		<td>${acc.nic} </td><br>
		
	</tr>	
	<tr>
		<td>Accountant Email: </td>
		<td>${acc.email} </td>
	</tr>	
	
	<%--${buy.password} --%>
	
	
	
	</c:forEach>
	</table>

</body>
</html>