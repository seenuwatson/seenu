package org.logicaljavatechinc;
import java.util.Scanner;
public class trianglePattern {

Scanner scanner =new Scanner(System.in);
	public void method1() {

		int numberofPattern=3;
		
		int row , colume=0;
		
		for (row=0 ; row<=numberofPattern;row++) {
			
			for (colume =0 ; colume<=row;colume++) {
				System.out.print("$");	
			}
			System.out.println();
		}}
	public void method2() {
		int startingNumber=0;
		int loopingNumber=4;
		int row ,colume=0;
		for (row =0; row<=loopingNumber;row++) {
			for (colume =0; colume<= row; colume++) {
				System.out.print(startingNumber+" ");
				startingNumber++;	
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		trianglePattern san=new trianglePattern();
		san.method1();
		san.method2();
	}
}