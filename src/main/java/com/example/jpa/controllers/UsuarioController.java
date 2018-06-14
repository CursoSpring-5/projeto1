package com.example.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jpa.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	private UsuarioRepository usuarioRepository;
	
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
		
	}
	
	@RequestMapping("/usuario")
	public String getUsuarios(Model model) {
		model.addAttribute("usuarioList", this.usuarioRepository.findAll());
		
		return "usuario";
	}
	
}
