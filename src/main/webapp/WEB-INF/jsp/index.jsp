<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" />
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="/style.css"/>
	<title>Welcome To AfroDev</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section class="landing">
		<div class="dark-overlay">
			<div class="landing-inner">
			<h1 class="x-large">SenorAfricains Developer</h1>
				<p class="lead">
					Create a developer profile, share posts and get help from other developers</p>
				<div class="buttons">
					<a href="/register" class="btn btn-primary">SignUp</a>
					<a href="/loggin"  class="btn btn-light">SignIn</a>
				</div>
			</div>
		</div>
	</section>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>