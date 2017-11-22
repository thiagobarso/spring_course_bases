package treinamento.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private long dataCriacao;
	
	@Column
	@LastModifiedDate
	private long UltimaModificacao;
	
	@CreatedBy
	private String criadoPor;
	
	@LastModifiedBy
	private String alteradoPor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto() {
		super();
	}

	public Produto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Produto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", dataCriacao=" + dataCriacao + ", UltimaModificacao="
				+ UltimaModificacao + ", criadoPor=" + criadoPor + ", alteradoPor=" + alteradoPor + "]";
	}

	@PrePersist
	public void preCadastro() {
		System.out.println("INFO::" + this.getClass().getSimpleName());
		System.out.println("Auditando antes de inserir...");
	}

}
