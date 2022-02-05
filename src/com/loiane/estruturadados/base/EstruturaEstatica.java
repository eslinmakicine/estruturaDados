package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		aumentaCapacidade();

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		} 
		return false;	
	}

	protected boolean adicionaElemento(int posicao, T elemento) {

		validaPosicao(posicao);
		aumentaCapacidade();

		//mover os elementos
		for(int i = tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		tamanho++;

		return true;
	}

	protected void aumentaCapacidade() {
		if(tamanho == this.elementos.length) {
			T[] elementosNovos= (T[]) new Object[this.elementos.length*2];
			for (int i = 0; i < tamanho;i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	private void validaPosicao(int posicao) {
		if(!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("A posi��o inv�lida");
		}
	}


	public int tamanho() { // indica a �ltima posi��o que o vetor cont�m ocupada
		return this.tamanho;
	}


	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i=0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}
	
	public boolean estaVazio() {
		return this.tamanho == 0;
	}

}
