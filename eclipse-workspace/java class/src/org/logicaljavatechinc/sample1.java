package org.logicaljavatechinc;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class sample1 { 
	public static void main(String[] args) {
		String name ="seenu";
		char[] charArray = name.toCharArray();
     List list =new ArrayList<>();
		
		for (Object object : charArray) {
		list.add(object);	
		}
		//Collections.reverse(list);
		ListIterator listIterator = list.listIterator();
		for (int i = 0; i < charArray.length; i++) {
			
		for (int j = 0; j < charArray.length; j++) {
			
			while (listIterator.hasNext()) {
				System.out.println(listIterator.toString());
				}
		//	charArray.length++;
		}
			System.out.println();
		}
		
		
	}
	
	
	
	

}
