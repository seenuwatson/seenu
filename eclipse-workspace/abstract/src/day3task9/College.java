
package day3task9;

public class College extends University {
	
	public void ug(String name) {
		System.out.println("college name "+ name);
	}
	public void pg(String name) {
		System.out.println("colege name"+ name);
	}
	@Override
	public void ug() {
		System.out.println("abstract ug");
		
	}
	@Override
	public void pg() {
		System.out.println("Abstrat pg");
		
	}
   
	public static void main(String[] args) {
		College see = new College();
		see.ug("american");
		see.pg("TVS clloege");
		see.ug();
		see.pg();
		
		
	}
	
	
	
	
	
	
	
}
