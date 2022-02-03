package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(7);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		vetor.adiciona("elemento 5");
		vetor.adiciona("elemento 6");
		vetor.adiciona("elemento 7");
		
		System.out.println(vetor.busca(2));
	}

}
