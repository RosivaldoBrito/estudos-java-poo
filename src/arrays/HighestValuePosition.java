package arrays;

import java.util.Locale;
import java.util.Scanner;

public class HighestValuePosition {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        double[] numbers = new double[n];
        
        // Populando o array com números reais
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble(); 
        }
        
        // Lógica de Busca do Maior Valor:
        // Assume-se inicialmente que o primeiro elemento (índice 0) é o maior
        double highestValue = numbers[0];
        int highestPosition = 0;

        // O laço inicia no índice 1, pois o 0 já é o maior atual.
        // Compara-se o valor atual com o restante do vetor.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i]; // Atualiza o maior valor
                highestPosition = i;       // Armazena a posição onde ele foi encontrado
            }
        }
        
        // Exibe os resultados formatados
        System.out.printf("%nMAIOR VALOR = %.1f%n", highestValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + highestPosition);

        sc.close();
    }
}
