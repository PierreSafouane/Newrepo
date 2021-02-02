<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title> Authentification </title>

<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>

<p>
<img src="D:\JEE\Images\Logo.PNG" alt="logo universite"/>
<p/>

<form action="ControlLogin" method="POST" >
   
  
<br>

	  <h2> Service d'Authentification </h2>
	  <br>
<br>
	 
	 <fieldset>
	  <br>
	 <br>
	 <label for=login>Identifiant</label>
	 <br>
	 <input type="text" name="Identifiant">
	  
	 <br>
	 <br>
	 <br>
	 
	  
	 <label for=mdp>Mot de passe</label>
	 <br>
	 <input type="password" name="mdp" >
	  
	 <br> 
	 <br>
	 <br>
	 <div class="enter">
	 
	<input id="log" type="submit" value="Login" name="entree">
	<input id="log" type="submit" value="Creation Prof" name="inscription">
	
	 </div> 
	  
	 </fieldset>
	  
	 </form>
	 </body>
	 </html>
	 


