package com.example.jpa.entity;

import java.util.Set;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

/* Para mapeamento em bancos relacionais utiliza-se a anotação @Entity 
 * Para mapeamento em banco NoSQL como o Mongo utiliza-se a anotação @Document
 */
//@Entity
@Document
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/* Altera a propriedade de Long para String para usar no MongoDB e também não precisa mais da anotação "ManyToMany"
	private Long id;
	 */
	private String id;
	private String name;
	private String email;

	//@ManyToMany
	private Set<Regra> roles;

	// Criação dos Construtores

	public Usuario() {

	}

	public Usuario(String name, String email) {
		super();
		this.name = name;
		this.email = email;

	}

	// Getters e Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
