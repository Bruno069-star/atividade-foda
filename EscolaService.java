package br.com.escola.service;

import java.util.ArrayList;
import java.util.List;

import br.com.escola.model.Turma;

public class EscolaService {

	private List<Turma> turmas = new ArrayList<>();

	

    public void adicionarTurma(Turma turma) {
    	turmas.add(turma);

	}

    public List<Turma> listarTurmas(){

    	return turmas;

    }

    public Turma buscarTurma(int indice) {

    	if(indice >= 0 && indice < turmas.size()) {

    		return turmas.get(indice);

    	}

    	return null;

    }

    public boolean estaVazia() {

    	return turmas.isEmpty();

    }
}
