package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Utiliza a classe Lista ou vetor e Classe Contato(criada durante as aulas) e
		 * desenvolva os seguintes items: 
		 * 1. Crie um vetor com capacidade para 20 contatos; 
		 * 2. Insira 30 contatos no vetor(isso é possível através de um loop);
		 * 3. Crie um exemplo para utilizar cada método da classe Lista;
		 */
		
		Lista<Contato> vetor = new Lista<Contato>(20);
	
		for(int i = 1; i < 31 ;i++) {
			Contato contatoX = new Contato("Contato " + i , "(47) 9 9702-3045", "contato" + i + "@gmail.com");
			vetor.adiciona(contatoX);
		}
		
		Contato contatoX = new Contato("Contato X", "(47) 9 9702-3045", "contato@gmail.com");

		vetor.adicionaElemento(2,contatoX );	
		System.out.println(vetor);
		System.out.println("Busca: " + vetor.busca(2));
		System.out.println("BuscaElemento: " + vetor.buscaElemento(contatoX));
		System.out.println("Contem: " + vetor.contem(contatoX));
		System.out.println("LastIndexOf: " + vetor.lastIndexOf(contatoX));
		System.out.println("RemoveElemento: " + vetor.removeElemento(contatoX));
		vetor.adicionaElemento(3,contatoX );	
		System.out.println("RemoveElemento: " + vetor.removeElemento(3));
		System.out.println("Tamanho: " + vetor.tamanho());
		System.out.println("ToString: " + vetor.toString());
		System.out.println("Limpar: " + vetor.limpar());

		System.out.println(vetor);
		
	}

}
