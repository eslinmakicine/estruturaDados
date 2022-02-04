package com.loiane.estruturadados.vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArray<T> {
	private T[] elementos;
	private int tamanho;
	public ListaArray(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	/*
	 * Utilize a classe ArrayList e desenvolva os seguintes items: 
	 * 1. Crie uma lista utilizando a classe ArrayList da API do Java; 
	 * 2. Passe todos os contatos do vetor para o ArrayList; 
	 * 3. Crie um exemplo para utilizar cada método da classe ArrayList 
	 * (somente os métodos que implementamos de forma similar na
	 * classe Lista);
	 */
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> arrayList = new ArrayList<>();

	public int menu() {
		System.out.println("Digite o número correspondente a opção desejada");

		System.out.println("1 - Adicionar elemento");
		System.out.println("2 - Adicionar elemento em determinada posição");
		System.out.println("3 - Busca elemento ");
		System.out.println("4 - Busca índice do elemento");
		System.out.println("5 - Busca elemento por posição");
		System.out.println("6 - Remove elemento em determinada posição");
		System.out.println("7 - Remove determinado elemento");
		System.out.println("8 - Quantidade de elementos");
		System.out.println("9 - Substitui elemento");
		System.out.println("0 - Sair");

		int resposta = scanner.nextInt();	
		return resposta;
	}

	public void adicionaElemento(String elemento) {
		arrayList.add(elemento);
	}

}
