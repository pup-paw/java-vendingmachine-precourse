package vendingmachine.model;

public class Product {
	private final String name;
	private final int price;
	private int count;

	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public int sell(Product product) {
		product.count--;
		return product.price;
	}
}
