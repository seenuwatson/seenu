package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
       // insertion order is preserved
       // duplicates is not allowed
public class linkedset {
	public static void main(String[] args) {
		Set<Comparable> s=new LinkedHashSet<>();
		
		s.add("seenu");
		s.add("ajith");
		s.add("ajith");
		s.add("KANNAN");
		s.add("MEENA");
		s.add(null);
		s.add(1);
		s.add(1);
		s.add(null);
	//	s.remove(1); //////////
		
		System.out.println(s);
		
		
		s.add("depika");
		System.out.println(s);
		
		Iterator<Comparable> iterator = s.iterator();
		while (iterator.hasNext()) {
			Comparable next = iterator.next();
			System.out.println(next);
		}
		
	}

}
