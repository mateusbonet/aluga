package br.edu.unoescsmo.aluga.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.aluga.interfaces.ContratoInterface;
import br.edu.unoescsmo.aluga.model.Contrato;
import br.edu.unoescsmo.aluga.repository.ContratoRepository;

@Service
public class ContratoPadrao implements ContratoInterface {

	@Autowired
	private ContratoRepository contratoRepository;

	@Override
	public void salvar(Contrato pessoa) {
		contratoRepository.save(pessoa);
	}

	@Override
	public void delete(Contrato pessoa) {
		contratoRepository.delete(pessoa);
	}

	@Override
	public List<Contrato> listar() {
		return contratoRepository.findAll();
	}

	@Override
	public Contrato buscarPorCodigo(Long codigo) {
		return contratoRepository.findById(codigo).orElse(new Contrato());
	}
}
