package treinamento.jpa.repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import treinamento.jpa.entidades.Produto;

@Repository
@Transactional
public class ProdutoRepositorio {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<Produto> listar() {
		return entityManager.createQuery("SELECT p from Produto p").getResultList();
	}
	
	public void cadastrar(Produto produto) {
		entityManager.persist(produto);
	}

}
