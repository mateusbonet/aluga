package br.edu.unoescsmo.aluga.interfaces;

import java.util.List;

import br.edu.unoescsmo.aluga.model.Contrato;

public interface ContratoInterface {

	void salvar(Contrato disciplina);

	void delete(Contrato disciplina);

	List<Contrato> listar();
	
	Contrato buscarPorCodigo(Long codigo);

}
