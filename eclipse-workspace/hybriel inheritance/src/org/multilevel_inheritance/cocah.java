package org.multilevel_inheritance;

public class cocah extends bowler {             //child

	 public void cocahName() {
		System.out.println("mathew") ;
	 }
	 public void cocahNumber() {
		 System.out.println("18");
	 }
	 
	 public void cocahId() {
		 System.out.println("9767");
	
	 }
	 public static void main(String [] argm) {
		 cocah san=new cocah();
		 san.cocahName();
		 san.cocahNumber();
		 san.batmanName();
		 san.batmanNumber();
		 san.bowlerName();
		 san.bowlerNumber();
		 
	 }
}