package com.algaworks.algalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	List<Cliente> findByNome(String nome);
	
	List<Cliente> findByNomeContaining(String nome); // Igual ao LIKE do sql, ou seja, buscar por Strings parecidas com o parametro
	
	Optional<Cliente> findByEmail(String email);

}
