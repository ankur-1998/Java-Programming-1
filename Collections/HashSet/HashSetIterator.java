package com.Collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("Second");
		hs.add("third");
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
