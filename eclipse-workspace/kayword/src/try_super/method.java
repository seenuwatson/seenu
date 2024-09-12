package try_super;

class parentss {
	
	public void payment() {
		System.out.println("paremt amount :");
	}
}
class childss extends parentss{
	
	public void payment() {
		super.payment();
		System.out.println("child amount :");
	
	}
	
	
}

public class method {
	public static void main(String[] args) {
	childss s=new childss();
	s.payment();
	
	
}}
