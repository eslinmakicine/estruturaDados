package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Melhore a classe Lista e implemente o m�todo obtem(int posicao), onde ser�
		 * poss�vel obter o elemento dada uma posi��o do vetor. Esse m�todo � semelhante
		 * ao m�todo get(int posicao) da classe ArrayList
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
