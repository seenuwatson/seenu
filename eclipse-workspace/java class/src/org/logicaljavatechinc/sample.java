package org.logicaljavatechinc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class sample{
	public void method () {
		String name ="seenu";
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		StringBuffer reverse = buffer.reverse();
		System.out.println(reverse);
	}
	public void method2() {
		String name="kannan";
		char[] charArray = name.toCharArray();
		String reverse="";
		
	 for (int i=charArray.length-1; i>=0;i--) {
		reverse=reverse+charArray[i];	
	 }
	 System.out.println(reverse);
	 }
	
	public void method3() {
		String name="deepika";
		String reverse="";
		char[] charArray = name.toCharArray();
		
		List list=new ArrayList<>();
		
		for (Character x : charArray) {
			list.add(x);
		}
		Collections.reverse(list);
		ListIterator listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			reverse=reverse+listIterator.next();
		}
		System.out.println(reverse);
	}
	 
	public void swap1() {
		int a= 10000;
		int b = 20000;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("*****"+a+"*******"+b);		
	}
	public void swap2() {
		int a=40000;
		int b=60000;
		a=a-b;
		b=b+a;
		a=b-a;
		System.out.println(a+"     "+b);
	}
		public void swap3(){
			int a= 500;
			int b= 900;
			
			a=a*b;
			b=a/b;
			a=a/b;
			System.out.println("a=="+a+"   "+"  b=="+b);
		}
		
		public void reverseNumber() {
			
			int a=9876;
		   int b=0;
		while (a!=0) {
			b=b*10;
			b=b+a%10;
			a=a/10;
		}
			System.out.println("reverseNumber"+b);
		}
		
	
	
	public static void main (String[]args) {
		sample san=new sample();
		san.method();
		san.method2();
        san.method3();
		san.swap1();
		san.swap2();
		san.swap3();
		san.reverseNumber();
		
	}
	
}