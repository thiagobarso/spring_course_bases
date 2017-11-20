package treinamento.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mensageria {
	
//	@Autowired
//	@Qualifier("x")
	private Fonte origem;
	
	public Mensageria(@Qualifier("x") Fonte origem) {
		this.origem = origem;
	}
	
	public void enviar() {
		System.out.println("Enviando mensagem: " + origem.getTipo());
	}

}
