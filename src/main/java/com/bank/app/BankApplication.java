package com.bank.app;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.dao.UsuarioDAO;
import com.bank.app.model.Usuario;

@SpringBootApplication
@RestController
public class BankApplication {
	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	
	@GetMapping("/api")
	public void insertarTest(){
		System.out.println("Hola");
		usuarioDao.createUser(new Usuario( new BigInteger("0"),"Hugo","Loyola","Maya", "hugo_loyo@gmail", new BigDecimal("1")));
	}

}
