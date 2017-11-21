package treinamento.springmvc.filtro;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.web.filter.GenericFilterBean;

@WebFilter(value="/*")
public class FiltroGenerico extends GenericFilterBean{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Meu Filtro Generico");
		chain.doFilter(request, response);		
	}

}
