package br.com.escola;

import java.util.Scanner;
import br.com.escola.model.aluno;
import br.com.escola.model.turma;
import br.com.escola.service.EscolaService;

@SuppressWarnings("java:S106")
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		EscolaService service = new EscolaService();
		
		int opcao;
	}
		do {
		    System.out.println("\n=====SISTEMA ESCOLAR=====/");
		    System.out.println("1 - Cadastrar turma");
		    System.out.println("2 - Listar turmas");
		    System.out.println("3 - cadastrae aluno em turma");
		    System.out.println("4 - Litar alunos de uma turma");
		    System.out.println("5 - sair");
		    System.out.print("Escolha:");
		    
		    opcao = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (opcao) {
		    case 1:
		    	System.out.print("Nome da turma: ");
		    	String nomeTurma = scanner.nextLine();
		    	service.adicionarTurma(new turma(nomeTurma));
		    	System.out.println("Turma cadastrada com sucesso!");
		    	break;
		    	
		    case 2:
		    	listarTurma(service);
		    	break;
		    	
		    case 3:
		    	cadastraAluno(scanner, service);
		    	break;
		    	
		    case 4:
		    	listarAlunos(scanner,service);
		        break;
		        
		    case 5:
		    	System.out.println("encrrando o sistema. Até logo!");
		    	break;
		    	
		    	default:
		    		System.out.println("opção invalida! Digite um número e 1 a 5!");
		    		
		    		
}
}while(opcao !=5);
		scanner.close();
}

private static void litarTurma(EscolaService service) {
	
	if (service.estaVazia()) {
		System.out.println("Nenhuma turma cadatrada ainda.");
		return;
	}
	
	System.out.println("\n--- Turmas cadastradas ---");
	
	for (int i = 0; 1 < service.listarTurmas().size(); i++) {
		System.out.println(i+ "-" + service.listarTurmas().get(i));
	}
}
 private static void cadastrarAluno(Scanner scanner, EscolaService service) {
	 if (service.estaVazia()) {
		 System.out.println("cadastre uma turma primeiro.");
		 return;
	 }
	 listarTurmas(service);
	 
	 System.out.println("escolha o indice da turma: ");
	 int indice = scanner.nextInt();
	 scanner.nextLine();
	 turma turma = service.buscarTurma(indice);

 if(turma == null) {
	 System.out.println("Indice invalido. Nenhuma turma encontrada.");
	 return;
 }
 
 System.out.print("Nome do aluno: ");
 String nome = scanner.nextLine();
 
 System.out.print("Nota 1: ");
 double nota1 = scanner.nextDouble();
 
 System.out.print("Nota 2: ");
 double nota2 = scanner.nextDouble();
 
 turma.adicionarAluno(new Aluno(nome,nota1,nota2));
 
System.out.println("Aluno cadatrado com sucesso!");	 

private static void listarAluno(Scanner scanner, EscolaService service) {
	if (service.estaVazia()) {
		System.out.println("Nenhuma turma cadastrada ainda.");
		return;
	}
	
	listarTurmas(service);
	
	System.out.print("Escolha o indice da turma:  ");
	int indice = scanner.nextInt();
	scanner.nextLine();
	
	turma turma = service.buscarTurma(indice);
	
	if (turma == null) {
		System.out.println("Indice invalido. Nenhuma turma encontrada.");
		return;
	}
	if(turma.getAlunos().isEmpty()) {
		System.out.println("Nenhum aluno cadastrado nesta turma.");
	}
}
}
