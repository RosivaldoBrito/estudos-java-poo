package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas e colunas (M N): ");
		int rows = sc.nextInt(); // M (Linhas)
		int cols = sc.nextInt(); // N (Colunas)

		int[][] matrix = new int[rows][cols];

		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite o número (X) que deseja buscar: ");
		int targetNumber = sc.nextInt();

		// Varrendo a matriz inteira em busca do X
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				// Se encontramos o número procurado
				if (matrix[i][j] == targetNumber) {
					System.out.println("\nPosition " + i + "," + j + ":");

					// ESQUERDA: Só existe se a coluna atual for MAIOR que 0
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					// ACIMA: Só existe se a linha atual for MAIOR que 0
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}

					// DIREITA: Só existe se a coluna for MENOR que a última coluna (cols - 1)
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}

					// ABAIXO: Só existe se a linha for MENOR que a última linha (rows - 1)
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}