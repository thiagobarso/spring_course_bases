package treinamento.spring.beans;

import org.springframework.stereotype.Component;

@Component("x")
public class Origem implements Fonte{

	@Override
	public String getTipo() {
		return Origem.class.getName(); 
	}

}
