package com.stringBuilder;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("SRM Institute of Science and Technology");
		System.out.println("String: "+stb);
		stb.delete(2,3);
		System.out.println("After deletion = "+stb);
	}

}
