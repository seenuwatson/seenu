package constructor;

public class methodOver {         // methodOverloading constructor
	
	methodOver(){
		System.out.println("default");
		
	}
	methodOver(int  a , int b){
		System.out.println(a+b);
		
	}
	methodOver(int a, long ph){
		System.out.println(a +"\n"+ ph);
		
	}
	public static void main(String[] args) {
		methodOver s =new methodOver();
		methodOver s1=new methodOver(40, 50);
		methodOver s2= new methodOver(50 , 9994816808l);
//		new methodOver();
//		new methodOver(40, 50);
//		new methodOver(50 , 9994816808l);
	}

}
