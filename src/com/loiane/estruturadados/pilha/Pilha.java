package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	/* m�todo que eu fiz, abaixo est� o da Loiane
	 * public T topo() { if (this.tamanho > 0 ) { return
	 * this.elementos[this.tamanho-1];
	 * } return null;
	 * }
	 */

	public T topo() {
		if (this.estaVazio()) {
			return null;
		}

		return this.elementos[this.tamanho-1];

	}

	//m�todo que eu fiz, abaixo est� o da Loiane
//	public T desempilha() {
//		if (this.estaVazio()) {
//			return null;
//		}
//		this.tamanho--;
//		return this.elementos[this.tamanho];
//	}
	
	public T desempilha() {
		if (this.estaVazio()) {
			return null;
		}
		return this.elementos[--this.tamanho];
	}
}
