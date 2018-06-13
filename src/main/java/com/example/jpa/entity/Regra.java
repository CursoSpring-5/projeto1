package com.example.jpa.entity;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Regra {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	//private Long id;
	private String id;
	private String name;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
