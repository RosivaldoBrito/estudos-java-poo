package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumbers {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt(); // Declaramos o 'n' direto aqui

        // Criando o array com nome em inglês
        int[] numbers = new int[n];

        // Lendo os dados e guardando no array
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        // Percorrendo o array e imprimindo apenas os negativos
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]); // Usei println que é mais simples que o printf aqui
            }
        }

        sc.close();
    }
}
