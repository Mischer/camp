package org.jobs.ws.validation.Client;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jobs.persistence.bean.Client;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class RegistrationValidation {
	
	public void validate(Client client, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firstName", "FIRSTNAME_REQUIRED", "Firstname is required.");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "LASTNAME_REQUIRED", "LastName is required.");
		ValidationUtils.rejectIfEmpty(errors, "middleName", "MIDDLENAME_REQUIRED", "MiddleName is required.");
		ValidationUtils.rejectIfEmpty(errors, "address", "ADRESS_REQUIRED", "Adress is required.");
		ValidationUtils.rejectIfEmpty(errors, "birthday", "BIRTHDAY_REQUIRED", "Birthday is required.");
		ValidationUtils.rejectIfEmpty(errors, "email", "EMAIL_REQUIRED", "Email is required.");
		ValidationUtils.rejectIfEmpty(errors, "phone", "PHONE_REQUIRED", "Phone is required.");
		ValidationUtils.rejectIfEmpty(errors, "fax", "FAX_REQUIRED", "Fax is required.");
	}
}
