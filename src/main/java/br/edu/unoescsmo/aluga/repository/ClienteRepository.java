package br.edu.unoescsmo.aluga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.aluga.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
