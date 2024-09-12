package try_static;

public class demo {
	public static  void show1() {
		System.out.println("kanguva");
	}
	public static void show2() {
		show1();
	}
	public static void main(String[] args) {
		demo s=new demo();
		s.show2();
	}

}
