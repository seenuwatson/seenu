package constructor;

public class constructor {
                                                           //constructor name is must same in class name
	constructor (){ // default constructor                    // constructor must not have a return type
		   System.out.println("default constructor") ;   // if any constructor not create in java automatic create constructor in run time                    
		                                                //constructor is similar type of method but it is not is method
	   }
	constructor (long ll){
	    	System.out.println(ll);   
	   }
	constructor (String name , int id){//parameterized constructor
		   System.out.println("my name is :"+ name);
		   System.out.println("my id is :"+ id);
	   }
	constructor(long phone , char nick){//parameterized constructor
		   System.out.println("my number is:"+phone);
		   System.out.println("my nick name is:"+nick);
       }
	   
	   public void compName() { //normal method
		   System.out.println("greens");
	   }
	   public void compAdd() {//normal method
		   System.out.println("chennai");
	   }

	public static void main(String[] args) {
	           new constructor();// default constructor calling
		       new constructor(999408100688l);//parameterized  constructor calling
               new constructor( "seenu " , 6778);//parameterized  constructor calling
	           new constructor(9994816808l , 's');//parameterized  constructor calling
	 constructor s =new constructor();//this is method calling create object and if you have create any default constructor automatically calling
	     s.compAdd();
	     s.compName();
	}

}
