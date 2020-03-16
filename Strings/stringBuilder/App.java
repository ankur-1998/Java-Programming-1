package com.stringBuilder;

public class App {
	public static void main(String args[]){
		
		StringBuilder stb = new StringBuilder("Ankur");
		System.out.println("String: "+stb);
		
		stb.append("Ankit");
		System.out.println("After append: "+stb);
		
		stb = new StringBuilder("XYZ");
		System.out.println("String = "+stb);
		
		stb.append("*****%%%%");
		System.out.println("After append: "+stb);
	}
}
