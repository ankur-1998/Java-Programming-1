package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckBooleanEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[]{true,false,false};
		boolean y[] = new boolean[]{true,true,false};
		
		boolean m[] = new boolean[]{};
		boolean n[] = new boolean[]{};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two boolean arrays equal ?:"+b);
		System.out.println("Are two boolean arrays equal ?:"+a);
	}

}
