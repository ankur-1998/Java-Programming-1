package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		
		Vector v = new Vector();
		v.add("4");
		v.add("5");
		al.addAll(v);
		System.out.println("After appending all elements of Vector, ArrayList contains...");
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
	}

}
