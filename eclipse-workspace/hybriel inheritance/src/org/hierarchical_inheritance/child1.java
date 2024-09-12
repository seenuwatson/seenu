package org.hierarchical_inheritance;

public class child1 extends parant {
	
	public void child1Name() {
		System.out.println("seenu");
	}
	public static void main(String [] argm) {
		child1 san=new child1();
		san.child1Name();
		san.parantName();
	}
}
