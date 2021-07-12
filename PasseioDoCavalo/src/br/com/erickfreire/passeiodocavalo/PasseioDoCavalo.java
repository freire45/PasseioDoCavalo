package br.com.erickfreire.passeiodocavalo;

import java.util.Scanner;

/**
 * Programa em Java que simula a movimentação do cavalo por um tabuleiro de Xadrez
 * @author Erick Freire
 * @version 1 - Criado em 12-07-2021 as 19:45
 */

public class PasseioDoCavalo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] vetor = new int[8][8];
		int linha;
		int coluna;
		int contador = 0;
		int opcao = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				vetor[i][j] = 0;
			}
		}	
		
		
		System.out.println("Simulador De Tabuleiro de Xadrez, o 1 Representa a posição do Cavalo: ");
		
		System.out.print("Digite 1 - para inserir uma cordenada ou 9 - para sair: ");
		opcao = entrada.nextInt();
		
		while(opcao != 9) {
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.printf("%d  ", vetor[i][j]);
					
					if(j == 7) {
						System.out.println();
					}
				}
				
			}
			
			System.out.print("Informe a linha: ");
			linha = entrada.nextInt();
			System.out.print("Informe a coluna: ");
			coluna = entrada.nextInt();
			
			if(vetor[linha - 1][coluna - 1] == 0) {
				vetor[linha - 1][coluna - 1] = 1;
				contador += 1;
			} else {
				if(vetor[linha - 1][coluna - 1] == 1) {
					System.out.println("\nErro: Linha já foi visitada!");
				}
			}
			
			System.out.print("Digite 1 - para inserir uma cordenada ou 9 - para sair: ");
			opcao = entrada.nextInt();			
		}
		
		System.out.printf("\nVocê Percorreu %d de casas no tabuleiro", contador);
		System.out.println("\nPrograma Finalizado!");
		
	}

}
