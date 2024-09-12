package try_static;

public class staticKeyword {
	static String collegeName = "greens ";

	public void studentDetails1() {
		 String name="seenu";
	     int id = 567;
		System.out.println("studentDetails1");
		System.out.println(name +"\n"+id+"\n"+collegeName );
	}
	public   void studentDetails2(String name , int id ) {
		System.out.println("studentDetails2");
		System.out.println(name+"\n"+id+"\n"+collegeName);
		
	}
	public static void main(String[] args) {
		
//		
//		System.out.println(collegeName);                    // without object
//		
//		staticKeyword ss=new staticKeyword();
//		System.out.println(ss.collegeName);                // with object
//		
//		System.out.println(staticKeyword.collegeName);      //with class name
		
		staticKeyword s=new staticKeyword();
		s.studentDetails1();
		s.studentDetails2("ajith", 568);
	}
}
