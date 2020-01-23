package com.bank.app.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Usuario {

	private BigInteger idUsuario;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String email;
	private BigDecimal numeroCuenta;

	public Usuario() { }

	public Usuario(BigInteger idUsuario, String nombre, String primerApellido, String segundoApellido, String email,
			BigDecimal numeroCuenta) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.email = email;
		this.numeroCuenta = numeroCuenta;
	}

	public BigInteger getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigInteger idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(BigDecimal numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	


}
