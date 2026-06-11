package orientacao_objetos.pedido_ecommerce.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.pedido_ecommerce.entities.Client;
import orientacao_objetos.pedido_ecommerce.entities.Order;
import orientacao_objetos.pedido_ecommerce.entities.OrderItem;
import orientacao_objetos.pedido_ecommerce.entities.Product;
import orientacao_objetos.pedido_ecommerce.entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt); 
        
        Client client = new Client(clientName, email, birthDate); 

      
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        sc.nextLine(); // Limpeza do buffer do Scanner
        
       
        OrderStatus status = OrderStatus.valueOf(sc.nextLine()); 
        
        
        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); // Limpeza de buffer
            String productName = sc.nextLine();
            
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            
           
            Product product = new Product(productName, productPrice);
            
           
            OrderItem item = new OrderItem(quantity, productPrice, product);
            
            order.addItem(item); 
        }

        
        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);
        sc.close();
    }
}