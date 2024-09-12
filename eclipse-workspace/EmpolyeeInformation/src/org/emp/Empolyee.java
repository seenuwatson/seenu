package org.emp;
 
     import org.clinent.*;
     import org.company.*;
     import org.project.*;

public class Empolyee {
	public void emp() {
		System.out.println("seenu");
	}
	
	public static void main (String[]args) {
		
		Empolyee as=new Empolyee();
		 as.emp();
		 
		Company as2=new Company();
			as2.companyName();
		
		Project as3=new Project();
		  as3.projectName();
		  
		  Client as4=new Client();
		  as4.clientName();
	}
}
