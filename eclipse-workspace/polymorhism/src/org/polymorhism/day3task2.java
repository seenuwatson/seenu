package org.polymorhism;

public class day3task2 {
	public void empId(int a , int b) {
		System.out.println("add"+a+b);
	}
	public void empId(byte a) {
		System.out.println("empid"+a);
	}
	public void empId(long a) {
		System.out.println("number"+a);
	}
	
	public void empId(float a) {
		System.out.println("salary"+a);
	}
	
	
	public static void main(String[] args) {
		day3task2 s=new day3task2();
		s.empId(30,40);
		s.empId(78);
		s.empId(9994816808l);
		s.empId(58738.878f);
		
		
	}
	
	
	
	
	
	
	
}
