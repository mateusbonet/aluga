<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Contratos</title>
</head>
<body>

	<a href="/contrato/novo">Novo Contrato</a>
	<br>
	<a href="/">Início</a>
	
	<table>
	<thead>
		<tr>
			<th>Código</th>
			<th>Descrição</th>
			<th>Tempo Contrato</th>
			<th>Cliente</th>
			<th>Imóvel</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${contratos}" var="contrato">
		<tr>
			<td><a href="/contrato/visualizar/${contrato.codigo}">${contrato.codigo}</a></td>
			<td>${contrato.descricao}</td>
			<td>${contrato.tempoContrato}</td>
			<td>${contrato.cliente.nome}</td>
			<td>${contrato.imovel.codigo}</td>
		</tr>
		</c:forEach>
		
	</tbody>	
	</table>
	
</body>
</html>