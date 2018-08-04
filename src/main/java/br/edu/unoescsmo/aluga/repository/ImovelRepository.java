package br.edu.unoescsmo.aluga.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.aluga.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
