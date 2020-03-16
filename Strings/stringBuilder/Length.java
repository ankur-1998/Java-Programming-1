package com.stringBuilder;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("Om Namo Narayana");
		System.out.println("String builder length = "+stb.length());
		
		stb = new StringBuilder("");
		System.out.println("String builder length = "+stb.length());
	}

}
