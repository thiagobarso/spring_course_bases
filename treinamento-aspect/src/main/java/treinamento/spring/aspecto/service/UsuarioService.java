package treinamento.spring.aspecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import treinamento.spring.aspecto.entidades.Usuario;
import treinamento.spring.aspecto.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public List<Usuario> listar(){
		return usuarioRepositorio.listar();
	}

}
