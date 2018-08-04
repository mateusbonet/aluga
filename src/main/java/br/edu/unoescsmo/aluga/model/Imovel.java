package br.edu.unoescsmo.aluga.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {

	public Imovel() {

	}

	public Imovel(Long codigo) {
		this.codigo = codigo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column
	private String descricao;

	@Column
	private BigDecimal valor;

	@Column
	private String endereco;

	@Column
	private Long quantidadeAndares;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getQuantidadeAndares() {
		return quantidadeAndares;
	}

	public void setQuantidadeAndares(Long quantidadeAndares) {
		this.quantidadeAndares = quantidadeAndares;
	}

}
