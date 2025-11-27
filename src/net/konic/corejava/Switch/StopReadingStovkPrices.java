package net.konic.corejava.Switch;

import java.util.Scanner;

public class StopReadingStovkPrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		while (true) {
			int price = sc.nextInt();
			if (price == -1) {
				System.out.println("Stop reading at -1");
   		break; // stop the loop when -1 is entered
			}
		}	
		sc.close();
      	}  


	
	}


