package net.konic.corejava.Switch;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		
  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option 1 to 4 :");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("unliminited pack");
			break;
		case 2:
			System.out.println("sms pack");
			break;
		case 3 :
			System.out.println("talktime pack");
			break;
		case 4 :
			System.out.println("exite");
			break;
		default:
			System.out.println("invalid option");
		}
		sc.close();
		

		}
		
		
		
		
	

}
