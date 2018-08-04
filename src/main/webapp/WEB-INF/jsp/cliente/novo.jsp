<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Cliente</title>
</head>
<body>
	<form action="/cliente/salvar" method="post">
		
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		<a href="/cliente/listar">Cancelar</a>
	</form>
</body>
</html>