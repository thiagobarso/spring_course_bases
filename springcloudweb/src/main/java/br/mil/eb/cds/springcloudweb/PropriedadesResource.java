package br.mil.eb.cds.springcloudweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PropriedadesResource {

	@Value("${configuracao.nome}")
	private String nome;
	
	@Value("${configuracao.preco}")
	private Long preco;
	
	
	@GetMapping("/propriedades")
	public String propriedades() {
		return String.format("Nome: %s - Preço: %d", nome, preco); 
	}
	
}
