package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Collection;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Melhore a classe Lista e implemente o método limpar, onde todos os elementos
		 * da lista são removidos. Esse método é semelhante ao método clear da classse
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
