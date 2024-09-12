package com.surya;

import java.util.ArrayList;
import java.util.List;

public class collectionsClass {

	public static void main(String[] args) {
		//collections();
		//list
		 List li =new ArrayList();
		 li.add(45);
		 li.add(65789.08099f);
		 li.add("seenu");
		 li.add(99948168l);
		 li.add("selenium");
		 li.add(45);
		 li.add(null);
		 System.out.println(li);
		
		 //size
		 int size=li.size();
		 System.out.println(size);
		 //remove
		 li.remove(3);
		 System.out.println(li);
		 //get
		 Object object=li.get(3);
		 System.out.println(object);
		
		//add(index , values)
		 li.add( 0 , "selenium");
		 System.out.println(li);
		 
		 //set(index , values)
		 li.set(2,"seenivasan");
		 System.out.println(li);
		 
		 //contains
		boolean contions = li.contains(45);
		System.out.println(contions);
		 
		//index of
		int intexof=li.indexOf(45);
		System.out.println(intexof);
		
		//last index of 
		int lastindexof =li.lastIndexOf(45);
		System.out.println(lastindexof);
		//clear
//		li.clear();
//		System.out.println(li);
		
		List l=new ArrayList();
		System.out.println(l);
		
		//add all
		l.addAll(li);
		System.out.println(l);
		
		l.retainAll(li);
		System.out.println(l);
		
		l.removeAll(li);
		System.out.println(l);
	

	}
}
