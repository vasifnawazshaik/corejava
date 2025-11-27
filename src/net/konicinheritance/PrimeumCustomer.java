package net.konicinheritance;

public class PrimeumCustomer extends Customer {

	public PrimeumCustomer(String name, double totalPurchaseAmt) {
		super(name, totalPurchaseAmt);
	}
	
    public double totalDiscount() {
    	    return totalPurchaseAmt*0.15;
    }
	

}
