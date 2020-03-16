package com.Collections.HashSet;

import java.util.HashSet;
public class HashSetProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		
		System.out.println("Is HashSet empty? "+hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		
		System.out.println("Size of Hashset: "+hs.size());
		System.out.println("Does HasSet contains 'first' element? "+hs.contains("first"));
	}

}
