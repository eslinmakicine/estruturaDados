package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		System.out.println(vetor.removeElemento(0));
		System.out.println("Novo vetor: ");
		System.out.println(vetor);
	}

}
