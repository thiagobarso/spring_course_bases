package treinamento.springmvc.configuracao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("treinamento.springmvc.controller")
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter{
	
	

}
