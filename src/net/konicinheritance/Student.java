package net.konicinheritance;

public class Student extends Person {
	public void talk() {
		System.out.println("Student can talk");
	}
	
	
	public static void main(String[] args) {
		
	    Student s1= new Student();
	    
	    s1.name = "Huzaifa";
	    
	    s1.setAge(24);
	    
	    System.out.println("Student name : " +s1.name);
	    System.out.println("Student age " + s1.getAge());
	    
	    s1.talk();
	    
	    Person p = new Person();
	    p.talk();
	    
	    
	}    

}
