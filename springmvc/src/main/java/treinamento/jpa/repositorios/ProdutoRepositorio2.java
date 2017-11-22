package treinamento.jpa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import treinamento.jpa.entidades.Produto;

public interface ProdutoRepositorio2 extends JpaRepository<Produto, Long> {

	public List<Produto> findByNome(String nome);
	
	@Query("select p from Produto p where nome like :nome")
	public List<Produto> pesquisarPorNome(@Param("nome") String nome);
	
}
