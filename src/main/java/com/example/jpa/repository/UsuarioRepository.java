package com.example.jpa.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.example.jpa.entity.Usuario;

//public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
  public interface UsuarioRepository extends MongoRepository<Usuario, Long>{
	/*
	 * Criado método para fazer uma busca pelo nome "equivalente no banco ao select
	 * * from usuario where name='xx' / findBy+nome_da_coluna_no_banco_de_dados
	 */
//	@Query("select u from Usuario u where u.name LIKE %?1%") - esse para JPA
//	Usuario findByName(String name);
	@Query("{ 'email' : ?0 }")
	Usuario findByEmailcustomizado(String email);  
//	Usuario findByEmail(String email);
	
	Usuario findByNameIgnoreCaseLike(String name);
	
	

}
