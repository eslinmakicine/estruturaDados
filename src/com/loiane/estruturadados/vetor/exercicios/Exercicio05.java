package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Collection;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Melhore a classe Lista e implemente o m�todo limpar, onde todos os elementos
		 * da lista s�o removidos. Esse m�todo � semelhante ao m�todo clear da classse
		 * ArrayList.
		 */
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("A");

				
		System.out.println("Lista: " + lista.limpar());
		
		System.out.println("Arraylist: " + arrayList.removeAll(arrayList));
		
	}

}
