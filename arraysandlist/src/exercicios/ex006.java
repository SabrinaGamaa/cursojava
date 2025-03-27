package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite quantas colunas: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int l = 0; l < matriz.length; l++) {
			System.out.printf("Digite os números para a %d° linha:\n", l+1);
			for (int c =0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		for (int[] linha : matriz) {
			for (int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("Digite um número da matriz: ");
		int pos = sc.nextInt();
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] == pos) {
					System.out.println("Position: " + matriz[linha] + " , " + matriz[coluna]);
					if (coluna > 0) {
						System.out.println("Left: " + matriz[linha][-coluna]);
					}
					
					if (linha > 0) {
						System.out.println("Up: " + matriz[-linha][coluna]);
					}
					
					if (coluna < matriz[linha].length-1) {
						System.out.println("Right: " + matriz[linha][coluna+1]);
					}
					if (linha < matriz.length-1) {
						System.out.println("Down: " + matriz[linha+1][coluna]);
					}
					
				}
			}
		}
		
		sc.close();
		
	}
}
