package org.loop;

public class Test_1 {
	public static void main (String []args) {
           //1          //2
		for(int a =1; a<=10; a++) {
			
			int count = 0;
			
		for (int b =a; b>=1;b--)	{
			
			if (a %  b==0)
				
				count = count + 1;
		}
		if (count ==2 )
	      System.out.println(a);
		}
				
	}
}               