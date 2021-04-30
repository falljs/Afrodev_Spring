<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>signed up successfully...</title>
</head>
<body>
	<h3>You have signed up successfully!</h3>
	<span>Prenom:</span><span>${users.prenom}</span>
	<span>Nom:</span><span>${users.nom}</span>
	<span>Username:</span><span>${users.username}</span>
	<span>Email:</span><span>${users.email}</span>
	<span>Password:</span><span>${users.password}</span>
</body>
</html>