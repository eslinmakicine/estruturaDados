package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(4);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");

		System.out.println(vetor.buscaElemento("elemento 7"));
	}
}
