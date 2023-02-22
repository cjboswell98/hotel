<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body bgcolor="gray" text="white">
	<form action="/search-form-submit" method="get">
	<h1><font face="Brush Script MT">Hotel Search</font> </h1>
	<select name="city">
		<option>Detroit</option>
		<option>Houston</option>
		<option>Atlanta</option>
		<option>Las Vegas</option>
	</select>
	
	<p>
		<button type="submit">Submit</button>
	</p>
	</form>
</body>
</html>