<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>

Please Check this field for REGESTRATION VIEW 		 

<div id="registrationView">

<form:form commandName="clientForm" method="post" action="registrationView">

	<table>
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
			<tr>
				<td><label for="phone">phone</label></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td><label for="fax">fax</label></td>
				<td><form:input path="fax" /></td>
			</tr>

<tr>
<td>Приветствуем вас
		<c:out value="${clients.firstName}" />
		</br>
		<c:out value="${clients.lastName}" />
</td>
</tr>			
		</table>
	<input type="submit" value="RegistrationClient" />
	
</form:form>
</div>
