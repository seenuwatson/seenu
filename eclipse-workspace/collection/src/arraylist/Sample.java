package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
	
	  List <String> li=new ArrayList<String>();
	  li.add("seenu");
//	  li.add(45);
//	  li.add(99948949898l);
	  li.add("ajith");
	  li.add("kannan");
	  li.add("meena");
	   
	  
	  System.out.println(li);
	  Object remove = li.remove(2);
	  System.out.println(remove);
	  
	  int size = li.size();
	 System.out.println(size);
	 
	 li.add("deeika")	;
	 System.out.println(li);
	 
	li.set(1, "santhiya");
	 System.out.println(li);
	 
	 boolean contains = li.contains("seenu");
	 System.out.println(contains);
	 
	
//	 Object object = li.get(5);
//	 System.out.println(object);
	 
	 System.out.println(li.indexOf("ajith"));
	 
	 int indexOf = li.lastIndexOf("seenu");
	 System.out.println(indexOf);
	 System.out.println(" for loop");
//	li.removeAll(li);
//	System.out.println(li);
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	 System.out.println("for each");
	 for (String li2 : li) {
		 System.out.println(li2);
	}
	System.out.println("********************");
	 for (int a = 2; a < li.size(); a++) {
		 System.out.println(li.get(a));
		
	}
	 
	 
	 
	 
	 
	 
	 
	
  List lil=new ArrayList();	

    lil.addAll(li);
    System.out.println(lil);
    
    lil.retainAll(li);
    System.out.println(lil);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
    for (int i = 0; i < lil.size(); i++) {
    	System.out.println(lil.get(i));}
    	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    	
    	
    	
    	for (int e = 0; e < li.size(); e++) {
    		for (int f = 0; f < li.size(); f++) {
    			System.out.println(li.get(f));
			}
			System.out.println(li.get(e));
		}
    
}}   
