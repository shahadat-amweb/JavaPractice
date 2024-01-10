package com.qa.javaprograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "name";//0 1 2  3
		char[] sChar = s.toCharArray();
		char[] sChar1=new char[2] ;
		char[] sChar2=new char[4] ;
		
		for(int i=0;i<2;i++) {
			sChar1[i]=sChar[i];
		}
		for(int i=2;i<4;i++) {
			sChar2[i]=sChar[i];
		}
		
		String s1= new String(sChar1);
		//System.out.println(s1);
		
		String s2= new String(sChar2);
		//System.out.println(s2.trim());
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.print( sb1.reverse());
		
		String s22 = s2.trim();
		StringBuffer sb2 = new StringBuffer(s22);
		
		System.out.println(sb2.reverse());

	}

}
