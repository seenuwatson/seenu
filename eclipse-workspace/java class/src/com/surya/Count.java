package com.surya;

public class Count {

	private static final int i = 0;

	public static void main(String[] args) {
		String s="SELenium123";
		int upper=0;
		int lower=0;
		int number=0;
		for (int i=0; i<s.length(); i++);{
			char c=s.charAt(i);
			if
			(c>='A' && c<= 'Z') upper++;
			
			else if
			(c>='a' && c<='z') lower++;
			
			else if 
			(c>='0' && c<='9') number++;
		}
		System.out.println(upper & lower & number);

	}

}
