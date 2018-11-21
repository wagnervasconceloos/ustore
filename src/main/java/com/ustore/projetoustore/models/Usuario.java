package com.ustore.projetoustore.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "senha", nullable = false)
	private String senha;
	@Column(name = "sexo", nullable = false)
	private String sexo;
	@Column(name = "raca", nullable = false)
	private String raca;
	@Column(name = "reino", nullable = false)
	private String reino;
	
	
	public long getId() {
		return id;
	}
	public void setIod(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getReino() {
		return reino;
	}
	public void setReino(String reino) {
		this.reino = reino;
	}
	
	
}
