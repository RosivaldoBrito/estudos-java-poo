package arrays;

import java.util.Locale;
import java.util.Scanner;

public class AverageHeight {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be measured? ");
        int numberOfPeople = sc.nextInt();
        
        // Declarando o Array (Vetor) com nomes claros
        double[] heights = new double[numberOfPeople];

        // Populando o Array
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter height for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        
        // Calculando a soma
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        
        // Calculando a média (Average)
        double average = sum / numberOfPeople;
        System.out.printf("%nAVERAGE HEIGHT: %.2f%n", average);

        sc.close();
    }
}
