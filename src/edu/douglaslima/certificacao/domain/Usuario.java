package edu.douglaslima.certificacao.domain;

import java.time.LocalDate;

public class Usuario extends UserDetails {

	private String nome;
	private String email;
	private LocalDate dataNascimento;

	Usuario(String usuario, String senha) {
		super(usuario, senha);
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
