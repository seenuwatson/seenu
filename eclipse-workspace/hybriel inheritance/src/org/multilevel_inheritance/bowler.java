package org.multilevel_inheritance;

public class bowler extends batman {              // parent
	public void bowlerName() {
		System.out.println("mark wood");
	}
     public void bowlerNumber() {
	  System.out.println("47");
	  
  }
     public static void main(String[]argm) {
    	 bowler san=new bowler();
    	 san.batmanName();
     }
}
