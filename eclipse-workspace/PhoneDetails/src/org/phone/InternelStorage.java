package org.phone;

public class InternelStorage extends ExternalStorage  {  //child
	public void processorName() {
		System.out.println("intel");	}
	
	public void ramSize() {
		System.out.println("56gb");
	}
           
	public static void main (String[] args) {
		InternelStorage san=new InternelStorage ();
		san.processorName();
		san.ramSize();
		san.size();
	}
}
