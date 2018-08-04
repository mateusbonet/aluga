<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Descrição</label>
<input type="text" name="descricao" id="descricao" value="${contrato.descricao}"></input>
<form:errors path="contrato.descricao"/>
<label for="tempoContrato">Tempo Contrato</label>
<input type="number" name="tempoContrato" id="tempoContrato" value="${contrato.tempoContrato}"></input>
<form:errors path="contrato.tempoContrato"/>

<label for="cliente">Cliente</label>
<select id="cliente" name="cliente.codigo">

<option></option>

<c:forEach items="${clientes}" var="cliente">

	<c:set var="selecionado" value=""></c:set>

	<c:if test="${cliente.codigo eq contrato.cliente.codigo}">
		<c:set var="selecionado" value="selected"></c:set>
	</c:if>

	<option value="${cliente.codigo}" ${selecionado}>${cliente.nome}</option>

</c:forEach>
</select>

<label for="imovel">Imóvel</label>
<select id="imovel" name="imovel.codigo">

<option></option>

<c:forEach items="${imoveis}" var="imovel">

	<c:set var="selecionado" value=""></c:set>

	<c:if test="${imovel.codigo eq contrato.imovel.codigo}">
		<c:set var="selecionado" value="selected"></c:set>
	</c:if>

	<option value="${imovel.codigo}" ${selecionado}>${imovel.descricao}</option>

</c:forEach>
</select>