package src.homework3_2_5;

public class Account {

	private int id;
	private Customer customer;
	private double balance = 0.0;

	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("%s %.2f%n", customer, balance);
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public Account deposit(double amount) {
		this.balance = amount + this.balance;
		return this;
	}

	public Account withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Amount withdraw exceeds the current balance!");
		}
		return this;
	}

}
