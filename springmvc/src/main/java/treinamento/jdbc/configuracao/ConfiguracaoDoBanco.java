package treinamento.jdbc.configuracao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan("treinamento.jdbc")
public class ConfiguracaoDoBanco {

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("inicio.sql").build();
	}
	
	@Bean
	public NamedParameterJdbcTemplate jdbcTemplate() {
		return new NamedParameterJdbcTemplate(dataSource());

	}
}
