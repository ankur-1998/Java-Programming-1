package com.Collections.HashTable;

import java.util.Hashtable;

public class HashTableProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "First Inserted");
		ht.put("second", "Second Inserted");
		ht.put("third", "Third Inserted");
		System.out.println(ht);
		
		System.out.println("Value of second: "+ht.get("second"));
		System.out.println("Is HashTable empty? "+ht.isEmpty());
		ht.remove("third");
		
		System.out.println(ht);
		System.out.println("Size of HashTable: "+ht.size());
	}

}
