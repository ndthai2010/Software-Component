package src.homework3_2_1;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		
		System.out.println(ahTeck);
		ahTeck.setEmail("paulTan@nowhere.com");
		System.out.println("Name is: " + ahTeck.getName());
		System.out.println("Email is: " + ahTeck.getEmail());
		System.out.println("Gender is: " + ahTeck.getGender());
	}

}
