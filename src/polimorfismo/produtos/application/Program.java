package polimorfismo.produtos.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.produtos.entities.ImportedProduct;
import polimorfismo.produtos.entities.Product;
import polimorfismo.produtos.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		System.out.print("Enter the number of products:");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = scanner.next().charAt(0);
			scanner.nextLine();
			if (ch == 'c') {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Price: ");
				double price = scanner.nextDouble();
				products.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Price: ");
				double price = scanner.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY):");
				LocalDate ManufactureDate = LocalDate.parse(scanner.next(), format);
				products.add(new UsedProduct(name, price, ManufactureDate));
			} else if (ch == 'i') {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Price: ");
				double price = scanner.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}

		}
		System.out.println("PRICE TAGS:");
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}

		scanner.close();
	}

}
