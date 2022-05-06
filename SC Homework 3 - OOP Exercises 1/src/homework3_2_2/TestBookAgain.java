package src.homework3_2_2;

public class TestBookAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorAgain[] authors = new AuthorAgain[2];
		authors[0] = new AuthorAgain("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new AuthorAgain("Paul Tan", "Paul@nowhere,com", 'm');
		
		BookAgain javaDummy = new BookAgain("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
		
	}

}
