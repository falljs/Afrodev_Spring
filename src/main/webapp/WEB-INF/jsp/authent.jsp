<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"/>
    <link rel="stylesheet" href="/style.css" />
    <title>Bienvenu Dans AfroDev</title>
  </head>
  <body>
    <jsp:include page="header.jsp"></jsp:include>
    <section class="container">
      <div class="alert alert-danger">
        Invalid credentials
      </div>
      <h1 class="large text-primary">Sign In</h1>
      <p class="lead"><i class="fas fa-user"></i> Sign into Your Account</p>
      <form:form class="form" action="${contextPath}/login">
      <span>${message}</span>
        <div class="form-group">
          <form:input
            path="email"
            placeholder="Email Address"
            required
          />
        </div>
        <div class="form-group">
          <form:input
            path="password"
            placeholder="Password"
          />
        </div>
        <form:button class="btn btn-primary">LOGIN</form:button>
      </form:form>
      <p class="my-1">
        Don't have an account? <a href="/register">Sign Up</a>
      </p>
    </section>
  </body>
</html>
