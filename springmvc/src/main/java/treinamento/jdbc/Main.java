package treinamento.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import treinamento.jdbc.configuracao.ConfiguracaoDoBanco;
import treinamento.jdbc.repositorio.UsuarioDAO;
import treinamento.springmvc.entidade.Usuario;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracaoDoBanco.class);
		UsuarioDAO usuarioDao = contexto.getBean(UsuarioDAO.class);
		List<Usuario> listar = usuarioDao.listar();
		for (Usuario usuario : listar) {
			System.out.println(usuario);
		}
	}

}
