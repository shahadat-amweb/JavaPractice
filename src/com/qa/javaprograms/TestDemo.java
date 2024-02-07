package com.qa.javaprograms;

public class TestDemo {

	public static void main(String[] args) {
		String name = "shaan";
		String sname = "khan";
		
		String fullname = name+sname;
		
		System.out.println(fullname);
		name = fullname.substring(name.length());
		System.out.println(name);
		
		System.out.println(fullname.substring(0,name.length()+1));
	}
}