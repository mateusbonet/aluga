package br.edu.unoescsmo.aluga.interfaces;

import java.util.List;

import br.edu.unoescsmo.aluga.model.Cliente;

public interface ClienteInterface {

	void salvar(Cliente aluno);

	void delete(Cliente aluno);

	List<Cliente> listar();
	
	Cliente buscarPorCodigo(Long codigo);

}
