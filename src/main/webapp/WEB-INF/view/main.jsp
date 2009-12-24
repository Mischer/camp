<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
	<title><tiles:getAsString name="title" /></title>
</head>
<body>
<div id="header">
	<div id="headerTitle"><tiles:insertAttribute name="header" /></div>
</div>
<div id="menu">
<tiles:insertAttribute name="menu" />
</body>
<div>
<div id="body">
<tiles:insertAttribute name="body" />
</div>
<div id="footer">
<tiles:insertAttribute name="footer" />
</div>
</html>