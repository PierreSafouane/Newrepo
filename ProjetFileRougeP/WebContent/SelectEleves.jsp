<%@page import="metier.Notes"%>
<%@page import="java.util.Iterator"%> 
<%@page import="java.util.ArrayList"%>   
<%@page import="model.ModelNote"%>
<%@page import="model.ModelListeEleves"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%ModelListeEleves eleveRecherche = (ModelListeEleves)request.getAttribute("mole");
	ArrayList <Notes> ArrayNotes = eleveRecherche.getListeEleves();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="ControlerAffichageDeNotes">
<input type="hidden" name="spec" value="<%=eleveRecherche.getSpec() %>">
<select name="choixeleve" id="choixeleve" required>

            <option value="">--Choisir un élève--</option>
<%if (request.getAttribute("mole")!=null){ 
	
	Iterator<Notes> iterator = ArrayNotes.iterator();
	while(iterator.hasNext())  // iterate through all the data until the last record
	{

		Notes no = iterator.next();
%>
  <option name="eleve" value="<%=no.getId()%>"><%=no.getNom()%><%=no.getPrenom()%> ></option> 
<%
	}
 %>
</select>

<br>
 <%}
	%>
	<br>
<input type="submit" name="send" >  
 </form>
</body>

</html>