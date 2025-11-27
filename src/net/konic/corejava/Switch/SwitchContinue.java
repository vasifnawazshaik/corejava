package net.konic.corejava.Switch;

import java.util.Scanner;

public class SwitchContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int limit = sc.nextInt();
		for (int i = 1; i <= limit; i++){ 
		switch(i) {
		case 1:
			System.out.println("1 -> one ");
			
		case 2:
			System.out.println("3 -> three");
		case 3:
			System.out.println("5 -> five");
		case 4:
			System.out.println("7----odd number");
		case 5:
			System.out.println("8----odd number");
			if(i%2==0) {
				continue;
				
			
			}
		sc.close();
			}
		}
     	} 
	}




