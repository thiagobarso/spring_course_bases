package treinamento.springmvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class OlaController {
	
//	@RequestMapping(method = RequestMethod.GET, path="/ola" )
	@GetMapping
//	@ResponseBody
	public String ola(@RequestParam(required = false, value = "m") String mensagem) {
		return "Olá " + mensagem;
	}
	
	
	@GetMapping("/{id}")
	public String ola2(@PathVariable("id") String id) {
		return "Meu id é " + id;
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable("id") String id) {
		return "Esse ID será deletado: " + id;
	}

}
