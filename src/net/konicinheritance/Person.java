package net.konicinheritance;

public class Person {

	 public String name;
	 private int age;
	 
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 protected void talk() {
		 System.out.println("Person can talk");
	 }

}
