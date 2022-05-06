package src.homework3_2_3;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
		System.out.println(author1);
		author1.setEmail("ahteck@somewhere.com");
		System.out.println(author1);
		System.out.println("Name: " + author1.getName());
		System.out.println("Email: " + author1.getEmail());

		Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
		System.out.println(book1);
		book1.setPrice(9.9);
		book1.setQty(99);

		System.out.println(book1);
		System.out.println("Isbn: " + book1.getIsbn());
		System.out.println("Name: " + book1.getName());
		System.out.println("Price: " + book1.getPrice());
		System.out.println("Qty: " + book1.getQty());

		System.out.println("Author's name: " + book1.getAuthorName());
		System.out.println("Author's name: " + book1.getAuthor().getName());
		System.out.println("Author's email: " + book1.getAuthor().getEmail());
	}

}
