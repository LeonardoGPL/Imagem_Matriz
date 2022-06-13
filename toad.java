package toad;

import java.util.Scanner;

public class toad {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// criando variaveis
		int l, c, m[][] = new int[16][16];// criando matriz
		// exibir na tela
		System.out
				.println("Escolha as cores de acordo com o número\n-Branco = 0\n-Preto = 1\n-Vermelho = 2\n-Bege = 3");
		// criando laço de repetição
		for (l = 0; l < 16; l++) {
			// exibir na tela
			System.out.printf("Informe os elementos %da. linha:\n", (l + 1));
			for (c = 0; c < 16; c++) {
				System.out.printf("m[%d][%d] = ", l, c);
				m[l][c] = batman.nextInt(); // atribuindo valor digitado pelo usuario
			}
			// pular linha
			System.out.printf("\n");
		}
		System.out.printf("\n");
		for (l = 0; l < 16; l++) {
			System.out.printf("linha: ", (l + 1));
			for (c = 0; c < 16; c++) {
				System.out.printf("%d ", m[l][c]);
			}
			System.out.printf("\n");
		}

	}

}
