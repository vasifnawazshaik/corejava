package net.konicinheritance;

public class PracticeSet {
	
	public  int sum(int m1,int m2,int m3) {
		return m1+m2+m3;
	}
	
	public float avg(int m1, int m2, int m3) {
		return (float)sum(m1,m2,m3)/3;
	}
	
	public boolean isPass(int m1, int m2, int m3) {
		if(m1>=35 &&m2>=35 &&m3>=35) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printResults(int m1, int m2, int m3) {
		System.out.println("total marks : "+sum(m1,m2,m3));
		System.out.println("avg marksb: "+avg(m1,m2,m3));
		if(isPass(m1,m2,m3)) {
			System.out.println("Student is pass");
			if(avg(m1,m2,m3)>=75) {
				System.out.println("Grade : Distinction");
			}else if(avg(m1,m2,m3)>60) {
				System.out.println("Grade : First class");
			}
			
		}
	}
}
