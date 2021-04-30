<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" />
<link rel="stylesheet" href="css/style.css" />

<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<title>Inscription...</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section class="container">
		<h1 class="large text-primary">S'inscrire</h1>
		<p class="lead">
			<i class="fas fa-user"></i> Créez votre compte
		</p>
		<form:form action="/register" method="POST" modelAttribute="users" class="form">
			<div class="form-group ${status.error ? 'has-error' : ''}">
			 	<form:input type="text" path="prenom" placeholder="PRENOM" autofocus="true"></form:input>
			 		
			 		<form:errors class="text-danger" path="prenom"></form:errors>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<form:input type="text" path="nom" placeholder="NOM"></form:input>
				
			 		<form:errors path="nom"></form:errors>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				 <form:input type="text" path="username" placeholder="Nom d'utilisateur"></form:input>
				 
				 	<form:errors path="username"></form:errors>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				 <form:input type="email" path="email" placeholder="Email Address"></form:input> 
				 
				 	<form:errors path="email"></form:errors>
			</div>
			<%-- <div class="form-group ${status.error ? 'has-error' : ''}">
			    <form:input type="file" placeholder="Photo Profile" name="photo"></form:input> 
			    	<form:errors path="email"></form:errors>
			</div> --%>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				 <form:input type="password" path="password" placeholder="Mot de passe"></form:input>
				 
				 	<form:errors path="password"></form:errors>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				 <form:input type="password" path="passwordConfirm" 
				 placeholder="Confirmez le mot de passe" name="password2"></form:input>
				 
				 	<form:errors path="passwordConfirm"></form:errors>
			</div>
			<div>
				<form:button class="btn btn-primary">REGISTER</form:button>
			</div>
		</form:form>
		<p class="my-1">
			Already have an account? <a href="/loggin">Sign In</a>
		</p>
	</section>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
