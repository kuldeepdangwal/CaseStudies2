<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Associate Details</title>
</head>
	<body>
		<div align="center">
			<form id = "getAssociateDetails"  name="getAssociateDetails" action="associateDetails" method="post" onsubmit="associateDetails">
				Associate Id  <input type=text name="associateId">
				<input type="submit" value="Search">
				<input type="reset" value="Reset">
			</form>
		</div>
	</body>
</html>