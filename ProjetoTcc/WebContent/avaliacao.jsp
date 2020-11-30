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
<h2 class="colorblue">Digite sua avaliação</h2><br><br>
 <form method = "POST" action="AvaliacaoServlet">
 	 <div class="form group">
           <label for="nameInput">Nome do avaliador:</label>
           <input type="text" class="form-control" name="nomeAvaliador" placeholder="Digite seu nome">
     </div>
     
     <div class="form group">
           <label for="nameInput">Nome do avaliado:</label>
           <input type="text" class="form-control" name="nomeAvaliado" placeholder="Digite o nome de quem voce esta avaliando">
     </div>
     
     <div class="form group">
           <label for="nameInput">Setor:</label>
           <input type="text" class="form-control" name="setor" placeholder="Digite o setor do avaliado">
     </div>
     
     <div class="form-group">
     <label for="exampleFormControlTextarea1">FeedBack</label>
     <textarea class="form-control" name="feedBack" rows="3" placeholder="Digite o feedBack positivo ou negativo do avaliado"></textarea>
     </div>
     
     <div class="form-group">
     <label for="exampleFormControlSelect1">pontuação</label>
     <select class="form-control" name="pontuacao">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
    </div><br><br>
    
       <button type ="submit" class="btn btn-lg btn-block btn-outline-info">Avaliar</button>
    
 
	  
	  
 
 </form>
 </div>
 </div>
 
 
 
 
          
	

</body>
</html>