package application;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        // Alimentando o vetor com os dados de entrada
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\nNUMEROS PARES:");
        
        int countOfEvens = 0; 
        
        // Percorre o array filtrando números pares (resto da divisão por 2 igual a zero)
        // Otimização: A impressão e a contagem ocorrem simultaneamente no mesmo laço (O(N))
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                // Imprime o número na mesma linha com um espaço de separação
                System.out.print(numbers[i] + " "); 
                countOfEvens++;
            }
        }
        
        // Exibe o total de números pares encontrados quebrando duas linhas para formatação visual
        System.out.printf("%n%nQUANTIDADE DE PARES = %d%n", countOfEvens);

        sc.close();
    }
}
