package org.loop;

public class berakLoop {

	public static void main(String[] args) {
		
		for ( int a=1 ; a<10 ; a++) {
			if (a ==  4) { // break means a=4  console print 1 2 3 and stop the print or a= 5 console  1 2 3 4 and stop the print
				break;
			}
			System.out.println(a);
		}
	}

}
