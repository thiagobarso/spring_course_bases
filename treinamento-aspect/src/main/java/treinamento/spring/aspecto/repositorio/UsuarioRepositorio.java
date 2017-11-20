package treinamento.spring.aspecto.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import treinamento.spring.aspecto.entidades.Usuario;

@Component
public class UsuarioRepositorio {

	public List<Usuario> listar(){
		return Arrays.asList(new Usuario(1l,"admin"));
	}
}
