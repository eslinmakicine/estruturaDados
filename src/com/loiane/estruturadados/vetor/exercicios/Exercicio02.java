package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * O método lastIndexOf (String str) da classe StringBuffer é o método embutido
		 * usado para retornar o índice dentro da String para a última ocorrência da
		 * substring passada como parâmetro. A última ocorrência da string vazia “” é
		 * considerada como ocorrendo no valor de índice this.length(). Se a substring
		 * str não estiver presente, -1 será retornado.
		 */
		
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("B");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		System.out.println(lista.lastIndexOf("B"));
		
	}

}
