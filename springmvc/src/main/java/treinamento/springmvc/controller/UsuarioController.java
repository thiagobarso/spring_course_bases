package treinamento.springmvc.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import treinamento.springmvc.entidade.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping
	public List<Usuario> listar() {
		return Arrays.asList(new Usuario(1L, "admin"), new Usuario(2L, "teste"));

	}
	
	@PostMapping
	public ResponseEntity cadastrar(@RequestBody @Valid Usuario usuario, BindingResult bindingResult) {
		System.out.println("cadastrando o usuario...");
		if(bindingResult.hasErrors()) {
			return new ResponseEntity(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
	}

}
