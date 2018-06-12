package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/*
	 * Criado método para fazer uma busca pelo nome "equivalente no banco ao select
	 * * from usuario where name='xx' / findBy+nome_da_coluna_no_banco_de_dados
	 */
	@Query("select u from Usuario u where u.name LIKE %?1%")
	Usuario findByTeste(String name);
	
	Usuario findByEmail(String email);
	
	Usuario findByNameIgnoreCase(String name);
	
	

}
