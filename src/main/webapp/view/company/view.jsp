<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${company.name}</title>
</head>
<body>
	<h1>${company.name}</h1>

<!-- list offices -->
	<a href="${company.url}&edit">edit company</a> |
	<a href="contacts">back to contact list</a>
</body>
</html>