package net.konicinheritance;

public abstract class Mobile implements Camera,Phone,Calc {
	
	public abstract void processing();

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}

	@Override
	public void answerCall() {
		System.out.println("this is answer button");
	}

	@Override
	public void rejectCall() {
		System.out.println("this is reject button");
		
	}

	@Override
	public void takePictures() {
		System.out.println("take pictures");
	}
    
	

}
