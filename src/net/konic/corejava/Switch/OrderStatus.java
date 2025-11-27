package net.konic.corejava.Switch;

import java.util.Scanner;

public class OrderStatus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order status");
		String option = sc.next();
		switch(option) {
		case "packed":
			System.out.println("order is packed");
			break;
		case "shipped":
			System.out.println("your order is on the way");
			break;
			default:
				System.out.println("order cancelled");
				sc.close();
			
			
		}
		
		}
 
}
