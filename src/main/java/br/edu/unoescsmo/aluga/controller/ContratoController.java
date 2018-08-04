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

import br.edu.unoescsmo.aluga.model.Contrato;
import br.edu.unoescsmo.aluga.regras.ContratoPadrao;
import br.edu.unoescsmo.aluga.repository.ClienteRepository;
import br.edu.unoescsmo.aluga.repository.ImovelRepository;

@Controller
@RequestMapping("/contrato")
public class ContratoController {

	@Autowired
	private ContratoPadrao contratoPadrao;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ImovelRepository imovelRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Contrato contrato, BindingResult erros) {

		if (erros.hasErrors()) {
			return "contrato/novo";
		}

		contratoPadrao.salvar(contrato);
		return "redirect:/contrato/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Contrato contrato, BindingResult erros) {

		if (erros.hasErrors()) {
			return "contrato/visualizar";
		}

		contratoPadrao.salvar(contrato);
		return "redirect:/contrato/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {

		// Torna a lista de pessoa acessivel no JSP
		model.addAttribute("contratos", contratoPadrao.listar());

		// Caminho + nome do jsp que será renderizado para a tela
		return "contrato/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		contratoPadrao.delete(new Contrato(codigo));
		return "redirect:/contrato/listar";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("clientes", clienteRepository.findAll());
		model.addAttribute("imoveis", imovelRepository.findAll());
		return "contrato/novo";
	}
	
	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("contrato", contratoPadrao.buscarPorCodigo(codigo));
		model.addAttribute("clientes", clienteRepository.findAll());
		model.addAttribute("imoveis", imovelRepository.findAll());
		return "contrato/visualizar";
	}

}
