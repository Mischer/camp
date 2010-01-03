<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
Please Check this field for REGESTRATION 

<div id="registrationClient">

				<form id="registrationClient" method="post" action="<c:url value='/login'/>">
					<table>
						<tr>
							<td><label for="j_username">login</label></td>
							<td><input type="text" name="j_username" required="true" /></td>
						</tr>
						<tr>
							<td><label for="j_password">password</label></td>
							<td><input type="password" required="true" name="j_password" /></td>
						</tr>
						<tr>
							<td><label for="j_lastname">lastname</label></td>
							<td><input type="text" required="true" name="j_lastname" /></td>
						</tr>
						<tr>
							<td><label for="j_firstname">firstname</label></td>
							<td><input type="text" required="true" name="j_firstname" /></td>
						</tr>
						<tr>
							<td><label for="j_middleName">middleName</label></td>
							<td><input type="text" required="true" name="j_middleName" /></td>
						</tr>
						<tr>
							<td><label for="j_address">address</label></td>
							<td><input type="text" required="true" name="j_address" /></td>
						</tr>
						<tr>
							<td><label for="j_birthday">birthday</label></td>
							<td><input type="text" required="true" name="j_birthday" /></td>
						</tr>
						<tr>
							<td><label for="j_email">email</label></td>
							<td><input type="text" required="true" name="j_email" /></td>
						</tr>
						<tr>
							<td><label for="j_phone">phone</label></td>
							<td><input type="text" required="true" name="j_phone" /></td>
						</tr>
						<tr>
							<td><label for="j_fax">fax</label></td>
							<td><input type="text" required="true" name="j_fax" /></td>
						</tr>
					</table>
					<input type="submit" style="float: left;" value="RegistrationClient" />
				</form>
</div>