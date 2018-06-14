package com.example.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jpa.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired  // Essa anotação já faz a Injeção de Dependencia não necessitando do construtor abaixo
//	private UsuarioRepository usuarioRepository;
	private UsuarioService usuarioService;
	
/*	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
		
	}
*/	
	@RequestMapping("/usuario")
	public String getUsuarios(Model model) {
		model.addAttribute("usuarioList", this.usuarioService.findAll());
		
		return "usuario";
	}
	
}
