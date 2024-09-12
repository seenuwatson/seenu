package org.hierarchical_inheritance;

public class child2 extends parant{
	public void child2Name() {
		System.out.println("ajith");
	}

	
	public static void main(String [] argm) {
		child2 san=new child2();
		san.parantName();
		san.child2Name();
	}
}
