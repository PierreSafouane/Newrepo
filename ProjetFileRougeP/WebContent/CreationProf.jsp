<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
<link rel="stylesheet" type="text/css" href="Prof.css"/>
	
	
</head>
	<body>
	<p>
		<img src="C:\Images\LOGO\unive.png" alt="logo universite"/>
	<p/>
	
		<form action="ControlLogin" method="POST" >
	   
	  
	<br>
	
		  <h2> Service de création de compte </h2>
		 
		  <br>
		  
	<br>
		 
		 <fieldset>
		  <br>
		 <br>
		 <label for=login>Votre Prénom</label>
		 <br>
		 <input type="text" name="nvPrenom">
		 <br>
	
		 <label for=login>Votre Nom</label>
		 <br>
		 <input type="text" name="nvNom">
		 <br>
		 <br>
		 <br>
		 <label for=login>Votre Date de naissance</label>
		 <br>
		 <input type="text" name="nvDdn">
		 <br>
		
		 <label for=login>Votre email</label>
		 <br>
		 <input type="text" name="nvIdentifiant">
		 <br>
		 <br>
		 <br>
		 
		  
		 <label for=mdp>Nouveau mot de passe</label>
		 <br>
		 <input type="password" name="mdpN1" >
		 <br>
	
		  <label for=mdp>Confirmez votre mot de passe</label>
		 <br>
		 <input type="password" name="mdpN2" >
		 <br> 
		 <br>
		 <br>
		 <div class="enter">
		 
		<input id="log" type="submit" value="Let's GO">
		<br>
		<br>
		<input id="log" type="submit" value="retour" name="retour">
		
		 </div> 
		  
		 </fieldset>
		  
		 </form>
		 </body>
		 </html>
		