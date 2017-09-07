package com.mwcc.cursojavaee;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroAlunoBean implements Serializable{
	private String nome;
	private String email;
	
	public void cadastrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
