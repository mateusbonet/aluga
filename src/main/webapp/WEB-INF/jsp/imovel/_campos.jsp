<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="descricao">Descri��o</label>
<input type="text" name="descricao" id="descricao" value="${imovel.descricao}"></input>
<form:errors path="imovel.descricao"/>

<label for="endereco">Enrede�o</label>
<input type="text" id="endereco" name="endereco"></input>
<form:errors path="imovel.endereco"/>

<label for="quantidadeAndares">Quantidade de Andares</label>
<input type="number" id="quantidadeAndares" name="quantidadeAndares"></input>
<form:errors path="imovel.quantidadeAndares"/>

<label for="valor">Valor</label>
<input type="text" id="valor" name="valor"></input>
<form:errors path="imovel.valor"/>