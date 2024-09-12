package try_static;

public class static_Veriables {
	
	static  int a=1;
	public void num() {
		a++;
		
	 System.out.println(a);
		
	}
	public static void main(String[] args) {
		 static_Veriables s=new static_Veriables();
		 s.num();
		 static_Veriables s1=new static_Veriables();
		 s1.num();
		 static_Veriables s3=new static_Veriables();
		 s3.num();
	}

}
