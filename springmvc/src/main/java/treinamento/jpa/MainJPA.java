package treinamento.jpa;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import treinamento.jpa.configuracao.ConfiguracaoDoBancoJPA;
import treinamento.jpa.entidades.Produto;
import treinamento.jpa.repositorios.ProdutoRepositorio;

public class MainJPA {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracaoDoBancoJPA.class);
		ProdutoRepositorio repositorio = contexto.getBean(ProdutoRepositorio.class);
		
		repositorio.cadastrar(new Produto("TV4k"));

		List<Produto> produtos = repositorio.listar();
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
		
		
	}

}
