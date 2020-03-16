package com.stringBuilder;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("Java Programming");
		System.out.println("String = "+stb);
		
		System.out.println("Index of Substring(gra) = "+stb.indexOf("gra"));
		
		System.out.println("Index of Substring(age) = "+stb.indexOf("age"));
	}

}
