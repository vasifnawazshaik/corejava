package net.konicinheritance;

public class NewCustomer extends Customer{

	public NewCustomer(String name, double totalPurchaseAmt) {
		super(name, totalPurchaseAmt);
	}
	
	public double totalDiscount() {
		return totalPurchaseAmt+0.20;
	}


}
