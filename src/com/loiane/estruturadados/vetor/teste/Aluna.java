package com.loiane.estruturadados.vetor.teste;

import java.util.Objects;

public class Aluna {

	private String nome;
	private String telefone;
	private String email;
	private String curso;

	public Aluna(String nome, String telefone, String email, String curso) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.curso = curso;
	}

	public Aluna() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluna [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", curso=" + curso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, email, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluna other = (Aluna) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(email, other.email)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

	
	
}
