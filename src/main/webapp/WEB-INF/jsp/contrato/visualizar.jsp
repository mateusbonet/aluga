<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Contrato</title>
</head>
<body>
	<form action="/contrato/alterar" method="post">
		
		<input type="hidden" name="codigo" value="${contrato.codigo}"></input>
		
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		
		<a href="/contrato/listar">Cancelar</a>
		<a href="/contrato/deletar/${contrato.codigo}">Deletar</a>
	</form>
</body>
</html>