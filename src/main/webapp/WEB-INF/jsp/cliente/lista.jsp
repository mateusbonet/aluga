<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Clientes</title>
</head>
<body>

	<a href="/cliente/novo">Cadastrar Novo Cliente</a>
	<br>
	<a href="/">Início</a>
	
	<table>
	<thead>
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Endereço</th>
			<th>Número</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${clientes}" var="cliente">
		<tr>
			<td><a href="/cliente/visualizar/${cliente.codigo}">${cliente.codigo}</a></td>
			<td>${cliente.nome}</td>
			<td>${cliente.cpf}</td>
			<td>${cliente.endereco}</td>
			<td>${cliente.numero}</td>
		</tr>
		</c:forEach>
		
	</tbody>	
	</table>
	
</body>
</html>