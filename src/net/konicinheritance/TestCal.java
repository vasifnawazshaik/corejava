package net.konicinheritance;

public class TestCal {
	public static void main(String[] args) {
		
		Calculator c1= new Calculator();
		System.out.println(c1.sum(10, 20));
		
		Calculator c2= new Calculator();
		System.out.println(c2.sum(10.27, 20.230));
		
		Calculator c3= new Calculator();
		System.out.println(c3.sum(10, 20, 30));
		
		Calculator c4= new Calculator();
		System.out.println(c4.sum(10, 10.550));
		
		
			}

}
