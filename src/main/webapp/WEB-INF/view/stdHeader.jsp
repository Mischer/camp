<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<div id = "registration">
<table width="100%">
	<tr>
		
		<td align="center"><span id="slogan">Приветствуем вас
		<c:if test="${not empty firstName}"> 
		<c:out value="${firstName}" />
		</c:if> на нашем сайте!</span></td>
		
		<td align="right"><a href=<c:url value="/registration/registrationView"/>>Registration</a></td>
		<td align="right"><a href=<c:url value="/registration/registrationClient"/>>RegistrationClient</a></td>
	</tr>
</table>

</div>