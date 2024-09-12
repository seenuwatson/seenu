package try_static;

public  class sample2 extends sample{
	
	
	public  void method () {
		System.out.println("seenu"+id);
	}
	
	public static void main(String[] args) {
		
		sample2 a=new sample2();
		a.method();
//		sample2.method();
//		method();
	
}
}