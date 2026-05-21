package application;

import java.util.Locale;
import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        
        double[] numbers = new double[n];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }
        
        // Imprimindo os valores na mesma linha
        System.out.print("VALORES = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f ", numbers[i]);
        }
        
        // Calculando a soma
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Calculando a média
        double average = sum / numbers.length;
        
        // Exibindo os resultados usando o %n para pular linha
        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", average);
            
        sc.close();
    }
}
