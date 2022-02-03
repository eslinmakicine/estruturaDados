package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(4);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 2");

		System.out.println(vetor.adicionaElemento(3, "elemento extra"));
		System.out.println(vetor);

	}

}
