package com.Collections.Vectors;

import java.util.*;

public class VectorProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("1");
		v.add("3");
		v.add("2");
		v.add("5");
		v.add("4");
		System.out.println(v);
		Collections.sort(v);
		System.out.println("Vector elements after sorting in ascending order:");
		for(int i=0;i<v.size();i++)
			System.out.print(v.get(i)+" ");
	}

}
