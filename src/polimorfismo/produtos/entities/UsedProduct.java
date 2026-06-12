package polimorfismo.produtos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, LocalDate manucafactureDate) {
		super(name, price);
		this.manufactureDate = manucafactureDate;
	}

	public LocalDate getManucafactureDate() {
		return manufactureDate;
	}

	public void setManucafactureDate(LocalDate manucafactureDate) {
		this.manufactureDate = manucafactureDate;
	}

	@Override
	public String priceTag() {

		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}

}
