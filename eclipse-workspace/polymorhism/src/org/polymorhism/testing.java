package org.polymorhism;

public class testing {
	public void seenu(String name ) {
		System.out.println(name);
	}
	public void seenu(byte id , short age) {
		System.out.println(id +"\n"+ age);
	}
	public void seenu(int a , long b) {
		System.out.println(a+b);
	}
	public void seenu (double c , float d) {
		System.out.println(c+"\n"+d);
	}
	public void seenu(char name , String nickName ) {
		System.out.println(name+"\n"+nickName);
	}
	public void seenu (boolean value) {
		System.out.println(value);
	}
	
	public static void main (String [] args ) {
		testing san=new testing();
		san.seenu("seenu5");
		san.seenu(127 , 32766l);
		san.seenu(50, 50);
		san.seenu(7777 , 1111);
		san.seenu(5555.5555 , 1111.1111f);
		san.seenu('s' , "seenu");
		san.seenu(true);
		
		
	}
}
