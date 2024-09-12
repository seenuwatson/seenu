package methodcalling.org;

public class method {
	int a;//instance variable
	int b;
	int c;
	method(int num1 , int num2 ,int num3){//parameter constructor
		a=num1;//local variable
		b=num2;
		c=num3;
			}
	public int addsum(int a, int b ){//declare the method 
//		int a=10;     
//		int b=30; // block of code
		int sum = a+b;
		System.out.println("the add number is "+sum);
		return sum;
	}
	public void subsum() {
		int sum = a-b;
		System.out.println("the sum number is "+sum);
	}
	 String name(String name) {
		return name;	
	}
	 public void seenu() {
		 System.out.println(a+a+a+b+b+c);
	 }	 
	public static void main(String[] args) {
		method s=new method(60 ,50 , 10);
		s.subsum(); // calling the method
		String name = s.name("seenu");
		System.out.println(name);
		
		int result = s.addsum(80,50);
		System.out.println("Additional value  "+result);
		s.seenu();
	}

}
