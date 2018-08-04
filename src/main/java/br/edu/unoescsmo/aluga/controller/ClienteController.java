package br.edu.unoescsmo.aluga.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.aluga.model.Cliente;
import br.edu.unoescsmo.aluga.regras.ClientePadrao;
import br.edu.unoescsmo.aluga.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClientePadrao clientePadrao;

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Cliente cliente, BindingResult erros) {

		if (erros.hasErrors()) {
			return "cliente/novo";
		}

		clientePadrao.salvar(cliente);
		return "redirect:/cliente/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Cliente cliente, BindingResult erros) {

		if (erros.hasErrors()) {
			return "cliente/visualizar";
		}

		clientePadrao.salvar(cliente);
		return "redirect:/cliente/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {

		// Torna a lista de pessoa acessivel no JSP
		model.addAttribute("clientes", clientePadrao.listar());

		// Caminho + nome do jsp que será renderizado para a tela
		return "cliente/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		clientePadrao.delete(new Cliente(codigo));
		return "redirect:/cliente/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("clientes", clienteRepository.findAll());
		return "cliente/novo";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("cliente", clientePadrao.buscarPorCodigo(codigo));
		return "cliente/visualizar";
	}

}
