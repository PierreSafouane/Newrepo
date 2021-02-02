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
<title>Universit� Alvin</title>
<link rel="stylesheet" href="PaccueilCss.css">
</head>

<body>
<header>

	<img src="" alt="" class="image"/>
	<form method='POST' action='ControlerCiv'>
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
	
		<form method="POST" action="ControlerCiv">
			Nom :
			<input type="text" name="name">
			<br>
			Pr�nom :
			<input type="text" name="firstname">
			<br>
			Semestre :
			<input type="text" name="semr">
			<br>
			<input type="submit" value="Recherche">
		
		<table>
		
		<tr>
			<th class="border">Nom</th>
			<th class="border">Pr�nom</th>
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
				<th class="border">Mati�res</th>
				<th class="border">Note examen</th>
				<th class="border">Contr�le continu</th>
				<th class="border">Moyenne mati�re</th>
				<th class="border">Coefficient</th>
			</tr>
			<tr>
				<th class="border">Fran�ais</th>
				<th><input type="text" name ="notexf" class="clair"></th>
				<th><input type="text" name="concf" class="clair"></th>
				<th><input value=<%=model.getNotes().getNmFra() %> disabled></th>
				<th><input type="text" name="coeff" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Math�matiques</th>
				<th><input type="text" name ="notexm" class="sombre"></th>
				<th><input type="text" name="concm" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNmMath() %> disabled></th>
				<th><input type="text" name="coefm" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">Anglais</th>
				<th><input type="text" name ="notexa" class="clair"></th>
				<th><input type="text" name="conca" class="clair"></th>
				<th><input value=<%=model.getNotes().getNmAng() %> disabled></th>
				<th><input type="text" name="coefa" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Sport</th>
				<th><input type="text" name ="notexs" class="sombre"></th>
				<th><input type="text" name="concs" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNmSpo() %> disabled></th>
				<th><input type="text" name="coefs" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">R�seaux et fluide</th>
				<th><input type="text" name ="notexmat1" class="clair"></th>
				<th><input type="text" name="concmat1" class="clair"></th>
				<th><input value=<%=model.getNotes().getNm1() %> disabled></th>
				<th><input type="text" name="coefmat1" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Maitrise de l'�nergie</th>
				<th><input type="text" name ="notexmat2" class="sombre"></th>
				<th><input type="text" name="concmat2" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNm2() %> disabled></th>
				<th><input type="text" name="coefmat2" class="sombre"></th>
			</tr>
			<tr>
				<th class="border">G�otechnique</th>
				<th><input type="text" name ="notexmat3" class="clair"></th>
				<th><input type="text" name="concmat3" class="clair"></th>
				<th><input value=<%=model.getNotes().getNm3() %> disabled></th>
				<th><input type="text" name="coefmat3" class="clair"></th>
			</tr>
			<tr>
				<th class="border">Mat�riaux et technologie</th>
				<th><input type="text" name ="notexmat4" class="sombre"></th>
				<th><input type="text" name="concmat4" class="sombre"></th>
				<th><input value=<%=model.getNotes().getNm4() %> disabled></th>
				<th><input type="text" name="coefmat4" class="sombre"></th>
			</tr>
		
		</table>

		<table>
		<tr>
			<th class="border">Moyenne g�neral</th>
			<th><input value=<%=model.getNotes().getNoteg() %> disabled></th>
		</tr>
		</table>
		
		<input type="submit" value="Envoyer">
	
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