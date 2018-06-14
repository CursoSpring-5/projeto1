package com.example.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entity.Usuario;
import com.example.jpa.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository ;
	
	public List<Usuario> findAll(){
		
		
		
		return usuarioRepository.findAll();
	}
	
}
