package org.single_inheritance;

public class  staff extends studentDetail {             // child
	
	public void staffName() {
		System.out.println("ajith");
	}

	public static void main(String[] args) {
		staff san=new staff();
       san.staffName();
       san.studentName();
       san.studentId();
	}
	
	
	
}
