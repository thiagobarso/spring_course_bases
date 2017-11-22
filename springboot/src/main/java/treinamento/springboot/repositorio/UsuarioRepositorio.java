package treinamento.springboot.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import treinamento.springboot.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
