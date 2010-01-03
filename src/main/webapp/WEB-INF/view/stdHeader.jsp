<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<div id = "registration">
<form id="registrationForm" method="post" action="<c:url  value="/registration/registrationView" />" >
<table width="100%">
	<tr>
		
		<td align="center"><span id="slogan">Приветствуем вас на нашем сайте!</span></td>
		
		<td align="right"><a href=<c:url value="/registration/registrationView"/>>Registration</a>
	</tr>
</table>
<input type="submit" style="float: right;" value="Registration" />
 </form>
</div>