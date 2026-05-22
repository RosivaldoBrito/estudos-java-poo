package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        // Criando um vetor de Objetos do tipo Person
        Person[] vect = new Person[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            sc.nextLine(); // Limpeza de buffer
            
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            
            // Instanciando o objeto e guardando dentro do vetor
            vect[i] = new Person(name, age, height);
        }
        
        // Calculando Média de Altura
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }
        double avg = sum / vect.length;
        System.out.printf("%nAltura media: %.2f%n", avg);
        
        // Calculando Porcentagem de menores de 16 anos
        int menores = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menores++;
            }
        }
        
        double porcentagem = ((double) menores / vect.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        
        // Imprimindo os nomes dos menores de 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
