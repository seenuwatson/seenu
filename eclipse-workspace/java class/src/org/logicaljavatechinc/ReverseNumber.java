package org.logicaljavatechinc;

public class ReverseNumber {
	public static void main(String[] args) {
		
	
		int normalNumber = 7890;
		int reverseNumber=0;
		while (normalNumber !=0) {
			
		reverseNumber=reverseNumber*10;
		reverseNumber=reverseNumber+normalNumber%10;
		normalNumber=normalNumber/10;
		}
		System.out.println("reverseNumber"+ reverseNumber);
}
}