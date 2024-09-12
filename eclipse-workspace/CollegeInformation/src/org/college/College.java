package org.college;

public class College  {
	public void collegeName() {
		System.out.println("americal college");
	}
	
	
	public static void main (String[]args) {
		
		College san=new College();
		san.collegeName();
		Department san2=new Department();
		san2.deptName();
		Hostel san3=new Hostel();
		san3.hostelName();
		Student san4=new Student();
		san4.studentName();
		
	}
}
