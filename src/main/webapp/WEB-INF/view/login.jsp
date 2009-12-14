<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>
<%@ page import="org.springframework.security.ui.AbstractProcessingFilter" %>
<%@ page import="org.springframework.security.ui.webapp.AuthenticationProcessingFilter" %>
<%@ page import="org.springframework.security.AuthenticationException" %>

<html>
	<head>
	</head>
	<body onload="document.f.j_username.focus();">

		<div id="login">
			<a href="#" title="">
				<img style="width: 281px; height: 31px;" src="/images/logo.png" alt="Your Site Name" />
			</a>
			<form id="loginForm" method="post" action="<c:url value='j_spring_security_check'/>">
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
						<td><input type="checkbox" name="_spring_security_remember_me" /></td>
						<td>Don't ask for my password for two weeks</td>
					</tr>
				</table>
				<input type="submit" style="float: left;" value="enter" />
			</form>
		</div>
	</body>
</html>