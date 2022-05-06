package src.lab6_1;

import java.util.Date;

public class Visit {

	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}

	public String getName() {
		return customer.getName();
	}

	public Date getDate() {
		return date;
	}

	public double getServiceExpense() {
		double typeService = DiscountRate.getServiceDiscountRate(customer.getMemberType());
		return (serviceExpense * (1 - typeService));
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		double typeProduct = DiscountRate.getProductDiscountRate(customer.getMemberType());
		return (productExpense * (1 - typeProduct));
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotalExpense() {

		double isMem;
		if (customer.isMember()) {
			isMem = 0.1;
		} else {
			isMem = 0;
			customer.setMember(true);
		}
		return (getProductExpense() + getServiceExpense()) * (1 - isMem);
	}

	@Override
	public String toString() {
		return "Visit [customer = " + customer + ", date = " + date + ", serviceExpense = " + serviceExpense
				+ ", productExpense = " + productExpense + "]";
	}

}
