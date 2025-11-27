package net.konicinheritance;

public class TestAbstract {

	    public static void main(String[] args) {
			
	    	Nokia n = new Nokia();
	    	n.answerCall();
	    	
	    	Calc c= new Nokia();
	    	int x =10;
	    	int y =29;
	    	int z = c.sum(x, y);
	    	System.out.println(z);
	   
	  
	    	Phone p = new Nokia();
	    	p.answerCall();
	    	
	    	Camera cr=new Nokia();
	    	cr.takePictures();
	    	
	    	Mobile m= new Nokia();
	    	m.rejectCall();
	    	m.processing();
	   
		}

}
