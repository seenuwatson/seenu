package org.samle.gtn;

public class Sample {
		public static void main(String[] args) {
			try {
				int num1=0;
				int num2=10;
				int result=num2/num1;
				System.out.println(result);
				
			}catch( ArithmeticException e) {
				System.out.println("seenu");
				
			}
			finally {
				System.out.println("finally block here");
			}
		}
}
