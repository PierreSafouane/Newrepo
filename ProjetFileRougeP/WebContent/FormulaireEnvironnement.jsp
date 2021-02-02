<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.ModelNote"%>
<%
	ModelNote model = (ModelNote)request.getAttribute("model");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Université Alvin</title>
<link rel="stylesheet" href="PaccueilCss.css">
</head>

<body>
<header>

	<img src="" alt="" class="image"/>
	<form method='POST' action='ControlerEnvi'>
		<div class="spec">
			<article class="btn1">
				<input class="btnsp" type="submit" value="Genie Civil" name="btnspCivil">
			</article>
			<article class="btn1">
				<input class="btnsp" type="submit" value="Transport/Logistique" name="btnspTransport">
			</article>
			<article class="btn1">
				<input class="btnsp" type="submit" value="Informatique" name="btnspInfo">
			</article>
			<article class="btn1">
				<input class="btnsp" type="submit" value="Environnement" name="btnspEnvi">
			</article>
		</div>
	</form>
</header>
	<div class="center">
	
		<form method="POST" action="ControlerEnvi">
			Nom :
			<input type="text" name="name">
			<br>
			Prénom :
			<input type="text" name="firstname">
			<br>
			Semestre :
			<input type="text" name="semr">
			<br>
			<input type="submit" value="recherche">
		
		<table>
		
		<tr>
			<th class="border">Nom</th>
			<th class="border">Prénom</th>
			<th class="border">Date de naissance</th>
			<th class="border">Semestre</th>
		</tr>
		<tr>
			<th><input type="text" name="nom"></th>
			<th><input type="text" name="prenom"></th>
			<th><input type="text" name="ddn"></th>
			<th><select name="semestre">
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
			</select></th>
		</tr>
		
		</table>
		
		<table>
		
			<tr>
				<th class="border">Matières</th>
				<th class="border">Note examen</th>
				<th class="border">Contrôle continu</th>
				<th class="border">Moyenne matière</th>
				<th class="border">Coefficient</th>
			</tr>
			<tr>
				<th class="border">Français</th>
				<th><input type="number" name ="notexf" class="clair"></th>
				<th><input type="number" name="concf" class="clair"></th>
				<th><input value=<%=model.getNotes().getNmFra() %> disabled></th>
				<th><input type="number" name="coeff" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Mathématiques</th>
				<th><input type="number" name ="notexm" class="sombre"></th>
				<th><input type="number" name="concm" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNmMath() %> disabled></th>
				<th><input type="number" name="coefm" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">Anglais</th>
				<th><input type="number" name ="notexa" class="clair"></th>
				<th><input type="number" name="conca" class="clair"></th>
				<th><input value=<%=model.getNotes().getNmAng() %> disabled></th>
				<th><input type="number" name="coefa" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Sport</th>
				<th><input type="number" name ="notexs" class="sombre"></th>
				<th><input type="number" name="concs" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNmSpo() %> disabled></th>
				<th><input type="number" name="coefs" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">Droit environnemental</th>
				<th><input type="number" name ="notexmat1" class="clair"></th>
				<th><input type="number" name="concmat1" class="clair"></th>
				<th><input value=<%=model.getNotes().getNm1() %> disabled></th>
				<th><input type="number" name="coefmat1" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Économie</th>
				<th><input type="number" name ="notexmat2" class="sombre"></th>
				<th><input type="number" name="concmat2" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNm2() %> disabled></th>
				<th><input type="number" name="coefmat2" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">Sociologie de l'environnement</th>
				<th><input type="number" name ="notexmat3" class="clair"></th>
				<th><input type="number" name="concmat3" class="clair"></th>
				<th><input value=<%=model.getNotes().getNm3() %> disabled></th>
				<th><input type="number" name="coefmat3" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Recyclage</th>
				<th><input type="number" name ="notexmat4" class="sombre"></th>
				<th><input type="number" name="concmat4" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNm4() %> disabled></th>
				<th><input type="number" name="coefmat4" class="sombre"></th>
			</tr>
		
		</table>

		<table>
			<tr>
				<th class="border">Moyenne géneral</th>
				<th><input value=<%=model.getNotes().getNoteg() %> disabled></th>
			</tr>
		</table>
		
		<input type="submit" value="envoyer">
	
		</form>
	</div>
	
	<footer>
	
		<div class="date">
			
		<span id="Lille_z71f" style="font-size:36px"></span>
		
		<script src="//widget.time.is/fr.js"></script>
		
		
		</div>
		
		<a class="faq" href="https://fr.wikipedia.org/wiki/Foire_aux_questions" target="BLANK_">
			Lien vers notre FAQ
		</a>
		
		<div class="copyright">
			pierrenaoualvin corp
		</div>
		
	</footer>

</body>
</html>