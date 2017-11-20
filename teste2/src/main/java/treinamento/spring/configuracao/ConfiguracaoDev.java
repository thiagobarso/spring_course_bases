package treinamento.spring.configuracao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:aplicacao-dev.properties"})
@Profile("dev")
public class ConfiguracaoDev {

}
