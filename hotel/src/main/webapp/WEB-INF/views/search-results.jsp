<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gray" text="white">
	<h1>
		<font face="Apple Chancery">Hotels in ${ city }</font>
	</h1>

	<c:forEach var="x" items="${ hotels }">
		<p style="color: black">
			<c:out value="${ x.name }"></c:out>
		<p>Price per night: </p><p style="color: blue">$${x.price}</p>
	</c:forEach>
	<br>


	<a href="/">Start a new Search</a>

</body>
</html>