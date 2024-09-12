package org.emp;

public class Employee {  
	
	public void empId() {
		System.out.println("45678");
	}
  public void empName() {
	  System.out.println("seeni vasan");
  }
   private void empDob() {
	   System.out.println("04.03.2000");
   }
   private void empPhone() {
	   System.out.println("9994816808");
   }
   public void empEmail () {
	   System.out.println("seeniwatson4320@mail.com");
   }
    private void empAdress() {
    	System.out.print("madurai");
    }
    
    public static void main(String[]args ) {
    	Employee san=new Employee();
    		san.empId();
    		san.empName();
    		san.empDob();
    		san.empPhone();
    		san.empEmail();
    		san.empAdress();
    		
    }
}
