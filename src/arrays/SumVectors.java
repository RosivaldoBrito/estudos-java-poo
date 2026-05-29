package arrays;

import java.util.Locale;
import java.util.Scanner;

public class SumVectors {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];
        
        // Populando o Vetor A
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }
        
        // Populando o Vetor B
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }
        
        // Lógica: Somando os elementos correspondentes pelo índice
        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        
        // Exibindo o vetor resultante
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println(vectorC[i]);
        }
        
        sc.close();
    }
}