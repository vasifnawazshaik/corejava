package net.konic.corejava.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option 1-4");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Balance Enquiry");
			break;
		case 2:
			System.out.println("Mini Statement");
			break;
		case 3:
			System.out.println("Whithdrawl");
			break;
		case 4:
			System.out.println("Exite... Thank you!");
			break;
		default:
			System.out.println("invalid ATM card");
		}
		  sc.close();
	
	
     	}


	}


