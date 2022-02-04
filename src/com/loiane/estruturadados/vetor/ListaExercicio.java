package com.loiane.estruturadados.vetor;

public class ListaExercicio<T> {

	private T[] elementos;
	private int tamanho;

	public ListaExercicio(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
		
		
	}



}
