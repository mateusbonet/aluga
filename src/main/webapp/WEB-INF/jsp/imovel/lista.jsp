<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Imoveis</title>
</head>
<body>

	<a href="/imovel/novo">Novo Imovel</a>
	<br>
	<a href="/">Início</a>
	
	<table>
	<thead>
		<tr>
			<th>Código</th>
			<th>Descrição</th>
			<th>Endereço</th>
			<th>Quantidade Andares</th>
			<th>Valor</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${imoveis}" var="imovel">
		<tr>
			<td><a href="/imovel/visualizar/${imovel.codigo}">${imovel.codigo}</a></td>
			<td>${imovel.descricao}</td>
			<td>${imovel.endereco}</td>
			<td>${imovel.quantidadeAndares}</td>
			<td>${imovel.valor}</td>
		</tr>
		</c:forEach>
		
	</tbody>	
	</table>
	
</body>
</html>