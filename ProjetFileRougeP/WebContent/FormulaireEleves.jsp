<%@page import="metier.Notes"%>
<%@page import="java.util.Iterator"%> 
<%@page import="java.util.ArrayList"%>   
<%@page import="model.ModelNote"%>
<%@page import="model.ModelListeEleves"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choix</title>
</head>
<body>
<form method="POST" action="ControlerAffichageDeNotes">
			Spécialitée :
			<select name="spec">
				<option value="">Veuillez choisir une spécialitée</option>
				<option value="notes_eleves_civil">Genie Civil</option>
				<option value="notes_eleves_transport">Transport/Logistique</option>
				<option value="notes_eleves_info">Informatique</option>
				<option value="notes_eleves_envi">Environnement</option>
			</select>
			<br>
			Semestre :
			<select name="semestre">
				<option value="">Veuillez choisir un semestre</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
			</select>
			<br>
			<input type="submit" name="recherche">
</form>


	
			

</body>
</html>