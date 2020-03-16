package com.Collections.HashTable;

import java.util.Hashtable;
import java.util.Set;

public class HashTableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "First Inserted");
		ht.put("second", "Second Inserted");
		ht.put("third", "Third Inserted");
		System.out.println(ht);
		
		Set<String> keys = ht.keySet();
		for(String key: keys)
			System.out.println("Value of "+key+" is "+ht.get(key));
	}

}
