package treinamento.springmvc.entidade;

import org.hibernate.validator.constraints.NotEmpty;

public class Usuario {
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + "]";
	}

	private Long id;
	
	@NotEmpty
	private String login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Usuario(Long id, String login) {
		super();
		this.id = id;
		this.login = login;
	}

	public Usuario() {
		super();
	}
	
}
