package org.string;

public class Stringbuffer {
	public static void main(String[] args) throws InterruptedException {
		StringBuffer s=new StringBuffer("seenu");
		s.reverse();
		System.out.println(s);
		
	    StringBuffer s1 =new StringBuffer("seenivasan");
	    s1.replace(5, 10, "watson");
	    System.out.println(s1);
	    char  charAt = s1.charAt(3);
	    System.out.println(charAt);
	    
	    int hashCode = s1.hashCode();
	    System.out.println(hashCode);
	    int length = s1.length();
	    System.out.println(length);
	     
	    
	    s1.delete(0, 5);
	    System.out.println(s1);
	    
	    StringBuffer append = s1.append("seenu");
	    System.out.println(append);
	    StringBuffer delete = s1.delete(0, 2);
	    System.out.println(delete);
	}

}
