package arraylist;

import java.util.LinkedList;



public class linkedlist {
	public static void main(String[] args) {
		 LinkedList <Integer> s = new LinkedList<Integer> ();
		 s.add(1);
		 s.add(2);
		 s.add(3);
		 s.add(4);
//		 s.add("seenu");
		 
		System.out.println(s);
		
		boolean contains = s.contains(0);
		System.out.println(contains);
		
		
		 s.add(4, 5);
		 System.out.println(s);
		 
		 s.add(5, 6);
		
		 int  indexof = s.indexOf(2);
		 System.out.println(indexof);
		 
		s.addFirst(0);
		System.out.println(s);
		
		s.addLast(7);
		System.out.println(s);
		
		
		int lastIndexOf = s.lastIndexOf(5);
		System.out.println(lastIndexOf);
		
		s.set(1, 2);
		System.out.println(s);
		System.out.println("**************");
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		for (Integer a : s) {
			System.out.println(s.get(a));
			
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
	   int f=0;
		while (f <s.size()) {
			System.out.println(s.get(f));
			f++;
		}
		
		
		
		
		
	}

}
