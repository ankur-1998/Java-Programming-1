package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckLongEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x[] = new long[]{314159265,271828182};
		long y[] = new long[]{314159265,271828182};
		
		long m[] = new long[]{};
		long n[] = new long[]{};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two long arrays equal ?:"+b);
		System.out.println("Are two long arrays equal ?:"+a);
	}

}
