package try_super;

class parent{
		parent(int num) {
		System.out.println("paremt amount :"+num);
	}
		void seenu() {
			System.out.println("deepika");
		}
}
class child extends parent{
	int a=300;
	 child() {
		 super(78);
		super.seenu();
		System.out.println("child amount :"+a);   // if went parent variable use  in use the super keyword
		
	}	
}

public class variable {
	public static void main(String[] args) {
		child s=new child();
		s.seenu();
		
	
	}}
