package com.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		
		al.add(1,"Inserted Element");
		al.add(2,"Siddharth");
		al.add(1,"Gautama");
		
		System.out.println("ArrayList Contains...");
		for(int i=0;i<al.size(); i++)
			System.out.println(al.get(i));
	}

}
