package src.lab6_1;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("A");
		customer.setMemberType("Premium");
		System.out.println(customer);

		java.util.Date date = new java.util.Date();

		Visit visit = new Visit(customer, date);
		System.out.println(visit);
		visit.setProductExpense(10);
		visit.setServiceExpense(10);
		System.out.println(visit);
		System.out.println(visit.getProductExpense());
		System.out.println(visit.getServiceExpense());
		System.out.println(visit.getTotalExpense());
		System.out.println("-----------------");

		customer.setMemberType("Gold");
		System.out.println(customer);
		visit.setProductExpense(15);
		visit.setServiceExpense(15);
		System.out.println(visit);
		System.out.println(visit.getProductExpense());
		System.out.println(visit.getServiceExpense());
		System.out.println(visit.getTotalExpense());

	}

}
