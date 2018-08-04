<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro De Contrato</title>
</head>
<body>
	<form action="/contrato/salvar" method="post">
		
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		<a href="/contrato/listar">Cancelar</a>
	</form>
</body>
</html>