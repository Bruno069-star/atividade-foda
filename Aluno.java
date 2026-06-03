package br.com.escola.model;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno (String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getHome() {
		return nome;
	}
	
	public double getMedia() {
		return (nota1 + nota2)/2;
	}

	public String getSituacao() {
		return getMedia() >= 6.0 ? "aprovado" : "reprovado";
	}

public String toString() {
	return String.format(
			"%s | nota 1: %.f | nota 2 : %.f | média : %.f| %s",
			nome,
			nota1,
			nota2,
			getMedia(),
			getSituacao()
		);
  }
}
