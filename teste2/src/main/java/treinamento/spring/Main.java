package treinamento.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import treinamento.spring.beans.Mensageria;
import treinamento.spring.configuracao.Configuracao;

public class Main {

	public static void main(String[] args) {

		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		contexto.register(Configuracao.class);
		contexto.refresh();
		
//		OlaMundo ola = contexto.getBean(OlaMundo.class);
//		OlaMundo ola1 = contexto.getBean(OlaMundo.class);
//		System.out.println("É Singleton? " + (ola == ola1));
//		System.out.println(ola.getMensagem());
		
		Mensageria mensageria = contexto.getBean(Mensageria.class);
		mensageria.enviar();
		
		contexto.close();
	}
}