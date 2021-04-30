<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"/>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="/style.css"/>
    <title>Bienvenu Dans AfroDev</title>
  </head>
  <body>
    <jsp:include page="HeaderSession.jsp"></jsp:include>
    <section class="container">
      <h1 class="large text-primary">
        Create Your Profile
      </h1>
      <p class="lead"> <i class="fas fa-user"></i> Obtenons quelques informations pour faire ressortir votre profil </p>
      <small><h5>*</h5> = champ obligatoire</small>
      <form:form method="post"  class="form">
        <div class="form-group">
          <form:select path="statu">
            <form:option value="0">* Select Professional Status</form:option>
            <form:option value="Developer">Developer</form:option>
            <form:option value="Junior Developer">Junior Developer</form:option>
            <form:option value="Senior Developer">Senior Developer</form:option>
            <form:option value="Manager">Manager</form:option>
            <form:option value="Student or Learning">Student or Learning</form:option>
            <form:option value="Instructor">Instructor or Teacher</form:option>
            <form:option value="Intern">Intern</form:option>
            <form:option value="Other">Other</form:option>
          </form:select>
          <small class="form-text"
            >Donnez-nous une idée de votre situation dans votre carrière</small
          >
        </div>
        <div class="form-group">
          <form:input path="company" placeholder="Company"/>
          <small class="form-text">Peut-être votre propre entreprise ou celle pour laquelle vous travaillez</small>
        </div>
        <div class="form-group">
          <form:input path="siteWeb" placeholder="Website"/>
          <small class="form-text">Il peut s'agir du vôtre ou du site Web d'une entreprise</small>
        </div>
        <div class="form-group">
          <form:input path="adresse" placeholder="Location"/>
          <small class="form-text">Ville et état suggérés (par exemple, Dakar)</small>
        </div>
        <div class="form-group">
          <form:input path="langage" placeholder="* Skills"/>
          <small class="form-text">Veuillez utiliser des valeurs séparées par des virgules (par exemple, HTML, CSS, JavaScript, PHP)</small>
        </div>
        <div class="form-group">
          <form:input path="gitUser" placeholder="Github Username"/>
          <small class="form-text">Si vous voulez vos derniers dépôts et un lien Github, incluez votre nom d'utilisateur</small>
        </div>
        <div class="form-group">
          <form:textarea path="bio" placeholder="A short bio of yourself"></form:textarea>
          <small class="form-text">Parle-nous un peu de toi</small>
        </div>

        <div class="my-2">
          <form:button class="btn btn-light">
            Ajouter des liens de réseau social
          </form:button>
          <span>Optionnel</span>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-twitter fa-2x"></i>
          <form:input path="twitter" placeholder="Twitter URL"/>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-facebook fa-2x"></i>
          <form:input path="facebook" placeholder="Facebook URL"/>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-youtube fa-2x"></i>
          <form:input path="youtube" placeholder="YouTube URL"/>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-linkedin fa-2x"></i>
          <form:input path="linkedin" placeholder="Linkedin URL"/>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-instagram fa-2x"></i>
          <form:input path="instagram" placeholder="Instagram URL"/>
        </div>
        <form:button class="btn btn-primary my-1">CREATE</form:button><form:button class="btn btn-light my-1" href="/registre">Go Back</form:button>
      </form:form>
    </section>
  </body>
</html>
