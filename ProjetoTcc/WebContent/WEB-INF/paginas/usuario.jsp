<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/styles.css">
<meta charset="ISO-8859-1">
<title>Cadastro de usuarios</title>
</head>
<body>
<ul>
  <li style="float:right"><a class="active" href="index.html">Sair</a></li>
</ul>

<div class="corpo">
<div class="col-md-4">
<h2 class="colorblue">Cadastro de usuarios</h2><br><br>
 <form method = "POST" action="UsuarioServlet">
 
	  
	    <div class="form group">
                  <label for="nameInput">Nome:</label>
                  <input type="text" class="form-control" name="nome" placeholder="Digite seu nome">
        </div>
         <div class="form group">
                  <label for="nameInput">Cpf:</label>
                  <input type="number" class="form-control" name="cpf" placeholder="Digite seu cpf">
        </div>
         <div class="form group">
                  <label for="nameInput">Telefone:</label>
                  <input type="number" class="form-control" nmae="telefone" placeholder="Digite seu telefone">
        </div>
        <div class="form group">
                  <label for="nameInput">Data de nascimento:</label>
                  <input type="text" class="form-control" name="dataNascimento" placeholder="Digite sua data de nascimento">
        </div>
        <div class="form group">
                  <label for="emailInput">Email:</label>
                  <input type="email" class="form-control" name="email" placeholder="Digite seu email">
        </div>
        <div class="form group">
                <label for="pass">Senha:</label>
                <input type="password" class="form-control" name="senha" placeholder="Digite sua senha" minlength="8" required="">
          </div><br>
          
          <button type ="submit" class="btn btn-lg btn-block btn-outline-info">Cadastrar</button>
	  
 
 </form>
 </div>
 </div>
 
 
          <font color="red"> <h2>${mensagem}</h2></font>
	<h4>usuarios cadastrado</h4>
	<table border="1">
		<tr>
			<th>idUsuario</th>
			<th>nome</th>
			<th>cpf</th>
			<th>telefone</th>
			<th>dataNascimento</th>
			<th>email</th>
			<th>senha</th>
		<tr/>	
		<tr>
		 <c:forEach var="u" items="${usuario}">
		 <tr>
		 <td>${u.idUsuario}</td>
		 <td>${u.nome}</td>
		 <td>${u.cpf}</td>
		 <td>${u.telefone}</td>
		 <td>${u.dataNascimento}</td>
		 <td>${u.email}</td>
		 <td>${u.senha}</td>
		 </tr>
		 
       
    </c:forEach>
	
	</table>
          
	

</body>
</html>