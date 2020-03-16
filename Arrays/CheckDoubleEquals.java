package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckDoubleEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = new double[]{10.3329, 23.4553, 3.1415};
		double y[] = new double[]{10.3329, 23.4553, 3.1415};
		
		double m[] = new double[]{};
		double n[] = new double[]{};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two double arrays equal ?:"+b);
		System.out.println("Are two double arrays equal ?:"+a);
	}

}
