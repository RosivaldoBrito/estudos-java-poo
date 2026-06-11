package orientacao_objetos.pedido_ecommerce.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import orientacao_objetos.pedido_ecommerce.entities.enums.OrderStatus;

public class Order {
	private LocalDateTime date;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public Order() {

	}

	public Order(LocalDateTime date, OrderStatus status, Client client) {
		super();
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ").append(date.format(fmt)).append("\n");
		sb.append("Order status: ").append(status).append("\n");
		sb.append("Client: ").append(client).append("\n");
		sb.append("Order items:\n");

		for (OrderItem item : items) {
			sb.append(item).append("\n");
		}

		sb.append("Total price: $").append(String.format("%.2f", total()));

		return sb.toString();

	}
}
