package br.edu.unoescsmo.aluga.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.aluga.interfaces.ClienteInterface;
import br.edu.unoescsmo.aluga.model.Cliente;
import br.edu.unoescsmo.aluga.repository.ClienteRepository;

@Service
public class ClientePadrao implements ClienteInterface {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void salvar(Cliente aluno) {
		clienteRepository.save(aluno);
	}

	@Override
	public void delete(Cliente aluno) {
		clienteRepository.delete(aluno);
	}

	@Override
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorCodigo(Long codigo) {
		return clienteRepository.findById(codigo).orElse(new Cliente());
	}

}
