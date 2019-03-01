<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Associate Registration</title>
</head>
<body>
	<script type="text/javascript" src="js/validation.js">
	</script>
	<div align="center"><h2>Registration Page</h2></div>
		<form id = "registrationForm"  name="registrationForm" action="registration" method="post" onsubmit="validateRegistrationForm()">
			<table border="2px" align="center" cellpadding="5" cellspacing="0" bgcolor="skyblue">
			<tr>
					<td>Yearly Investment Under 80C:</td>
					<td><input type="text" name="yearlyInvestmentUnder80c"><br></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName"><br></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName"><br></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="text" name="emailId"><br></td>
				</tr>
				<tr>
					<td>Department:</td>
					<td><input type="text" name="department"><br></td>
				</tr>
				<tr>
					<td>Designation:</td>
					<td><input type="text" name="designation"><br></td>
				</tr>
				<tr>
					<td>PAN Card:</td>
					<td><input type="text" name="panCard"><br></td>
				</tr>
				<tr>
					<td>Basic Salary:</td>
					<td><input type="text" name="basicSalary"><br></td>
				</tr>
				<tr>
					<td>EPF:</td>
					<td><input type="text" name="epf"><br></td>
				</tr>
				<tr>
					<td>Company Epf:</td>
					<td><input type="text" name="companyPf"><br></td>
				</tr>
				<tr>
					<td>Account Number:</td>
					<td><input type="text" name="accountNumber"><br></td>
				</tr>
				<tr>
					<td>Bank Name:</td>
					<td><input type="text" name="bankName"><br></td>
				</tr>
				<tr>
					<td>IFSC Code:</td>
					<td><input type="text" name="ifscCode"><br></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age"><br></td>
				</tr>
				<tr><td align="center" colspan=2>
					<input type="submit" value="Register">
					<input type="reset" value="Clear">
				</td></tr>
			</table>
		</form>
</body>
</html>