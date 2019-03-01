function validateRegistrationForm(){
	if(registrationForm.firstName.value==""){
		alert("Enter first name");
		return false;
	}
	else if(registrationForm.lastName.value==""){
		alert("Enter last name");
		return false;
	}
	else if(registrationForm.accountNumber.value==""){
		alert("Enter Account No:");
		return false;
	}
	else if(registrationForm.password.value.length>=6){
		if((registrationForm.password.value.search(/[0-9]/)!=-1)&&
		(registrationForm.password.value.search(/[A-Z]/)!=-1)&&
		(registrationForm.password.value.search(/[a-z]/)!=-1)&&
		(registrationForm.password.value.search(/[!@#$%^&*+]/)!=-1)){
			return true;
		}
		else{
			alert("Password must contain atleast 1 Number, 1 Uppercase, 1 Lowercase, 1 SpecialChar");
			return false;
		}
	}
	else if(registrationForm.emailId.value.length>=0){
			if((registrationForm.emailId.value.search(/[0-9]/)!=-1)&&
			(registrationForm.emailId.value.search(/[A-Z]/)!=-1)&&
			(registrationForm.emailId.value.search(/[a-z]/)!=-1)&&
			(registrationForm.emailId.value.search(/[@]/)!=-1)){
				return true;
			}
			else{
				alert("Email can contain atleast 1number, 1Uppercase, 1 lowercase, 1 SpecialChar(@)");
				return false;
			}
	}
	else if(registrationForm.department.value.length>=0){
		if((registrationForm.department.value.search(/[A-Z]/)!=-1)&&
		(registrationForm.department.value.search(/[a-z]/)!=-1)){
			return true;
		}
		else{
			alert("Department can only contain Uppercase or Lowercase");
			return false;
		}
	}
	else if(registrationForm.designation.value.length>=0){
		if((registrationForm.designation.value.search(/[A-Z]/)!=-1)&&
		(registrationForm.designation.value.search(/[a-z]/)!=-1)){
			return true;
		}
		else{
			alert("Designation can only contain Uppercase or Lowercase");
			return false;
		}
	}
	else if(registrationForm.pancard.value.length>=0){
		if((registrationForm.emailId.value.search(/[0-9]/)!=-1)&&
			(registrationForm.pancard.value.search(/[A-Z]/)!=-1)&&
			(registrationForm.pancard.value.search(/[a-z]/)!=-1)){
			return true;
		}
		else{
			alert("PAN Card can only contain Uppercase and Numbers");
			return false;
		}
	}
	else if(registrationForm.basicSalary.value.length>=0){
		if((registrationForm.basicSalary.value.search(/[0-9]/)!=-1)){
			return true;
		}
		else{
			alert("BasicSalary can only contain Numbers");
			return false;
		}
	}
	else if(registrationForm.epf.value.length>=0){
		if((registrationForm.epf.value.search(/[0-9]/)!=-1)){
			return true;
		}
		else{
			alert("Epf can only contain Numbers");
			return false;
		}
	}
	else if(registrationForm.companyPf.value.length>=0){
		if((registrationForm.companyPf.value.search(/[0-9]/)!=-1)){
			return true;
		}
		else{
			alert("CompanyPf can only contain Numbers");
			return false;
		}
	}
	else if(registrationForm.accountNumber.value.length>=0){
		if((registrationForm.accountNumber.value.search(/[0-9]/)!=-1)){
			return true;
		}
		else{
			alert("Account Number can only contain Numbers");
			return false;
		}
	}
	else if(registrationForm.bankName.value.length>=0){
		if((registrationForm.bankName.value.search(/[0-9]/)!=-1)){
			return true;
		}
		else{
			alert("Bank Name can only contain Numbers");
			return false;
		}
	}
	
	else if(registrationForm.ifscCode.value.length>=0){
		if((registrationForm.ifscCode.value.search(/[0-9]/)!=-1)&&(registrationForm.ifscCode.value.search(/[A-Z]/)!=-1)){
			return true;
		}
		else{
			alert("Bank Ifsc Code can only contain Numbers & Uppercase");
			return false;
		}
	}
}