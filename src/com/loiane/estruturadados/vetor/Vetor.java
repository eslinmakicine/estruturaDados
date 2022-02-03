package com.loiane.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/* Os m�todos comentados abaixo foram exemplos citados mas que n�o eram t�o perform�ticos
	public void adiciona(String elemento) {
		for (int i=0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	} 

	public void adiciona(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
		} else {
			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos");
		}
	} */

	private void validaPosicao(int posicao) {
		if(!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("A posi��o inv�lida");
		}
	}

	public boolean adiciona(String elemento) {
		aumentaCapacidade();

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		} 
		return false;	
	}

	public int tamanho() { // indica a �ltima posi��o que o vetor cont�m ocupada
		return this.tamanho;
	}

	/* O m�todo abaixo funcionaria, no entanto, exibiria todos os elementos, inclusive aqueles que possuem o valor nulo
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	} */

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

	public String busca(int posicao) {
		validaPosicao(posicao);

		return this.elementos[posicao];
	}

	public int buscaElemento(String elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public boolean adicionaElemento(int posicao, String elemento) {

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

	private void aumentaCapacidade() {
		if(tamanho == this.elementos.length) {
			String[] elementosNovos= new String[this.elementos.length*2];
			for (int i = 0; i < tamanho;i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public boolean removeElemento(int posicao) {

		validaPosicao(posicao);

		//mover os elementos  - 5 - 2 < 5
		if (posicao < tamanho) {


			for(int i = posicao; i < tamanho-1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			tamanho--;}
		return true;
	}








}
