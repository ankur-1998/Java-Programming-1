package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckShortEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short x[] = new short[]{3141,27182};
		short y[] = new short[]{3141,27182};
		
		short m[] = new short[]{};
		short n[] = new short[]{};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two short arrays equal ?:"+b);
		System.out.println("Are two short arrays equal ?:"+a);
	}

}
