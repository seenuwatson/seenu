package org.string;

public class StringExample {

	public static void main(String[] args) {
		String name = "seenivasan";
	    String	name1 ="seenivasan";
	    
	    boolean equals2 = name.equals(name1);
	    System.out.println(equals2);
		
		 int length = name.length();
		 System.out.println(length);	 
		
		//charAt
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(1));
		
		//index 
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf('n'));
		
		//last index of
		System.out.println(name.lastIndexOf('S'));
		System.out.println(name.lastIndexOf('s'));
		
		//to lower case
		System.out.println(name.toLowerCase());
		
		//upper case
		System.out.println(name.toUpperCase());
		
		//charter replace
		String replace = name.replace("se", "SE");
		System.out.println(replace);
		
		String replaceAll = name.replaceAll("vasan", "watson");
		System.out.println(replaceAll);
		
		//boolean
		boolean empty = name.isEmpty();
		System.out.println( empty);
		
		boolean startsWith = name.startsWith("seeni");
		System.out.println(startsWith);
		
		boolean endsWith = name.endsWith("san");
		System.out.println(endsWith);
		
		boolean contains = name.contains("eeniva");
		System.out.println(contains);
		
		 boolean equals = name.equals("seenivasan");
		 System.out.println(equals);
		
	    boolean equalsIgnoreCase = name.equalsIgnoreCase("SEENIvasan");
	    System.out.println(equalsIgnoreCase);

	}

}
