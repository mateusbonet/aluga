package br.edu.unoescsmo.aluga.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.aluga.interfaces.ImovelInterface;
import br.edu.unoescsmo.aluga.model.Imovel;
import br.edu.unoescsmo.aluga.repository.ImovelRepository;

@Service
public class ImovelPadrao implements ImovelInterface {

	@Autowired
	private ImovelRepository imovelRepository;

	@Override
	public void salvar(Imovel professor) {
		imovelRepository.save(professor);
	}

	@Override
	public void delete(Imovel professor) {
		imovelRepository.delete(professor);
	}

	@Override
	public List<Imovel> listar() {
		return imovelRepository.findAll();
	}

	@Override
	public Imovel buscarPorCodigo(Long codigo) {
		return imovelRepository.findById(codigo).orElse(new Imovel());
	}

}
