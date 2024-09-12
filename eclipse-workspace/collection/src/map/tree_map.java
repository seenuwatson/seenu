package map;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class tree_map {
public static void main(String[] args) {
	
	Map<Integer, String> s=new TreeMap<>();
	
	s.put(3, "csk");
	s.put(8, "mi");
	s.put(1, "rr");
	s.put(2, "RCB");
	s.put(4, "csk");
	s.put(4, "gt");
	//s.put(null," dc");

	
	
	System.out.println(s);
	
	boolean empty = s.isEmpty();System.out.println(empty);
	
	for(Map.Entry<Integer, String>entry: s.entrySet() ) {
		System.out.println(entry.getValue()+":"+entry.getKey());
	}
		System.out.println("****************");
		
		Iterator<Entry<Integer, String>> iterator = s.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next);
		}
	System.out.println("&&&&&&&&&&&&&&");
	  Iterator<Integer> iterator2 = s.keySet().iterator();
	  Iterator<String> iterator3 = s.values().iterator();
	  while (iterator2.hasNext()) {
		  while (iterator3.hasNext()) {
			  Integer next = iterator2.next();
			String string = iterator3.next();
			 System.out.println(next+"="+string);
		}
		 
	}
	  System.out.println("%%%%%%%%%%");
	  Set<Entry<Integer,String>> entrySet = s.entrySet();
	  for (Entry<Integer, String> entry : entrySet) {
		  System.out.println(entry);
		
	}
	  Set<Integer> keySet = s.keySet();
	  for (Integer integer : keySet) {
		  System.out.println(integer);
		
	}
	
	 
	
	
	
}}

