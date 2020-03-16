package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckCharEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x[] = new char[]{'d','h','r','f'};
		char y[] = new char[]{'d','h','r','f'};
		
		char m[] = new char[]{'p','h','r','f'};
		char n[] = new char[]{'d','q','r','f'};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two char arrays equal ?:"+b);
		System.out.println("Are two char arrays equal ?:"+a);
	}

}
