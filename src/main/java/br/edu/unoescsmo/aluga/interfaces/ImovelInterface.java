package br.edu.unoescsmo.aluga.interfaces;

import java.util.List;

import br.edu.unoescsmo.aluga.model.Imovel;

public interface ImovelInterface {

	void salvar(Imovel professor);

	void delete(Imovel professor);

	List<Imovel> listar();
	
	Imovel buscarPorCodigo(Long codigo);

}
