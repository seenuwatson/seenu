package day2task_scanner;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int nextInt = scan.nextInt();
		System.out.println("studentId is :"+nextInt);
		
		 scan.nextLine();
		 
		String nextLine = scan.nextLine();
		System.out.println("studentName is :"+ nextLine);
		
		String next = scan.next();
		System.out.println("studentEmali is :"+next);
		
		long nextLong = scan.nextLong();
		System.out.println("studentPhoneNO is :"+nextLong);
	
		scan.nextLine();
		
		String nextLine1 = scan.nextLine();
		System.out.println("studentDept is :"+nextLine1);
		 
		String next2 = scan.next();
		System.out.println("studentGender is :"+next2);
		
		
		 
		String nextLine2 = scan.next();
		System.out.println("studentCity is :"+nextLine2);
		
	}

}
