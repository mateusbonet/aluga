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

import br.edu.unoescsmo.aluga.model.Imovel;
import br.edu.unoescsmo.aluga.regras.ImovelPadrao;
import br.edu.unoescsmo.aluga.repository.ImovelRepository;

@Controller
@RequestMapping("/imovel")
public class ImovelController {

	@Autowired
	private ImovelPadrao imovelPadrao;
	
	@Autowired
	private ImovelRepository imovelRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Imovel imovel, BindingResult erros) {

		if (erros.hasErrors()) {
			return "imovel/novo";
		}

		imovelPadrao.salvar(imovel);
		return "redirect:/imovel/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Imovel imovel, BindingResult erros) {

		if (erros.hasErrors()) {
			return "imovel/visualizar";
		}

		imovelPadrao.salvar(imovel);
		return "redirect:/imovel/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("imoveis", imovelPadrao.listar());

		return "imovel/lista";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		imovelPadrao.delete(new Imovel(codigo));
		return "redirect:/imovel/listar";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("imoveis", imovelRepository.findAll());
		return "imovel/novo";
	}
	
	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("imovel", imovelPadrao.buscarPorCodigo(codigo));
		return "imovel/visualizar";
	}
}
