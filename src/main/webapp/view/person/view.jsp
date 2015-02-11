<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${person.name}</title>
</head>
<body>
	<h1>${person.name}</h1>

	<ul>
		<li>${person.address.street}</li>
		<li>${person.address.city},${person.address.state},${person.address.zip}</li>
	</ul>
	<a href="person?edit&id=${person.id}">edit person</a> |
	<a href="contacts">back to contact list</a>
</body>
</html>