<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/styles.css">
<meta charset="ISO-8859-1">
<title>Avaliações - Realizadas</title>
</head>
<body>

<ul>
  <li style="float:right"><a class="active" href="index.html">Sair</a></li>
</ul>

<font color="red"> <h2>${mensagem}</h2></font>
	<h2 class="colorblue" align="center">Avaliações realizadas</h2><br><br>
	<table class="table table-striped">
		<tr>
			
			<th scope="col">nome Avaliador</th>
			<th scope="col">nome Avaliado</th>
			<th scope="col">setor</th>
			<th scope="col">feedBack</th>
			<th scope="col">pontuacao</th>
		<tr/>	
		<tr>
		 <c:forEach items="${avaliacao}" var="a" >
		 <tr>
		
		 <td><c:out value="${a.nomeAvaliador}"/></td>
		 <td><c:out value="${a.nomeAvaliado}"/></td>
		 <td><c:out value="${a.setor}"/></td>
		 <td><c:out value="${a.feedBack}"/></td>
		 <td><c:out value="${a.pontuacao}"/></td>
		 </tr>
		 
       
    </c:forEach>
	
	</table>

</body>
</html>