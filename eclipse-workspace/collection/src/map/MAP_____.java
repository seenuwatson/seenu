package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAP_____ {
	
	public static void main(String[] args) {
		
	
	Map s =new HashMap();
	s.put("seenu", 456);
	s.put("ajith", 789);
	s.put("KANNAN", 123);
	s.put("kannan", 123);
	s.put("meena", 123);
	System.out.println(s);
	System.out.println("******");
	
	for( Object num:s.values()) {
		System.out.println(num);
		
	}
	
	System.out.println(s.size());
	
	System.out.println(s.containsKey("kannan"));
	System.out.println(s.containsValue(123));
	System.out.println(s.keySet());
	System.out.println(s.entrySet());
	System.out.println(s.values());
	
	Map s1 =new HashMap();
	s1.putAll(s);
	System.out.println(s1);
	System.out.println(s);
	s1.clear();
	System.out.println(s1);
	
		Iterator iterator = s.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		for (Object string : s.entrySet()) {
			System.out.println(string);
			
		}
		System.out.println("&&&&&&&&&");
		  Iterator iterator2 = s.keySet().iterator();
		  Iterator iterator3 = s.values().iterator();
		  while (iterator2.hasNext()) {
			  while (iterator3.hasNext()) {
				  Object key = iterator2.next();
				  Object value = iterator3.next();
				 System.out.println(key+"="+value);
			//	System.out.println(iterator2.next()+"\n"+iterator3.next());
			
			
			 
			 
			
		}}
	
  	}
		
		
		
	
		
		
		
		
		
		
		
		
		
			
}
