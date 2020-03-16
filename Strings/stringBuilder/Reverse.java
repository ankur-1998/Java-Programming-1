package com.stringBuilder;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("Chennai");
		System.out.println("String = "+stb);
		
		System.out.println("reverse = "+stb.reverse());
		
		stb = new StringBuilder("EYE");
		System.out.println("String = "+stb);
		
		System.out.println("reverse = "+stb.reverse());
		
	}

}
