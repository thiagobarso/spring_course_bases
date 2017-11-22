package treinamento.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import treinamento.springboot.entidades.Usuario;
import treinamento.springboot.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping
	public List<Usuario> listar() {
		return usuarioRepositorio.findAll();
	}
	
	@PostMapping
	public Usuario cadastrar(@RequestBody Usuario usuario) {
		usuarioRepositorio.save(usuario);
		return usuario;
	}

}
