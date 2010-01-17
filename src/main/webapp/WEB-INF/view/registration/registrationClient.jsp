<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>
Please Check this field for REGESTRATION CLIENT 
<div id="registrationClient">

				<form:form commandName="clientForm" >
					<table>
						<!--<tr>  method="post" id="registrationClient" modelAttribute="client"action="<c:url value='/login'/>"
							<td><label for="j_username">login</label></td>
							<td><input type="text" name="j_username" required="true" /></td>
						</tr>
						<tr>
							<td><label for="j_password">password</label></td>
							<td><input type="password" required="true" name="j_password" /></td>
						</tr>
						-->
						<tr>
							<td><label for="lastName">lastname</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td><label for="firstName">firstname</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td><label for="middleName">middleName</label></td>
							<td><form:input path="middleName" /></td>
						</tr>
						<tr>
							<td><label for="address">address</label></td>
							<td><form:input path="address" /></td>
						</tr>
						<tr>
							<td><label for="birthday">birthday</label></td>
							<td><form:input path="birthday" /></td>
						</tr>
						<tr>
							<td><label for="email">email</label></td>
							<td><form:input path="email" /></td>
						</tr>
					</table>
					<input type="submit" style="float: left;" value="RegistrationClient" />
				</form:form>
</div>