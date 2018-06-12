package com.example.jpa.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;

	@ManyToMany
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
