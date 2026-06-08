
package matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);

		scanner.close();
	}
}