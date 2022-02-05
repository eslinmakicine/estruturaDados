package com.loiane.estruturadados.vetor;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	//1� solu��o mais elegante segundo o livro Java Efetivo
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	public Lista() {
		this(10);
	}

	/*2� solu��o
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	} */	



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

	public boolean adiciona(T elemento) {
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

	public T busca(int posicao) {
		validaPosicao(posicao);

		return this.elementos[posicao];
	}

	public int buscaElemento(Object elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public boolean adicionaElemento(int posicao, T elemento) {

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
			T[] elementosNovos= (T[]) new Object[this.elementos.length*2];
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


	/*
	 * EXERC 01 - Melhore a classe Lista e implemente o m�todo cont�m, semelhante ao
	 * m�todo contains da classe ArrayList O m�todo contains faz uma busca no array
	 * a partir do elemento informado e retorna um boolean informando se encontrou
	 * ou n�o
	 */
	public boolean contem(T elemento) {

		return buscaElemento(elemento) > -1;
		
	} 
	
	/*
	 * EXERC 02 - Melhore a classe Lista e implemente o m�todo ultimoIndice,
	 * semelhante ao m�todo lastIndexOf da classe ArrayList.
	 */
	public int lastIndexOf(T elemento) {
		
		for(int i = tamanho; i > 0 ; i--) {
			if(this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	} 

	/*
	 * EXERC 03 - Melhore a classe Lista e implemente o m�todo remove(T elemento),
	 * onde ser� poss�vel remover um elemento da lista passando o mesmo como
	 * par�metro
	 */
	public boolean removeElemento(T elemento) {

		//validaPosicao(posicao);
		for(int i = 0; i < tamanho; i++) {
			if(this.elementos[i] == elemento) {
				removeElemento(i);
				return true;
			}
		}
		return false;
	}
	
	/*
	 * EXERC 04 - Melhore a classe Lista e implemente o m�todo limpar, onde todos os elementos
	 * da lista s�o removidos. Esse m�todo � semelhante ao m�todo clear da classse
	 * ArrayList.
	 */
	public boolean limpar() {

		if (!(this.tamanho > 0)) {
			return false;
		}

		for (int i=0; i<this.tamanho; i++){
			this.elementos[i] = null;
		}
		this.tamanho = 0;
		return true;
	}
	
}

