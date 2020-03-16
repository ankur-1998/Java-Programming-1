package com.Collections.HashMap;

import java.util.HashMap;

public class HashMapProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "First Inserted");
		hm.put("second", "Second Inserted");
		hm.put("third", "Third Inserted");
		System.out.println(hm);
		
		System.out.println("Value of second: "+hm.get("second"));
		System.out.println("Is HashMap empty? "+hm.isEmpty());
		hm.remove("third");
		
		System.out.println(hm);
		System.out.println("Size of HashMap: "+hm.size());
	}

}
