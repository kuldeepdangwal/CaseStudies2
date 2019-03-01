<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Net Salary</title>
</head>
	<body>
	<h2 align="center">CALCULATE NET SALARY</h2>
		<div align="center">
			<form id = "calculateNetSalary"  name="calculateNetSalary" action="calculate" method="post" onsubmit="calculate">
				Associate Id  <input type=text name="associateId">
				<input type="submit" value="Search">
				<input type="reset" value="Reset">
			</form>
		</div>
	</body>
</html>