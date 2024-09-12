package set;

import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<Integer>();
//		s.add("seenu");
//		s.add("ajith");
//		s.add("ajith");
//		s.add("KANNAN");
//		s.add("MEENA");
//		s.add("A");
//		s.add(null);
//		s.add(1);
//		s.add(1);
//		
		s.add(56);
		s.add(41);
		s.add(2);
		s.add(8);
		s.add(10);
		s.add(8);
		//s.add("A");
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		System.out.println("***************");
		for (Object san : s) {
			System.out.println(san);
			
		}
		System.out.println("***************8");
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
