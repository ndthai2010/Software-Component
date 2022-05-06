package src.homework3_2_5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(07, "Ronaldo", 'm');
		System.out.println(customer);
		System.out.println("Id is "+ customer.getId());
		System.out.println("Name is: " + customer.getName());
		
		Account account = new Account(012, customer, 200.0);
		System.out.println(account);
		System.out.println(account.deposit(20));
		System.out.println(account.withdraw(400));
		System.out.println(account.withdraw(50));
	}

}
