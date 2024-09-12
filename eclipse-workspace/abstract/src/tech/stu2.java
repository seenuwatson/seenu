package tech;

public  class stu2 implements stu{    
	
	@Override
	public void deposit() {
		System.out.println("678");
		
	}
	
    public void withdrew() { 
    	System.out.println("785");
    }
    public void deposit1() {
    	System.out.println("8867");
    }

	public static void main(String[] args) {
		stu2 n=new stu2();
		
		n.withdrew();
		n.deposit();
		n.deposit();
		
		
	}

	@Override
	public void od() {
		// TODO Auto-generated method stub
		
	}

}




