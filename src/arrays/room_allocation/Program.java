package arrays.room_allocation;

import java.util.Locale;
import java.util.Scanner;

/**
 * Algoritmo de Alocação de Quartos (Pensionato).
 * Aplica conceitos de Vetores de Objetos e manipulação direta de índices.
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // A regra de negócio define um limite fixo de 10 quartos disponíveis (índices 0 a 9).
        // Inicialmente, todas as posições do array de objetos nascem como 'null'.
        Rent[] rooms = new Rent[10];
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        // Coleta dos dados dos N estudantes que farão o aluguel
        for(int i = 0; i < n; i++) {
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.print("Name: ");
            
            // Consome a quebra de linha (Enter) pendente do nextInt() anterior
            sc.nextLine(); 
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room (0-9): ");
            int roomNumber = sc.nextInt();
            
            // Ponto-chave da arquitetura:
            // O objeto é instanciado diretamente na posição equivalente ao número do quarto.
            rooms[roomNumber] = new Rent(name, email);
        }
        
        System.out.println("\nBusy rooms:");
        
        // Varredura completa do prédio (tamanho total do array)
        for(int i = 0; i < rooms.length; i++) {
            // Filtra apenas os quartos ocupados (diferentes de null)
            // A própria iteração sequencial garante que a impressão seja em ordem crescente de quarto.
            if(rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
        
        sc.close();
    }
}