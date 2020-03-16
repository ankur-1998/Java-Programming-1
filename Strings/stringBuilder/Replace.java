package com.stringBuilder;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("SRM University");
		System.out.println("String: "+stb);
		
		stb.replace(4, stb.length()-1, "Institute of Science and Technology");
		System.out.println("After replacing: "+stb);
	}

}
