package day2task_scanner;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in); 
	
	int nextInt = scan.nextInt();
	System.out.println("studentId is :"+nextInt);

	
	String next = scan.next();
	System.out.println("studentName is ;"+next);
	
	float mark1 = scan.nextInt();
	float mark2 = scan.nextInt();
	float mark3 = scan.nextInt();
	float mark4 = scan.nextInt();
    float mark5 = scan.nextInt();
     float avg = mark1 + mark2+mark3+mark4+mark5 ;
     System.out.println(avg/500*100);
     
	


}}
