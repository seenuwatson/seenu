package day2task_scanner;

import java.util.Scanner;

public class empDetails {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String name=scan.nextLine();
		boolean equals = name.equals("seenu");
		System.out.println(equals);
		
		char charAt = name.charAt(4);
		System.out.println(charAt);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		

		int nextInt = scan.nextInt();
		System.out.println("empId is :"+nextInt);
		
		 scan.nextLine();
		 
		String nextLine = scan.nextLine();
		System.out.println("empName is :"+ nextLine);
		
		String next = scan.next();
		System.out.println("empEmali is :"+next);
		
		long nextLong = scan.nextLong();
		System.out.println("empPhoneNO is :"+nextLong);
		
		float nextFloat = scan.nextFloat();
		System.out.println("epmSalary is :"+nextFloat);
		 
		String next2 = scan.next();
		System.out.println("empGender is :"+next2);
		
		 scan.nextLine();
		 
		String nextLine2 = scan.nextLine();
		System.out.println("empCity is :"+nextLine2);
	}}