package treinamento.spring.configuracao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import treinamento.spring.OlaMundo;

@Configuration
@ComponentScan("treinamento.spring")
//@PropertySource({"classpath:aplicacao.properties"})
@Import({ConfiguracaoDev.class, ConfiguracaoProd.class})
public class Configuracao {
	
	@Autowired
	private Environment environment;
	
	@Value("${spring.mensagem:default}")
	private String mensagemQualquer;
	
	@PostConstruct
	public void init() {
		System.out.println(mensagemQualquer);
		System.out.println(environment.getProperty("spring.mensagem"));

	}
	
	@Bean
	public OlaMundo olaMundo() {
		return new OlaMundo(mensagemQualquer);

	}

}
