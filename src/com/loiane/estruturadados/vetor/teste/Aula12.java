package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		
		//Adiciona elemento ao vetor
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		//Adiciona elemento em determinado índice
		arrayList.add(4, "E"); 
				
		System.out.println(arrayList); /* exibe array */
		
		//Busca por elemento, retornando um boolean
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Esse elemento existe no vetor");
		} else {
			System.out.println("Esse elemento não existe no vetor");
		}
		
		//Busca por elemento, retornando o índice
		int pos = arrayList.indexOf("B");
		if (pos >= 0) {
			System.out.println("Esse elemento encontra-se no índice: " + pos );
		} else {
			System.out.println("Esse elemento não existe no vetor");
		}
		
		//Busca por posição
		System.out.println(arrayList.get(2));
		
		//Remove elemento de determinado índice
		System.out.println(arrayList.remove(0));

		//Remove determinado elemento
		System.out.println(arrayList.remove("g"));

		System.out.println(arrayList); /* exibe array */

		//Número de elementos na lista
		System.out.println(arrayList.size());

		//Substitui elemento na lista
		System.out.println(arrayList.set(0, "Z"));
		
		System.out.println(arrayList); /* exibe array */


	}

}
