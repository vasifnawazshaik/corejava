package net.konicinheritance;

public class Dog extends Animal {
	public void bark() {
		System.out.println("Dog can bark");
	}
	public void eat() {
		System.out.println("dog can eat");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.bark();
	}

}
