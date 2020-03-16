package com.stringBuilder;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("Java Program");
		System.out.println("String = "+stb);
		
		System.out.println("Last index of (a) = "+stb.lastIndexOf("a"));
		
		System.out.println("Last index of (va) = "+stb.lastIndexOf("va"));
		
		System.out.println("last index of (av) = "+stb.lastIndexOf("av"));
	}

}
