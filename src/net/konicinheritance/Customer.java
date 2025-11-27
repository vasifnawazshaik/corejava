package net.konicinheritance;

public class Customer {

	private String name;
	protected double totalPurchaseAmt;
	
	public Customer(String name,double totalPurchaseAmt) {
		this.name=name;
		this.totalPurchaseAmt=totalPurchaseAmt;
		
	}
	
	public double totalDiscount() {
		return totalPurchaseAmt*0.10;
			
	}
	
	public void printResults() {
		System.out.println("Customer name : "+ name);
		System.out.println("Total purchase amount : "+totalPurchaseAmt);
		System.out.println("Total Discount : "+totalDiscount());
		System.out.println("Final bill : "+ (totalPurchaseAmt-totalDiscount()));
	}
	

}
