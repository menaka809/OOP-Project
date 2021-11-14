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
	<c:forEach var="ad" items="${admin}">
	
	<tr>
		<td>Administrator NIC: </td>
		<td>${ad.nic} </td><br>
		
	</tr>	
	
	

	<%--${buy.password} --%>
	
	
	
	</c:forEach>
	</table>

</body>
</html>