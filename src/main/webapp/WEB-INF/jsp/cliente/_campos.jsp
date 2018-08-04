<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Nome</label>
<input type="text" name="nome" id="nome" value="${cliente.nome}"></input>
<form:errors path="cliente.nome"/>
<label for="cpf">CPF</label>
<input type="text" name="cpf" id="cpf" value="${cliente.cpf}"></input>
<form:errors path="cliente.cpf"/>
<label for="endereco">Endereço</label>
<input type="text" name="endereco" id="endereco" value="${cliente.endereco}"></input>
<form:errors path="cliente.endereco"/>
<label for="numero">Número</label>
<input type="number" name="numero" id="numero" value="${cliente.numero}"></input>
<form:errors path="cliente.numero"/>