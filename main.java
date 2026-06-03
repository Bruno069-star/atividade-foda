package br.com.escola;

import java.util.Scanner;
import br.com.escola.model.Aluno;
import br.com.escola.model.Turma;
import br.com.escola.service.EscolaService;

@SuppressWarnings("java:S106")
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		EscolaService service = new EscolaService();
		
		int opcao;
		
		do {
		    System.out.println("\n=====SISTEMA ESCOLAR=====/");
		    System.out.println("1 - Cadastrar turma");
		    System.out.println("2 - Listar turmas");
		    System.out.println("3 - cadastrae aluno em turma");
		    System.out.println("4 - Litar alunos de uma turma");
		    System.out.println("5 - sair");
		    System.out.print("Escolha:");
}
}
}