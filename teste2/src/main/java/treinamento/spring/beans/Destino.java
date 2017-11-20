package treinamento.spring.beans;

import org.springframework.stereotype.Component;

@Component("y")
public class Destino implements Fonte{

	@Override
	public String getTipo() {
		return Destino.class.getName();
	}

}
