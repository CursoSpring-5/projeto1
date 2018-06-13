package com.example.jpa.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.jpa.entity.Usuario;
import com.example.jpa.repository.UsuarioRepository;

@Component
public class DataInitillizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<Usuario> usuarios = usuarioRepository.findAll();

		if (usuarios.isEmpty()) {

			/*
			 * Criado o métod abaixo para criar o usuário e melhorar o código abaixo Usuario
			 * usuario = new Usuario();
			 * 
			 * usuario.setEmail("teste@yahoo.com.br"); usuario.setName("Teste Inicial");
			 * usuarioRepository.save(usuario);
			 */
			createUsuario("Carla", "prod@yahho.com.br");
			createUsuario("Joao", "joao@gmail.com.br");
			createUsuario("Maria", "maria@teste.com.br");

		}

		/*
		 * Pega um registro especifico pelo ID , no caso ID 2 Imprimi o registro Deleta
		 * o registro
		 *
		 * Usuario usuario = usuarioRepository.getOne(2L);
		 * System.out.println(usuario.getName());
		 * usuarioRepository.deleteById(2l);
		 */
		Usuario usuario = usuarioRepository.findByNameIgnoreCaseLike("tt");
		usuario = usuarioRepository.findByEmailcustomizado("prod@yahho.com.br");
		System.out.println(usuario.getName());
		System.out.println(usuario.getEmail());

	}

	public void createUsuario(String name, String email) {

		Usuario user = new Usuario(name, email);
		usuarioRepository.save(user);

	}

}
