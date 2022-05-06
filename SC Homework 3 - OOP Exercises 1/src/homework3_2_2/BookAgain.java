package src.homework3_2_2;
import java.util.Arrays;

public class BookAgain {

	private String name;
	private AuthorAgain[] authors;
	private double price;
	private int qty = 0;

	public BookAgain(String name, AuthorAgain[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public BookAgain(String name, AuthorAgain[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public AuthorAgain[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "AuthorAgain [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty="
				+ qty + "]";
	}

	public String getAuthorNames() {
		String nameString = "";
		for (int index = 0; index < authors.length; index++) {
			nameString = nameString + authors[index].getName();
		}
		return nameString;
	}
}
