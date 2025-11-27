package net.konicinheritance;

public class TestVehicle {
public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.breaks();
		
		Car c = new Car();
		c.breaks();
		
		Bike b = new Bike();
		b.breaks();
		
		Vehicle v1 = new Car();
		v1.breaks();
		
		Vehicle v2 = new Bike();
		v2.breaks();
		
	
		
	}


}
