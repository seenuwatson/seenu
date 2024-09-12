package constructor;

public class day5task1 {  
	
	
	
	 day5task1 () {
		this ("seenu");
		System.out.println("Default constructot");
	}
     day5task1 (int id) {
    	 this (3456.5678f);
    	
		System.out.println(id);
		
	}
	 day5task1 (String name ) {
		this (12);
		System.out.println(name);
	}
	 day5task1 (float sal) {
		
		System.out.println(sal);
	}

	public static void main(String[] args) {
		day5task1 a =new day5task1();
		
		
	}
}
