<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Associate Details</title>
</head>
<body>
	<h2 align="center">ALL ASSOCIATE DETAILS</h2>
	<div>
		<s:forEach var="abc" items="${requestScope.associates}">
		${abc}<br>
		</s:forEach>
	</div>
	<form name="allAssociateDetailsForm" action="allAssociateDetails"
		method="post">
		<input type="submit" value="Submit">
	</form>
</body>
</html>