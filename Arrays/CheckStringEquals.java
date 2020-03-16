package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[] = new String[]{"ram", "shyam"};
		String y[] = new String[]{"ram", "kumar"};
		
		String m[] = new String[]{null};
		String n[] = new String[]{null};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two string arrays equal ?:"+b);
		System.out.println("Are two string arrays equal ?:"+a);
	}

}
