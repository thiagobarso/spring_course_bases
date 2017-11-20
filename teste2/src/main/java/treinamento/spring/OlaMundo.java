package treinamento.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OlaMundo {
	
	private String mensagem = "Olá";
	
	public OlaMundo(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	public OlaMundo() {
	
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Inicializado o bean");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Destruindo o bean");
	}

}
