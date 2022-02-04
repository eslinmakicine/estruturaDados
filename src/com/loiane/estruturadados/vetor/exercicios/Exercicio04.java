package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Melhore a classe Lista e implemente o método obtem(int posicao), onde será
		 * possível obter o elemento dada uma posição do vetor. Esse método é semelhante
		 * ao método get(int posicao) da classe ArrayList
		 */
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		Lista<String> lista = new Lista<String>(5); 
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println("Lista " + lista.busca(0));
		
		System.out.println("Arraylist: " + arrayList.get(0));

	}

}
