package br.com.escola.model;

import java.util.ArrayList;

public class Turma {
	
	private String nome;
	private List<Aluno> alunos;

	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public String toString() {
		return nome + "(" + alunos.size() + "alunos)";
	}
}
	