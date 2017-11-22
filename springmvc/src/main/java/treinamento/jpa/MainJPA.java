package treinamento.jpa;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import treinamento.jpa.configuracao.ConfiguracaoDoBancoJPA;
import treinamento.jpa.entidades.Produto;
import treinamento.jpa.repositorios.ProdutoRepositorio;
import treinamento.jpa.repositorios.ProdutoRepositorio2;

public class MainJPA {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracaoDoBancoJPA.class);
		ProdutoRepositorio repositorio = contexto.getBean(ProdutoRepositorio.class);
				
		System.out.println("..::Spring JDBC ::..");
		repositorio.cadastrar(new Produto("TV4k"));

		List<Produto> produtos = repositorio.listar();
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
		System.out.println("..::JPA Repository::..");
		ProdutoRepositorio2 repositorio2 = contexto.getBean(ProdutoRepositorio2.class);
		System.out.println("Count (com JpaRepository): " + repositorio2.count());
	
		repositorio2.findAll().forEach(System.out::println);
		
		System.out.println("..::findByNome::..");
		repositorio2.findByNome("teclado").forEach(System.out::println);
		
		System.out.println("..::pesquisarPorNome::..");
		repositorio2.pesquisarPorNome("teclado").forEach(System.out::println);
		
		
	}

}
