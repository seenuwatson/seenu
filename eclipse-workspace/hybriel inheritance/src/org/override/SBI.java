package org.override;

public class SBI extends HDFC {  //child
                          
	@Override
	public void fixed() {
		
		super.fixed();
		System.out.println("75");
	}
	 public void saving() {
	    	System.out.println("70"); 
	    	super.deposit();
	 }
	 public void deposit() {
		 System.out.println("90");
	 }
	 
		public static void main (String []args) {
		SBI san=new SBI();
		san.saving();
		san.deposit();
		san.fixed();
			
	}
}
     //super - keyword 
     //parent class method directly call 
     //super keyword we are using method level
     //super.parent methoudname();