package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckIntEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[]{27,0,0};
		int y[] = new int[]{27,78,1023};
		
		int m[] = new int[]{27,1,4};
		int n[] = new int[]{27,1,4};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two int arrays equal ?:"+b);
		System.out.println("Are two int arrays equal ?:"+a);
	}

}
