package treinamento.spring.aspecto.config.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AntesDoMetodo {

	@Before("execution(* treinamento.spring.aspecto..*.* (..))")
	public void antesDoMetodo(JoinPoint joinPoint) {
		System.out.println("Antes do Método..." + joinPoint.getTarget().getClass().getName());
	}

	@After("execution(* treinamento.spring.aspecto.repositorio.*.* (..))")
	public void depoisDoMetodo(JoinPoint point) {
		System.out.println("Depois do Método..." + point.getTarget().getClass().getName());
	}

	@Around("bean(usuarioRepositorio)")
	public void around() {

	}

}