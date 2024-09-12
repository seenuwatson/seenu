
package org.polymorhism;

public class polymorphism{
	// arguments based on different data type
	public void seenuName(String name) {
		System.out.println(name);
	}
	public void seenuName(int id) {
		System.out.println(id);
	}
	//arguments based on different count
	public void seenuName(String name , long phone) {
		System.out.println(name+"\n"+phone);
	}
	public void seenuName(int id , float salary) {
		System.out.println(id+"\n"+salary);
	}
	//arguments based on different order
	public void seenuName(long phone , String name) {
		System.out.println(phone+"\n"+name);
	}
	public void seenuName(float salary , int id) {
		System.out.println(salary+"\n"+id);
	}
	   public void seenuName(byte sss , byte ooo) {
		   System.out.println(sss+ooo);
	   }
	public static void main(String [] argm) {
		polymorphism san=new polymorphism();
		
		san.seenuName("seeni");
		san.seenuName(777);
		san.seenuName("ajith" , 999486808l);
		san.seenuName(190 ,6768888.6477f);
		san.seenuName(99948168008l , "santhiya");
		san.seenuName(63376474764.7748474f ,785);
		san.seenuName(65+55);
  }
}