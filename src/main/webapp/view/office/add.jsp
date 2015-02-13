<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add office</title>
</head>
<body>
	<h1>add office:</h1>
	<form action="office" method="post">
		<input type="hidden" name="add"> <input type="hidden"
			name="company_id" value="${company.id}">
		<ul>
			<li>name: <input type="text" name="name"></li>
			<li>street: <input type="text" name="street"></li>
			<li>city: <input type="text" name="city"></li>
			<li>state: <input type="text" name="state"></li>
			<li>zip: <input type="text" name="zip"></li>
		</ul>
		<input type="submit" value="add">
	</form>
	<a href="${company.url}">back to ${company.name}</a>
</body>
</html>