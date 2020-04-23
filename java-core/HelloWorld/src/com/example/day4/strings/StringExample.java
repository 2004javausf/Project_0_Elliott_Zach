package com.example.day4.strings;

public class StringExample {

	public static void main(String[] args) {
		
		String s = "   this is a String   ";
		String s5 = "this is a String---";
//		String s1 = new String("This is a String object");
//
//		//Concat
//		String s3;
//		s3 = s.concat(" XD");
//		System.out.println(s3);
//		s += " This is shorthand concat";
//		System.out.println(s);
//		
//		String s4 = "";
//		s4 += "hi";
//		System.out.println(s4);
		
		//Substring (the end index is non inclusive
		//s = s.substring(s.length()/2, s.length());
		//System.out.println(s);
		
		//Casing
		//s = s.toUpperCase();
		//System.out.println(s);
		//s = s.toLowerCase();
//		System.out.println(s);
//		s5 = s5.replaceAll("[-]", "");
//		s = s.trim();
//		System.out.println(s);
//		String[] strAry = s5.split(" ");
//		
//		System.out.println(strAry.length);
//		System.out.println(strAry[3]);
		
		//escape character add special functionality inside like \n \t there are more google them if needed
		String s4 = "Power\nade";
		String s6 = "Power\tade";
		//System.out.println(s4);
		//System.out.println(s6);
		
		//sysout concat
		//System.out.println(7 + s + 7);
		
		/////StringBuilder is mutable 
		//StringBuilder is not thread safe
		
		StringBuilder sb = new StringBuilder("Hello From");
		sb.append(" the other siiiiiiide~~~~~");
		System.out.println(sb);
		
		//StringBuffer is mutable 
		//StringBuffer is thread safe (aka its synchronized)
		StringBuffer sBuff = new StringBuffer("Walter");
		sBuff.append(" White");
		System.out.println(sBuff);
	}

}
