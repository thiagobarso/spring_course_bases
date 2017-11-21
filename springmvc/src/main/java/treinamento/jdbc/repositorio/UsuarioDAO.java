package treinamento.jdbc.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import treinamento.springmvc.entidade.Usuario;

@Component
public class UsuarioDAO {

	@Autowired
	private NamedParameterJdbcTemplate jdbctemplate;

	public List<Usuario> listar() {
		String sql = "select * from usuario";
		BeanPropertyRowMapper rse = new BeanPropertyRowMapper(Usuario.class);
		List query = jdbctemplate.query(sql, rse);
		return query;
	}

}
