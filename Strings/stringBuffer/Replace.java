package com.stringBuffer;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("High Cost");
		System.out.println("Original Text: "+sb);
		
		sb.replace(0, 4, "Low");
		System.out.println("Updated Text: "+sb);
	}

}
