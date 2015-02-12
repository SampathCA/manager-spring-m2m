<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit company</title>
</head>
<body>
	<h1>Edit company:</h1>
	<form action="company" method="post">
		<input type="hidden" name="edit">
		<input type="hidden" name="id" value="${company.id}">
		<ul>
			<li>name: <input type="text" name="name" value="${company.name}"></li>
		</ul>
		<input type="submit" value="save">
	</form>
	<form action="company" method="post">
		<input type="hidden" name="delete"> <input type="hidden"
			name="id" value="${company.id}"> <input type="submit"
			value="delete">
	</form>
	<a href="contacts">back to contact list</a>
</body>
</html>