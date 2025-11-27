package net.konic.corejava.Switch;

public class SkipEmail {
	public static void main(String[] args) {
		String[] email= {"a@gmail.com","abc","test@yahoo.com"};
		          
	    for(String mail : email) {
	    	   if(mail == "abc") {
	    		   continue;
	    	   }
	    	System.out.println(mail);
	    }
	  }
	
	}

