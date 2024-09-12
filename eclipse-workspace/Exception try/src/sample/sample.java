package sample;

public class sample {
	
	public void emp()  {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
//			String name = null;
//			name.equals(0);
		}
		
		catch (ArithmeticException e) {
			System.out.println("EeeeE");
		}
		catch (Exception e) { 
			System.out.println("a+b");
		}
		finally  { 
	   System.out.println("finally");
		}
}
	public static void main(String[] args) {
     sample s = new sample();
     s.emp();
	}

}
