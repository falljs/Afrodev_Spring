<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"/>
    <link rel="stylesheet" href="/style.css"/>
    <title>Bienvenu Dans AfroDev</title>
</head>
  <body>
	 <nav class="navbar bg-dark">
	      <h1>
		      <a href="/">
		      <i class="fas fa-code"></i><img alt="" src="img/logo.png" style="width: 16%; height: 16%">
		      </a>
		      <!--   <a href="/profilesSession"><i class="fas fa-code"></i>AfroDev</a> -->
	      </h1>
	      <ul>
	        <li><a href="/profiles">Developer</a></li>
	        <li><a href="/post">Posts</a></li>
	        <li>
	          <a href="/dashboard" title="Dashboard">
	          <i class="fas fa-user"></i>
	          <span class="hide-sm">Dashboard</span></a>
	        </li>
	        <li>
	          <a href="/loggin" title="Déconnexion">
	          <i class="fas fa-sign-out-alt"></i>
	          <span class="hide-sm">Logout</span></a
	          >
	        </li>
	      </ul>
	    </nav>
</body>
</html>