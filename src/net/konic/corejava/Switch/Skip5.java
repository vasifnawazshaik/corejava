package net.konic.corejava.Switch;

import java.util.Scanner;

public class Skip5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	    
	   for(int i=1; i<=10; i++) {
		   if(i==5)
		   continue;
		   System.out.println(i);
		   		  
	   }
	   sc.close();
	   }
	   
 }

	
