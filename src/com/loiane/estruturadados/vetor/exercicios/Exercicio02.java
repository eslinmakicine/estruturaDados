package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * O m�todo lastIndexOf (String str) da classe StringBuffer � o m�todo embutido
		 * usado para retornar o �ndice dentro da String para a �ltima ocorr�ncia da
		 * substring passada como par�metro. A �ltima ocorr�ncia da string vazia �� �
		 * considerada como ocorrendo no valor de �ndice this.length(). Se a substring
		 * str n�o estiver presente, -1 ser� retornado.
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
