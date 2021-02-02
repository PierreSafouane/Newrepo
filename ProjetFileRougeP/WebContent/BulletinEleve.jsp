<%@page import="metier.Notes"%>
<%@page import="model.ModelNote"%>
<%@page import="model.ModelListeEleves"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%
	
	ModelNote eleveNotes = (ModelNote)request.getAttribute("mole");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="PaccueilCss.css">
</head>
<body>
<body>
<form method="POST" action="ControlerAffichageDeNotes">
		
<table>
	<tr>
		<th class="border">Nom</th>
		<th class="border">Prénom</th>
		<th class="border">Semestre</th>
		<th class="border">Moyenne Général</th>
		<th class="border">Moyenne Français</th>
		<th class="border">Moyenne Mathématiques</th>
		<th class="border">Moyenne Anglais</th>
		<th class="border">Moyenne Sport</th>
		<th class="border">Moyenne spé 1</th>
		<th class="border">Moyenne spé 2</th>
		<th class="border">Moyenne spé 3</th>
		<th class="border">Moyenne spé 4</th>
	</tr>
	<tr>
		<th class="cadre"><%=eleveNotes.getNotes().getNom() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getPrenom() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getSemestre() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNoteg() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNmFra() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNmMath() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNmAng() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNmSpo() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNm1() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNm2() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNm3() %></th>
		<th class="cadre"><%=eleveNotes.getNotes().getNm4() %></th>
</table>

<br>
			
		
		
		</form>





 
</body>
</body>
</html>