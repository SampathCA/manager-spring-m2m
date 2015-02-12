<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contacts</title>
</head>
<body>
	<h1>contacts</h1>
	<ul>
		<c:forEach var="contact" items="${contacts}">
			<ul>
				<li><a href="${contact.url}">${contact.name}</a></li>
			</ul>
		</c:forEach>
	</ul>
	<a href="person?add">add a new person</a> |
	<a href="company?add">add a new company</a>
</body>
</html>