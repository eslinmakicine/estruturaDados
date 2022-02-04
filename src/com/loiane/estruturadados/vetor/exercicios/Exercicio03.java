package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);
		
		//Melhore a classe Lista e implemente o m�todo remove(T elemento), onde ser� poss�vel 
		//remover um elemento da lista passando o mesmo como par�metro
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista);
		System.out.println(lista.removeElemento("C"));
		System.out.println(lista);

	}
	

}
