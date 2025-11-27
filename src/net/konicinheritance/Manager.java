package net.konicinheritance;

public class Manager extends Cleark{
	
	public void info() {
		System.out.println("i am from manager");
	}
	
	public static void main(String[] args) {
		Employee e = new Manager();
		e.info();
		
		Employee e1 = new Employee();
		e1.info();
	}

}
