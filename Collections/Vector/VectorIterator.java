package com.Collections.Vectors;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		System.out.println("Getting elements of Vector:");
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
	}

}
