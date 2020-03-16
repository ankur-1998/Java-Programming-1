package com.stringBuilder;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("Ankur");
		System.out.println("String: "+stb);
		
		stb.insert(5, "Ankit");
		
		System.out.println("After insertion = "+stb);
		//System.out.println(stb.toString());
	}

}
